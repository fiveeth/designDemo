package 创建型模式.工厂模式;

import 创建型模式.工厂模式.impl.ChineseFoodFactory;

/**
 * @author Administrator
 * @date 2020-06-11 22:06
 */
public class HelloTest {

    public static void main(String[] args) {
        FoodFactory foodFactory = new ChineseFoodFactory();
        Food food = foodFactory.makeFood("A");
        food.favoriteFood();
    }
}
