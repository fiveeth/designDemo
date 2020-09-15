package 结构型模式.适配器模式.对象适配器模式;

/**
 * @author Administrator
 * @date 2020-06-21 14:52
 */
public class Usber implements Usb {
    @Override
    public void isUsb() {
        System.out.println("USB口");
    }
}
