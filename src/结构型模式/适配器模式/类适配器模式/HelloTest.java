package 结构型模式.适配器模式.类适配器模式;

/**
 * @author Administrator
 * @date 2020-06-21 11:15
 */
public class HelloTest {

    public static void main(String[] args) {
        Ps2 p = new Adapter();
        p.isPs2();
    }
}