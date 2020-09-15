package 结构型模式.门面模式.案例1;

/**
 * @author Administrator
 * @date 2020-07-05 17:37
 */
public class Cat implements Animal {
    @Override
    public void food() {
        System.out.println("我喜欢吃猫粮");
    }
}
