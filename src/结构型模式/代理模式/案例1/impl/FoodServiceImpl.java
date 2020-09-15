package 结构型模式.代理模式.案例1.impl;

import 结构型模式.代理模式.案例1.Food;
import 结构型模式.代理模式.案例1.FoodService;

/**
 * @author Administrator
 * @date 2020-06-15 11:07
 */
public class FoodServiceImpl implements FoodService {

    @Override
    public Food makeChicken() {
        Food food = new Food();
        food.setFoodName("火鸡肉");
        food.setChicken(true);
        food.setNoodle(false);
        return food;
    }

    @Override
    public Food makeNoodle() {
        Food food = new Food();
        food.setFoodName("刀削面");
        food.setChicken(false);
        food.setNoodle(true);
        return food;
    }
}
