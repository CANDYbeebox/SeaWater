package com.sea.entity;

import lombok.Data;

/**
 * Created by try on 2018/7/23.
 */
@Data
public class RequestBodyEntity {

    private int id;
    private String table; //表名称
    private String key; //字段名称
    private String value; //字段值

    public RequestBodyEntity() {
    }

    public RequestBodyEntity(int id, String table, String key, String value) {
        this.id = id;
        this.table = table;
        this.key = key;
        this.value = value;
    }
}
