package 创建型模式.简单工厂模式;

/**
 * @author Administrator
 * @date 2020-06-11 20:16
 */
public class HelloTest {

    public static void main(String[] args) {
        Color c1 = SimpleFactory.getColor("红色");
        c1.display();

        Color c2 = SimpleFactory.getColor("黄色");
        c2.display();
    }
}
