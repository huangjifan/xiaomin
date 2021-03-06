package cn.huangjifan.xiaomi.dao;

import cn.huangjifan.xiaomi.entry.GoodsShippingAddress;
import cn.huangjifan.xiaomi.entry.GoodsShippingAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsShippingAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    long countByExample(GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int deleteByExample(GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int insert(GoodsShippingAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int insertSelective(GoodsShippingAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    List<GoodsShippingAddress> selectByExampleWithBLOBs(GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    List<GoodsShippingAddress> selectByExample(GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    GoodsShippingAddress selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int updateByExampleSelective(@Param("record") GoodsShippingAddress record, @Param("example") GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int updateByExampleWithBLOBs(@Param("record") GoodsShippingAddress record, @Param("example") GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int updateByExample(@Param("record") GoodsShippingAddress record, @Param("example") GoodsShippingAddressExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int updateByPrimaryKeySelective(GoodsShippingAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int updateByPrimaryKeyWithBLOBs(GoodsShippingAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_shipping_address
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int updateByPrimaryKey(GoodsShippingAddress record);
}