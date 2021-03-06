package com.mlnx.springmvc.mybatis.mapper;

import com.mlnx.springmvc.mybatis.model.Hospital;
import java.util.List;

public interface HospitalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int insert(Hospital record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    Hospital selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    List<Hospital> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital
     *
     * @mbggenerated Fri Nov 06 10:14:27 CST 2015
     */
    int updateByPrimaryKey(Hospital record);
}