package 结构型模式.桥梁模式.案例1;

/**
 * 长方形
 *
 * @author Administrator
 * @date 2020-06-21 16:09
 */
public class Rectangle extends Shape {

    private int x;
    private int y;

    public Rectangle(int x, int y, Draw draw) {
        super(draw);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        draw.draw(0, x, y);
    }
}
