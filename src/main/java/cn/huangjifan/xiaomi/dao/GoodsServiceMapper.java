package cn.huangjifan.xiaomi.dao;

import cn.huangjifan.xiaomi.entry.GoodsService;
import cn.huangjifan.xiaomi.entry.GoodsServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsServiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    long countByExample(GoodsServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int deleteByExample(GoodsServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int insert(GoodsService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int insertSelective(GoodsService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    List<GoodsService> selectByExample(GoodsServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    GoodsService selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int updateByExampleSelective(@Param("record") GoodsService record, @Param("example") GoodsServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int updateByExample(@Param("record") GoodsService record, @Param("example") GoodsServiceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int updateByPrimaryKeySelective(GoodsService record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_service
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int updateByPrimaryKey(GoodsService record);
}