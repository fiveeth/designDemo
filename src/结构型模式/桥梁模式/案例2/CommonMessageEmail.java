package 结构型模式.桥梁模式.案例2;

/**
 * @author Administrator
 * @date 2020-06-21 17:37
 */
public class CommonMessageEmail implements Message{
    @Override
    public void send() {
        System.out.println("发送邮件信息");
    }
}
