package 行为型模式.策略模式.案例1;

import 行为型模式.策略模式.案例1.impl.FlyAbleIsNot;
import 行为型模式.策略模式.案例1.impl.Squeak;

/**
 * @author Administrator
 * @date 2020-06-11 19:37
 */
public class YellowDuck extends Duck {

    public YellowDuck(){
        brayBehavior = new Squeak();
        flyBehavior = new FlyAbleIsNot();
    }

    @Override
    public void display() {
        System.out.println("我是黄头");
    }
}
