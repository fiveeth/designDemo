package 结构型模式.门面模式.案例2;

/**
 * @author guoyihua
 * @date 2020-07-13 11:03
 */
public class ShapeMarker {
    private Circle circle;
    private Rectangle rectangle;

    public ShapeMarker(){
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
}
