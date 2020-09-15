package 结构型模式.桥梁模式.案例1;

/**
 * @author Administrator
 * @date 2020-06-21 16:11
 */
public class HelloTest {

    public static void main(String[] args) {
        Shape s1 = new Circle(5,new GreenPenDraw());
        s1.draw();

        Shape s2 = new Rectangle(4,5,new RedPenDraw());
        s2.draw();
    }
}
