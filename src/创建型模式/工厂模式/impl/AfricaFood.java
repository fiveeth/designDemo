package 创建型模式.工厂模式.impl;

import 创建型模式.工厂模式.Food;

/**
 * @author Administrator
 * @date 2020-06-11 22:05
 */
public class AfricaFood extends Food {

    @Override
    public void favoriteFood() {
        System.out.println("我喜欢吃非洲食物");
    }
}
