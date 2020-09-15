package 结构型模式.享元模式;

/**
 * @author guoyihua
 * @date 2020-07-24 10:41
 */
public class HelloTest {

    public static void main(String[] args) {
        String str1 = "asd";
        String str2 = "asd";
        String str3 = new String("asd");
        String str4 = new String("asd");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str3==str4);
        System.out.println(str3.intern()==str1);
    }
}
