package 创建型模式.工厂模式;

/**
 * 食品工厂接口
 *
 * @author Administrator
 * @date 2020-06-11 20:25
 */
public interface FoodFactory {
    Food makeFood(String name);
}
