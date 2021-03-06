package com.lzx.mapper;

import com.lzx.entity.DisOrder;
import com.lzx.entity.DisOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_order
     *
     * @mbg.generated
     */
    long countByExample(DisOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_order
     *
     * @mbg.generated
     */
    int deleteByExample(DisOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_order
     *
     * @mbg.generated
     */
    int insert(DisOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_order
     *
     * @mbg.generated
     */
    int insertSelective(DisOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_order
     *
     * @mbg.generated
     */
    List<DisOrder> selectByExample(DisOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_order
     *
     * @mbg.generated
     */
    DisOrder selectByPrimaryKey(String orderId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_order
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DisOrder record, @Param("example") DisOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_order
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DisOrder record, @Param("example") DisOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DisOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DisOrder record);
}