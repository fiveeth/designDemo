package 行为型模式.策略模式.案例1;

import 行为型模式.策略模式.案例1.impl.Croak;
import 行为型模式.策略模式.案例1.impl.FlyAble;

/**
 * @author Administrator
 * @date 2020-06-11 19:37
 */
public class GreenDuck extends Duck{

    public GreenDuck(){
        brayBehavior = new Croak();
        flyBehavior = new FlyAble();
    }

    @Override
    public void display() {
        System.out.println("我是绿头");
    }
}
