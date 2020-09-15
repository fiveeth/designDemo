package 结构型模式.装饰器模式;

/**
 * 基础的饮料: 红茶
 *
 * @author guoyihua
 * @date 2020-07-13 10:35
 */
public class RedTea extends Beverage {
    @Override
    public String getDescription() {
        return "红茶";
    }

    @Override
    public double cost() {
        return 12;
    }
}
