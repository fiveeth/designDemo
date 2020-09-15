package 行为型模式.策略模式.案例1;

/**
 * 鸭子父类
 *
 * @author Administrator
 * @date 2020-06-11 19:34
 */
public class Duck {

    BrayBehavior brayBehavior;

    FlyBehavior flyBehavior;

    public void display() {
    }

    public void performBehavior(){
        brayBehavior.bray();
        flyBehavior.fly();
    }
}
