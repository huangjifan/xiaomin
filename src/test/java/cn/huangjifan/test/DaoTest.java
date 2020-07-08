package cn.huangjifan.test;

import cn.huangjifan.xiaomi.dao.ConsumerMapper;
import cn.huangjifan.xiaomi.entry.Consumer;
import cn.huangjifan.xiaomi.entry.ConsumerExample;
import cn.huangjifan.xiaomi.entry.Goods;
import cn.huangjifan.xiaomi.service.GoodsShippingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.awt.desktop.SystemEventListener;
import java.util.List;

/**
 * 单元测试
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})


public class DaoTest {
    @Autowired

    private ConsumerMapper consumerMapper;

    @Test
    public void testConsumerInsert(){
        //创建一个consumer对象
        Consumer consumer =  new Consumer("huangjifan","123456");

        //将consumer对象增加到数据库中
        consumerMapper.insertSelective(consumer);
        System.out.println("数据insert执行完成");
    }

    @Test
    public void testConsumerSelectById(){
        Consumer consumer=consumerMapper.selectByPrimaryKey(1);
        System.out.println(consumer);
    }

    @Test
    public void testConsumerSelectByExample(){
        //创建一个查条件{账号+密码}
        ConsumerExample ce = new ConsumerExample();
        ce.createCriteria().andUsernameEqualTo("huangjifan").andPasswordEqualTo("123456");

        //查询数据
        List<Consumer> cousumer = consumerMapper.selectByExample(ce);
        cousumer.forEach(consumer -> System.out.println(consumer));

    }
    @Autowired
    private GoodsShippingService goodsShippingService;
    @Test
    public void testSearchGoods(){
        List<Goods> goodsList = goodsShippingService.searchGoodsWithName("小米");
        goodsList.forEach(goods -> System.out.println(goods));
    }
}
