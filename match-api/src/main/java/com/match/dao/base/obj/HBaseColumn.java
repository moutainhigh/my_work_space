package com.match.dao.base.obj;

/**
 * Created by waii on 2017/12/18.
 */
public class HBaseColumn {
    private String family;
    private String qualifier;
    private String value;

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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
