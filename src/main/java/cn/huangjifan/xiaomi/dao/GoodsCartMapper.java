package cn.huangjifan.xiaomi.dao;

import cn.huangjifan.xiaomi.entry.GoodsCart;
import cn.huangjifan.xiaomi.entry.GoodsCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    long countByExample(GoodsCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int deleteByExample(GoodsCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int insert(GoodsCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int insertSelective(GoodsCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    List<GoodsCart> selectByExample(GoodsCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    GoodsCart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int updateByExampleSelective(@Param("record") GoodsCart record, @Param("example") GoodsCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int updateByExample(@Param("record") GoodsCart record, @Param("example") GoodsCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int updateByPrimaryKeySelective(GoodsCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table goods_cart
     *
     * @mbg.generated Wed Mar 25 15:11:50 CST 2020
     */
    int updateByPrimaryKey(GoodsCart record);
}