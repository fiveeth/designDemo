package 创建型模式.建造者模式;

/**
 * @author Administrator
 * @date 2020-06-14 15:39
 */
public class App {

    public static void main(String[] args) {
//        User u1 = User.builder()
//                .username("张三")
//                .age(12)
//                .build();

        User u2 = User.builder()
                .username("李四")
                .age(20)
                .build();
        System.out.println(u2.toString());

        User u3 = User.builder()
                .username("王五")
                .password("abcdef")
                .age(25)
                .build();
        System.out.println(u3.toString());
    }
}
