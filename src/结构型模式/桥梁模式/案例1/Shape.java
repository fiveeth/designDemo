package 结构型模式.桥梁模式.案例1;

/**
 * 形状
 *
 * @author Administrator
 * @date 2020-06-21 15:54
 */
public abstract class Shape {
    protected Draw draw;

    public Shape(Draw draw){
        this.draw = draw;
    }

    public abstract void draw();
}
