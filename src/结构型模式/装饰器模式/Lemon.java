package 结构型模式.装饰器模式;

/**
 * 装饰: 柠檬
 *
 * @author guoyihua
 * @date 2020-07-13 10:36
 */
public class Lemon extends Condiment {
    protected Beverage beverage;

    public Lemon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "加柠檬";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2;
    }
}
