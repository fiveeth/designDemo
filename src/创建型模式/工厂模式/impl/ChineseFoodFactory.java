package 创建型模式.工厂模式.impl;

import 创建型模式.工厂模式.Food;
import 创建型模式.工厂模式.FoodFactory;

/**
 * @author Administrator
 * @date 2020-06-11 20:26
 */
public class ChineseFoodFactory implements FoodFactory {

    @Override
    public Food makeFood(String name) {
        if("A".equals(name)){
            return new ScFood();
        }else if("B".equals(name)){
            return new GdFood();
        }
        return null;
    }
}
