package 结构型模式.适配器模式.类适配器模式;

/**
 * @author Administrator
 * @date 2020-06-21 14:53
 */
public class Adapter extends Usber implements Ps2 {

    @Override
    public void isPs2() {
        isUsb();
    }
}
