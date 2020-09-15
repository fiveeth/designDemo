package 创建型模式.原型模式;

/**
 * @author Administrator
 * @date 2020-06-14 17:08
 */
public class PrototypeTest {

    public static void main(String[] args) {
        PrototypeDemo p1 = new PrototypeDemo();
        try {
            Object p2  = p1.clone();
            if(p1 == p2){
                System.out.println("我们指向相同的引用");
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
