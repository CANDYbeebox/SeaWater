package com.sea.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by try on 2018/4/20.
 */
@Data
public class RunningRecordEntity {

    private int id;
    private Timestamp recordTime;
    private String oneSpeed;
    private String onePower;
    private String twoSpeed;
    private String twoPower;
    private String desalinationPower;
    private String desalinationYield;
    private String pcs;

    public RunningRecordEntity() {
    }

    public RunningRecordEntity(int id, Timestamp recordTime, String oneSpeed, String onePower, String twoSpeed, String twoPower, String desalinationPower, String desalinationYield, String pcs) {
        this.id = id;
        this.recordTime = recordTime;
        this.oneSpeed = oneSpeed;
        this.onePower = onePower;
        this.twoSpeed = twoSpeed;
        this.twoPower = twoPower;
        this.desalinationPower = desalinationPower;
        this.desalinationYield = desalinationYield;
        this.pcs = pcs;
    }
}
