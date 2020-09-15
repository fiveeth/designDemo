package 结构型模式.装饰器模式;

/**
 * 饮料抽象基类(最基础的饮料: 绿茶/红茶)
 *
 * @author guoyihua
 * @date 2020-07-13 10:31
 */
public abstract class Beverage {
    //返回描述
    public abstract String getDescription();

    //返回价格
    public abstract double cost();
}
