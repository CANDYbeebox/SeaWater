package com.sea.dao;

import com.sea.entity.RunningRecordEntity;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by try on 2018/4/20.
 */
public interface RunningRecordDao {

    List<RunningRecordEntity> selectByTime(@Param("low") Timestamp low, @Param("high") Timestamp high);
}
