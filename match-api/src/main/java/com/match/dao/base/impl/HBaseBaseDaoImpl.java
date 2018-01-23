package com.match.dao.base.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.match.dao.base.HBaseBaseDao;
import com.match.dao.base.obj.HBaseQuery;
import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.client.HTableInterface;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.util.Bytes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.data.hadoop.hbase.RowMapper;
import org.springframework.data.hadoop.hbase.TableCallback;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by waii on 2017/12/18.
 */

public abstract class HBaseBaseDaoImpl<T> implements HBaseBaseDao<T>{

    private static final Logger logger = LoggerFactory.getLogger(HBaseBaseDaoImpl.class);

    @Autowired
    protected HbaseTemplate hbaseTemplate;


    /**
     * 写数据
     *
     * @param table
     * @param rowkey
     * @param family
     * @param t
     * @return
     */
    @Override
    public <T> T put(String table, final String rowkey, final String family, final T t){
        if(StringUtils.isBlank(rowkey) || t == null || family ==null){
            logger.error("{}","hbaseDao put had params null ...");
            return null;
        }
        return hbaseTemplate.execute(table,new TableCallback<T>() {
            @SuppressWarnings("deprecation")
            @Override
            public T doInTable(HTableInterface table)  {
                byte[] familyBytes = Bytes.toBytes(family);
                try {
                    byte[] rowkeyByte = rowkey.getBytes();
                    Put put = new Put(rowkeyByte);
                    Field[] fields = getEntityClass().getDeclaredFields();
                    for (Field field:fields) {
                        field.setAccessible(true);
                        String fieldName = field.getName();
                        String fieldValue = String.valueOf(field.get(t));
                        if(fieldValue != null && !fieldName.equals("rowkey")){
                            put.addColumn(familyBytes,Bytes.toBytes(fieldName),Bytes.toBytes(fieldValue));
                        }
                    }
                    table.put(put);
                } catch (Throwable e) {
                    logger.error("==> hbase get object fail> {}", rowkey);
                }
                return t;
            }
        });

    }


    @Override
    public <T> T put(HBaseQuery query,final T t) {
        String table = query.getTable();
        final String rowkey = query.getRowkey();
        final String family = query.getFamily();
        if(StringUtils.isBlank(rowkey) || t == null || family ==null){
            logger.error("{}","hbaseDao put had params null ...");
            return null;
        }
        return hbaseTemplate.execute(table,new TableCallback<T>() {
            @SuppressWarnings("deprecation")
            @Override
            public T doInTable(HTableInterface table)  {
                byte[] familyBytes = Bytes.toBytes(family);
                try {
                    byte[] rowkeyByte = rowkey.getBytes();
                    Put put = new Put(rowkeyByte);
                    Field[] fields = getEntityClass().getDeclaredFields();
                    for (Field field:fields) {
                        field.setAccessible(true);
                        String fieldName = field.getName();
                        String fieldValue = String.valueOf(field.get(t));
                        if(fieldValue != null && !fieldName.equals("rowkey")){
                            put.addColumn(familyBytes,Bytes.toBytes(fieldName),Bytes.toBytes(fieldValue));
                        }
                    }
                    table.put(put);
                } catch (Throwable e) {
                    logger.error("==> hbase get object fail> {}", rowkey);
                }
                return t;
            }
        });
    }

    /**
     * 写入某qualifier值
     *
     * @param table
     * @param rowkey
     * @param family
     * @param qualifier
     * @return
     */
    @Override
    public void putQualifier(String table, String family, String qualifier,String value,String rowkey){
        hbaseTemplate.put(table,rowkey,family,qualifier,Bytes.toBytes(value));

    }


    @Override
    public void putQualifier(HBaseQuery query) {
        hbaseTemplate.put(query.getTable(),query.getRowkey(),query.getFamily(),query.getQualifier(),Bytes.toBytes(query.getQualifierValue()));
    }

