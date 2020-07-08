package cn.huangjifan.xiaomi.service;


import cn.huangjifan.xiaomi.dao.GoodsTypeMapper;
import cn.huangjifan.xiaomi.entry.GoodsType;
import cn.huangjifan.xiaomi.entry.GoodsTypeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *             业务处理类          商品类型
 */

@Service
public class GoodsTypeService {
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    /**
     * 查询一级商品类型
     * @return 返回所有的一级商品类型
     */
    public List<GoodsType> findTopLevel(){
        GoodsTypeExample gte = new GoodsTypeExample();
        gte.createCriteria().andPidIsNull();

        return goodsTypeMapper.selectByExample(gte);
    }

    /**
     * 根据一级类型，查询所有所属二级类型
     *
     * @return 返回类型列表
     */
    public List<GoodsType> findSecondLevel(GoodsType top){
        GoodsTypeExample gte = new GoodsTypeExample();
        gte.createCriteria().andPidEqualTo(top.getId());
        return goodsTypeMapper.selectByExample(gte);
    }

    /**
     *根据主键编号查询一个类型
     * @param goodsTypeId    主键编号
     * @return  商品类型
     */
    public GoodsType findById(Integer goodsTypeId) {
        return goodsTypeMapper.selectByPrimaryKey(goodsTypeId);

    }
}
