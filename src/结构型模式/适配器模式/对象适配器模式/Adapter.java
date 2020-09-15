package 结构型模式.适配器模式.对象适配器模式;

/**
 * @author Administrator
 * @date 2020-06-21 14:58
 */
public class Adapter implements Ps2{
    private Usb usb;

    public Adapter(Usb usb){
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
    }
}
