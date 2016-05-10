package com.lijx.direcotry.entity;

/**
 * Created by Administrator on 2016/5/10.
 */
public class ColumnInfo {
    private String schema;
    private String tabname;
    private String column_name;
    private String column_mean;

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getTabname() {
        return tabname;
    }

    public void setTabname(String tabname) {
        this.tabname = tabname;
    }

    public String getColumn_name() {
        return column_name;
    }

    public void setColumn_name(String column_name) {
        this.column_name = column_name;
    }

    public String getColumn_mean() {
        return column_mean;
    }

    public void setColumn_mean(String column_mean) {
        this.column_mean = column_mean;
    }
}
