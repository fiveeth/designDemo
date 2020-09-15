package 结构型模式.门面模式.案例2;

/**
 * @author guoyihua
 * @date 2020-07-13 11:02
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
