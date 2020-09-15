package 创建型模式.单例模式.饿汉式;

/**
 * @author Administrator
 * @date 2020-06-13 10:38
 */
public class SingletonEH {
    private SingletonEH(){
    }

    private static SingletonEH singleton = new SingletonEH();

    public static SingletonEH getInstance(){
        return  singleton;
    }

    /**
     * 这就是一个问题: 这时候是不需要对象实例的,所以这是饿汉式存在的问题
     */
    public static void sayHello(){
        System.out.println("Hello");
    }
}
