package 结构型模式.代理模式.案例2;

import 结构型模式.代理模式.案例2.impl.Car;
import 结构型模式.代理模式.案例2.impl.LogProxy;
import 结构型模式.代理模式.案例2.impl.TimeProxy;

/**
 * @author guoyihua
 * @date 2020-07-23 20:14
 */
public class HelloTest {

    public static void main(String[] args) {
//        MoveAble moveAble = new TimeProxy(new Car());
//        moveAble.move();
//        MoveAble moveAble = new LogProxy(new Car());
//        moveAble.move();
//        MoveAble m1 = new TimeProxy(new LogProxy(new Car()));
//        m1.move();
        MoveAble m2 = new LogProxy(new TimeProxy(new Car()));
        m2.move();
    }
}
