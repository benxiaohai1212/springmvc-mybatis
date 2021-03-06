package com.mlnx.springmvc.mybatis.mapper;

import com.mlnx.springmvc.mybatis.model.OfficeDoctor;
import java.util.List;

public interface OfficeDoctorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office_doctor
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office_doctor
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int insert(OfficeDoctor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office_doctor
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    OfficeDoctor selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office_doctor
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    List<OfficeDoctor> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table office_doctor
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int updateByPrimaryKey(OfficeDoctor record);
}