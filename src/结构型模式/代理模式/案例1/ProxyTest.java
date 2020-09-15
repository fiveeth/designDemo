package 结构型模式.代理模式.案例1;

import 结构型模式.代理模式.案例1.FoodService;
import 结构型模式.代理模式.案例1.impl.FoodServiceProxy;

/**
 * @author Administrator
 * @date 2020-06-15 11:10
 */
public class ProxyTest {

    public static void main(String[] args) {
        // 这里用代理类来实例化
        FoodService foodService = new FoodServiceProxy();
        foodService.makeChicken();
        foodService.makeNoodle();
    }
}
