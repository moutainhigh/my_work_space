package com.match.dao.base;

import com.match.dao.base.obj.HBaseQuery;

import java.util.List;

public interface HBaseBaseDao<T> {

    Class<T> getEntityClass();

    <T> T put(String table, final String rowkey, final String family, final T t);

    <T> T put(HBaseQuery query,final T t);

    void putQualifier(String table, String family, String qualifier,String value,String rowkey);

    void putQualifier(HBaseQuery query);

    T get(String table,String family,String rowKey);

    T getOne(HBaseQuery query);

    String getQualifier(String table,String family,String qualifier,String rowkey);

    String getQualifier(HBaseQuery query);

    List<T> get(String table,String family,String startRow, String stopRow);

    List<T> getSome(HBaseQuery query);

    void delete(String table,String family,String rowkey);

    void delete(HBaseQuery query);

    void deleteQualifier(String table,String family,String qualifier,String rowkey);

    void deleteQualifier(HBaseQuery query);

}
