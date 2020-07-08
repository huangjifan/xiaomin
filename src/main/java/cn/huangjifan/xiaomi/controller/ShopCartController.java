package cn.huangjifan.xiaomi.controller;

import cn.huangjifan.xiaomi.entry.Consumer;
import cn.huangjifan.xiaomi.entry.Goods;
import cn.huangjifan.xiaomi.entry.GoodsCart;
import cn.huangjifan.xiaomi.service.GoodsShippingService;
import cn.huangjifan.xiaomi.service.ShopCartService;
import cn.huangjifan.xiaomi.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 购物车业务操作     控制器    数据接口
 */
@Controller
@RequestMapping("/shopcart")
public class ShopCartController {

    @Autowired
    private ShopCartService shopCartService;
    @Autowired
    private GoodsShippingService goodsShippingService;
    //商品加入购物车
    @GetMapping("/add/{goodsId}")
    @ResponseBody
    public ResponseMessage addGoodsToCart(@PathVariable Integer goodsId, HttpSession session){
        //获取当前登录用户
        Consumer consumer = (Consumer)session.getAttribute("loginConsumer");
        if(consumer == null){
            return ResponseMessage.error();
        }
        //加入商品到购物车
        Goods goods= goodsShippingService.findGoodsWithId(goodsId);
        shopCartService.addGoodsToShopCart(consumer, goods);
        return ResponseMessage.success();
    }

    //删除购物车中的一个商品
    @GetMapping("/remove/{goodsId}")
    @ResponseBody
    public ResponseMessage removeGoodsFromCart(@PathVariable Integer goodsId, HttpSession session){
        //获取当前登录用户
        Consumer consumer = (Consumer)session.getAttribute("loginConsumer");
        if(consumer == null){
            return ResponseMessage.error();
        }

        Goods goods= goodsShippingService.findGoodsWithId(goodsId);
        shopCartService.removeGoodsFromShopCart(consumer, goods);
        return ResponseMessage.success();
    }

    //查询当前用户在购物车中的所有商品
    @GetMapping("/chk")
    @ResponseBody
    public ResponseMessage findAllWithConsumer(HttpSession session){
        //获取当前登录用户
        Consumer consumer = (Consumer)session.getAttribute("longinConsumer");
        if(consumer == null){
            return ResponseMessage.error();
        }
        List<GoodsCart> cartList = shopCartService.findAllGoodsCartWithConsumer(consumer);
        return ResponseMessage.success().addObject("cartList",cartList);
    }
}
