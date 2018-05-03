package com.sea.entity;

import lombok.Data;

/**
 * Created by try on 2018/4/16.
 */
@Data
public class CompanyEntity {

    private int id;

    private String name;

    private double X;

    private double Y;

    private int isopen;

    public CompanyEntity() {

    }

    public CompanyEntity(int id, String name, double x, double y, int isopen) {
        this.id = id;
        this.name = name;
        X = x;
        Y = y;
        this.isopen = isopen;
    }
}
