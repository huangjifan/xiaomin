package cn.huangjifan.xiaomi.controller;

import cn.huangjifan.xiaomi.entry.Goods;
import cn.huangjifan.xiaomi.entry.GoodsType;
import cn.huangjifan.xiaomi.service.GoodsShippingService;
import cn.huangjifan.xiaomi.service.GoodsTypeService;
import cn.huangjifan.xiaomi.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 辅助工具控制器
 */

@Controller
@RequestMapping("/u")
public class UtilsController {
    @Autowired
    private GoodsShippingService goodsShippingService;
    @Autowired
    private GoodsTypeService goodsTypeService;



    @GetMapping("/search/{name}")
    @ResponseBody
    public ResponseMessage searchGoodsWithName(@PathVariable String name){
        List<Goods> goodsList=goodsShippingService.searchGoodsWithName(name);
        return goodsList.size() > 0 ?ResponseMessage.success()
                .addObject("goodsList",goodsList) : ResponseMessage.error();
    }


/**
 *
 * 根据类型查看商品
 * @param  level 类型级别     1-》一级类型      2-》二级类型
 * @param  goodsTypeId  类型编号
 * @return  返回响应数据
 */
    @GetMapping("/search/{level}/{goodsTypeId}")
    @ResponseBody
    public ResponseMessage searchGoodsWithType(@PathVariable Integer level,
                                               @PathVariable Integer goodsTypeId){
        //根据编号查询类型
        GoodsType goodsType = goodsTypeService.findById(goodsTypeId);
        List<Goods> goodsList = null;
        //判断类型级别
        if(level == 1){
            goodsList = goodsShippingService.findGoodsWithToptype(goodsType);
        }else if(level == 2){
            goodsList = goodsShippingService.findGoodsWithType(goodsType);
        }
        return goodsList != null && goodsList.size() > 0
                ? ResponseMessage.success().addObject("goodsList",goodsList)
                : ResponseMessage.error();
    }
}
