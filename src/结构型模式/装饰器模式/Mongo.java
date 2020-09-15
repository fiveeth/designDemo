package 结构型模式.装饰器模式;

/**
 * 装饰: 芒果
 *
 * @author guoyihua
 * @date 2020-07-13 10:41
 */
public class Mongo extends Condiment {
    protected Beverage beverage;

    public Mongo(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "加芒果";
    }

    @Override
    public double cost() {
        return beverage.cost() + 3;
    }
}
