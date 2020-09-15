package 结构型模式.桥梁模式.案例1;

/**
 * 圆形
 *
 * @author Administrator
 * @date 2020-06-21 15:58
 */
public class Circle extends Shape {
    private int radius;

    public Circle(int radius, Draw draw) {
        super(draw);
        this.radius = radius;
    }

    @Override
    public void draw() {
        draw.draw(radius, 0, 0);
    }
}
