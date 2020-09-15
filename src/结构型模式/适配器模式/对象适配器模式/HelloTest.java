package 结构型模式.适配器模式.对象适配器模式;

/**
 * @author Administrator
 * @date 2020-06-21 11:12
 */
public class HelloTest {

    public static void main(String[] args) {
        Ps2 p = new Adapter(new Usber());
        p.isPs2();
    }
}
