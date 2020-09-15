package 结构型模式.装饰器模式;

/**
 * 基础的饮料: 绿茶
 *
 * @author guoyihua
 * @date 2020-07-13 10:34
 */
public class GreenTea extends Beverage {
    @Override
    public String getDescription() {
        return "绿茶";
    }

    @Override
    public double cost() {
        return 10;
    }
}
