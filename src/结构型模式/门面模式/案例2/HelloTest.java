package 结构型模式.门面模式.案例2;

/**
 * @author guoyihua
 * @date 2020-07-13 11:05
 */
public class HelloTest {

    public static void main(String[] args) {
        // 画一个圆形
        // Shape circle = new Circle();
        // circle.draw();
        // 画一个长方形
        // Shape rectangle = new Rectangle();
        // rectangle.draw();

        ShapeMarker shapeMarker = new ShapeMarker();
        shapeMarker.drawCircle();
        shapeMarker.drawRectangle();
    }
}
