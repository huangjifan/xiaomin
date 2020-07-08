package cn.huangjifan.xiaomi.controller;


import cn.huangjifan.xiaomi.entry.Goods;
import cn.huangjifan.xiaomi.service.GoodsShippingService;
import cn.huangjifan.xiaomi.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 商品详情
 */

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsShippingService goodsShippingService;

    @GetMapping("/detail/{gid}")
    @ResponseBody
    public ResponseMessage findGoodsWithId(@PathVariable Integer gid){
        Goods goods = goodsShippingService.findGoodsWithId(gid);

        return ResponseMessage.success().addObject("goods",goods);
    }

}
