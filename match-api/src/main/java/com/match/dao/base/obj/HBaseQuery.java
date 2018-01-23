package com.match.dao.base.obj;

import com.google.common.collect.Lists;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.filter.PageFilter;

import java.util.List;

/**
 * Created by waii on 2017/12/18.
 */
public class HBaseQuery {
    private String rowkey;
    private String table;
    private String family;
    private String qualifier;
    private String qualifierValue;
    private String startRow;
    private String stopRow;


    public HBaseQuery(String rowkey, String table, String family, String qualifier, String qualifierValue) {
        this.rowkey = rowkey;
        this.table = table;
        this.family = family;
        this.qualifier = qualifier;
        this.qualifierValue = qualifierValue;
    }


    public HBaseQuery(String rowkey, String table, String family) {
        this.rowkey = rowkey;
        this.table = table;
        this.family = family;
    }


    public HBaseQuery(String table, String family, String startRow, String stopRow) {
        this.table = table;
        this.family = family;
        this.startRow = startRow;
        this.stopRow = stopRow;
    }




    public String getRowkey() {
        return rowkey;
    }

    public void setRowkey(String rowkey) {
        this.rowkey = rowkey;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public String getStartRow() {
        return startRow;
    }

    public void setStartRow(String startRow) {
        this.startRow = startRow;
    }

    public String getStopRow() {
        return stopRow;
    }

    public void setStopRow(String stopRow) {
        this.stopRow = stopRow;
    }


    public String getQualifierValue() {
        return qualifierValue;
    }

    public void setQualifierValue(String qualifierValue) {
        this.qualifierValue = qualifierValue;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HBaseQuery{");
        sb.append("rowkey='").append(rowkey).append('\'');
        sb.append(", table='").append(table).append('\'');
        sb.append(", family='").append(family).append('\'');
        sb.append(", qualifier='").append(qualifier).append('\'');
        sb.append(", startRow='").append(startRow).append('\'');
        sb.append(", stopRow='").append(stopRow).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
