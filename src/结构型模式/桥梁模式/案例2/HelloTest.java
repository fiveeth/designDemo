package 结构型模式.桥梁模式.案例2;

/**
 * @author Administrator
 * @date 2020-06-21 17:38
 */
public class HelloTest {
    public static void main(String[] args) {
        Message m1 = new CommonMessageSms();
        m1.send();

        Message m2 = new CommonMessageEmail();
        m2.send();
    }
}
