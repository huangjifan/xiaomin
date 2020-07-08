package cn.huangjifan.xiaomi.service;


import cn.huangjifan.xiaomi.dao.GoodsMapper;
import cn.huangjifan.xiaomi.dao.GoodsTypeMapper;
import cn.huangjifan.xiaomi.entry.Goods;
import cn.huangjifan.xiaomi.entry.GoodsExample;
import cn.huangjifan.xiaomi.entry.GoodsType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *             业务处理类              商品
 */

@Service
public class GoodsShippingService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsTypeService goodsTypeService;

    /**
     * 根据商品类型查询商品
     * @Param goodsType 二级商品类型
     * @return 属于指定商品类型的所有商品
     */

    public List<Goods> findGoodsWithType(GoodsType goodsType){
        GoodsExample ge = new GoodsExample();
        ge.createCriteria().andGoodsTypeIdEqualTo(goodsType.getId());

        return goodsMapper.selectByExample(ge);
    }


    /**
     * 根据商品类型查询商品
     * @Param goodsType 一级商品类型
     * @return 返回所有商品
     *
     */
    public List<Goods> findGoodsWithToptype(GoodsType goodstype){
        //根据一级类型查询所有所属二级类型
        List<GoodsType> gt = goodsTypeService.findSecondLevel(goodstype);
        //查询所有二级类型下的所有商品
        List<Goods> goodsList = new ArrayList<>();
        for (GoodsType goodsType : gt){
            List<Goods> goodses = this.findGoodsWithType(goodsType);
            goodsList.addAll(goodses);
        }
        return goodsList;
   }


    /**
     * 根据名称模糊搜索商品数据
     * @param name 商品名称
     * @return  返回符合搜索条件的商品
     *
     */
    public List<Goods> searchGoodsWithName(String name){
        //构建条件
        GoodsExample ge = new GoodsExample();
        ge.createCriteria().andNameLike("%" + name + "%");
        return goodsMapper.selectByExample(ge);
    }


    /**
     * 根据id查询商品
     * @param id 商品编号
     * @return 返回查询到的商品
     *
     */
    public Goods findGoodsWithId(Integer id){
        return goodsMapper.selectByPrimaryKey(id);
    }
}
