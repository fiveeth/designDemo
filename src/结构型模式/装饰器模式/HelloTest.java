package 结构型模式.装饰器模式;

/**
 * @author guoyihua
 * @date 2020-07-13 10:44
 */
public class HelloTest {

    public static void main(String[] args) {
        Beverage beverage = new GreenTea();
        beverage = new Lemon(beverage);
        beverage = new Mongo(new Mongo(beverage));
        System.out.println("饮料:" + beverage.getDescription() + " 价格:¥" + beverage.cost());
    }
}