    /**
     * 通过表名和rowkey获取一行数据
     *
     * @param table
     * @param family
     * @param rowKey
     * @return
     */
    @Override
    public T get(String table, String family, final String rowKey) {
        if(StringUtils.isBlank(table) || StringUtils.isBlank(rowKey)){
            logger.error("{}","hbaseDao get had params null ...");
            return null;
        }
        return hbaseTemplate.get(table, rowKey,family, new RowMapper<T>() {
            public T mapRow(Result result, int rowNum)  {
                List<Cell> ceList = result.listCells();
                JSONObject obj = new JSONObject();
                if (ceList != null && ceList.size() > 0) {
                    for (Cell cell : ceList) {
                        obj.put(Bytes.toString(cell.getQualifierArray(), cell.getQualifierOffset(),
                                cell.getQualifierLength()),
                                Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength()));
                    }
                    obj.put("rowkey",rowKey);
                }else{
                    return null;
                }
                T item= JSON.parseObject(obj.toJSONString(), getEntityClass());
                return item;
            }
        });
    }


    @Override
    public  T getOne(HBaseQuery query) {
        final String rowkey = query.getRowkey();
        String table = query.getTable();
        if(StringUtils.isBlank(table) || StringUtils.isBlank(rowkey)){
            logger.error("{}","hbaseDao getOne had params null ...");
            return null;
        }
        return hbaseTemplate.get(query.getTable(), query.getRowkey(),query.getFamily(), new RowMapper<T>() {
            public T mapRow(Result result, int rowNum)  {
                List<Cell> ceList = result.listCells();
                JSONObject obj = new JSONObject();
                if (ceList != null && ceList.size() > 0) {
                    for (Cell cell : ceList) {
                        obj.put(Bytes.toString(cell.getQualifierArray(), cell.getQualifierOffset(),
                                cell.getQualifierLength()),
                                Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength()));
                    }
                    obj.put("rowkey",rowkey);
                }else{
                    return null;
                }
                T item= JSON.parseObject(obj.toJSONString(), getEntityClass());
                return item;
            }
        });
    }

    /**
     * 通过表名 key 和 列族 和列 获取一个数据
     *
     * @param table
     * @param family
     * @param qualifier
     * @param rowkey
     * @return
     */
    @Override
    public String getQualifier(String table,String family,String qualifier,String rowkey) {

        if(StringUtils.isBlank(table) || StringUtils.isBlank(rowkey)
                || StringUtils.isBlank(family) || StringUtils.isBlank(qualifier)){
            logger.error("{}","hbaseDao getOneQualifier params null ...");
            return null;
        }
        return hbaseTemplate.get(table, rowkey, family, qualifier, new RowMapper<String>() {
            public String mapRow(Result result, int rowNum) throws Exception {
                List<Cell> ceList = result.listCells();
                String res = "";
                if (ceList != null && ceList.size() > 0) {
                    for (Cell cell : ceList) {
                        res = Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength());
                    }
                }
                return res;
            }
        });
    }


    @Override
    public String getQualifier(HBaseQuery query) {
        String table = query.getTable();
        String rowkey = query.getRowkey();
        String qualifier = query.getQualifier();
        String family = query.getFamily();
        if(StringUtils.isBlank(table) || StringUtils.isBlank(rowkey)
                || StringUtils.isBlank(family) || StringUtils.isBlank(qualifier)){
            logger.error("{}","hbaseDao getQualifier params null ...");
            return null;
        }
        return hbaseTemplate.get(table, rowkey, family, qualifier, new RowMapper<String>() {
            public String mapRow(Result result, int rowNum) throws Exception {
                List<Cell> ceList = result.listCells();
                String res = "";
                if (ceList != null && ceList.size() > 0) {
                    for (Cell cell : ceList) {
                        res = Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength());
                    }
                }
                return res;
            }
        });
    }

    /**
     * 通过表名，开始行键和结束行键获取数据
     * 条件查询
     * @param table
     * @param table
     * @param family
     * @param startRow
     * @param stopRow
     * @return
     */
    @Override
    public  List<T> get(String table,String family,String startRow, String stopRow) {
        if(StringUtils.isBlank(table) || (StringUtils.isBlank(startRow) && StringUtils.isBlank(stopRow))){
            logger.error("{}","hbaseDao find params null ...");
            return null;
        }
        Scan scan = new Scan();
        if(!StringUtils.isBlank(startRow)){
            scan.setStartRow(Bytes.toBytes(startRow));
        }
        if(!StringUtils.isBlank(stopRow)){
            scan.setStopRow(Bytes.toBytes(stopRow));
        }
        scan.addFamily(Bytes.toBytes(family));
        return hbaseTemplate.find(table, scan, new RowMapper<T>() {
            @Override
            public T mapRow(Result result, int rowNum){
                List<Cell> ceList = result.listCells();
                JSONObject obj = new JSONObject();
                if (ceList != null && ceList.size() > 0) {
                    for (Cell cell : ceList) {
                        String value = Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength());
                        String quali = Bytes.toString(cell.getQualifierArray(), cell.getQualifierOffset(), cell.getQualifierLength());
                        if(value.startsWith("[")){
                            obj.put(quali, JSONArray.parseArray(value));
                        }else{
                            obj.put(quali, value);
                        }
                    }
                    obj.put("rowkey",Bytes.toString(ceList.get(0).getRow()));
                }
                T item =JSON.parseObject(obj.toJSONString(), getEntityClass());
                return item;
            }

        });
    }

    @Override
    public List<T> getSome(HBaseQuery query) {
        String table = query.getTable();
        String startRow = query.getStartRow();
        String stopRow = query.getStopRow();
        String family = query.getFamily();
        if(StringUtils.isBlank(table) || (StringUtils.isBlank(startRow) && StringUtils.isBlank(stopRow))){
            logger.error("{}","hbaseDao find params null ...");
            return null;
        }
        Scan scan = new Scan();
        if(!StringUtils.isBlank(startRow)){
            scan.setStartRow(Bytes.toBytes(startRow));
        }
        if(!StringUtils.isBlank(stopRow)){
            scan.setStopRow(Bytes.toBytes(stopRow));
        }
        scan.addFamily(Bytes.toBytes(family));
        return hbaseTemplate.find(table, scan, new RowMapper<T>() {
            @Override
            public T mapRow(Result result, int rowNum){
                List<Cell> ceList = result.listCells();
                JSONObject obj = new JSONObject();
                if (ceList != null && ceList.size() > 0) {
                    for (Cell cell : ceList) {
                        String value = Bytes.toString(cell.getValueArray(), cell.getValueOffset(), cell.getValueLength());
                        String quali = Bytes.toString(cell.getQualifierArray(), cell.getQualifierOffset(), cell.getQualifierLength());
                        if(value.startsWith("[")){
                            obj.put(quali, JSONArray.parseArray(value));
                        }else{
                            obj.put(quali, value);
                        }
                    }
                    obj.put("rowkey",Bytes.toString(ceList.get(0).getRow()));
                }
                T item =JSON.parseObject(obj.toJSONString(), getEntityClass());
                return item;
            }

        });
    }

    /**
     * 通过表名，family,删除数据
     *
     * @param table
     * @param family
     * @param rowkey
     * @return
     */
    public void delete(String table,String family,String rowkey){
        hbaseTemplate.delete(table, rowkey, family);
    }


    @Override
    public void delete(HBaseQuery query) {
        hbaseTemplate.delete(query.getTable(), query.getFamily(), query.getRowkey());
    }

    /**
     * 通过表名，family,删除一个qualifier数据
     *
     * @param table
     * @param family
     * @param qualifier
     * @param rowkey
     * @return
     */
    public void deleteQualifier(String table,String family,String qualifier,String rowkey){
        hbaseTemplate.delete(table, rowkey, family,qualifier);
    }


    @Override
    public void deleteQualifier(HBaseQuery query) {
        hbaseTemplate.delete(query.getTable(), query.getRowkey(), query.getFamily(),query.getQualifier());
    }
}
