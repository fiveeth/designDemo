package 结构型模式.桥梁模式.案例2;

/**
 * @author Administrator
 * @date 2020-06-21 17:36
 */
public class CommonMessageSms implements Message{
    @Override
    public void send() {
        System.out.println("发送系统内消息");
    }
}
