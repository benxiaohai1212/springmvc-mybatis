package com.mlnx.springmvc.mybatis.mapper;

import com.mlnx.springmvc.mybatis.model.TBloodSugarSetting;
import java.util.List;

public interface TBloodSugarSettingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blood_sugar_setting
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blood_sugar_setting
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int insert(TBloodSugarSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blood_sugar_setting
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    TBloodSugarSetting selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blood_sugar_setting
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    List<TBloodSugarSetting> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_blood_sugar_setting
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int updateByPrimaryKey(TBloodSugarSetting record);
}