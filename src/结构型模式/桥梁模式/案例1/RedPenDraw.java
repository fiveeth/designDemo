package 结构型模式.桥梁模式.案例1;

/**
 * @author Administrator
 * @date 2020-06-21 15:56
 */
public class RedPenDraw implements Draw {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("红色笔画图,radius: " + radius + ": " + x + ": " + y);
    }
}
