package 创建型模式.单例模式.懒汉式;

/**
 * @author Administrator
 * @date 2020-06-13 10:45
 */
public class SingletonLH {

    // 和饿汉模式相比，这边不需要先实例化出来，注意这里的 volatile，它是必须的
    private static volatile SingletonLH singletonLH = null;

    private SingletonLH(){

    }

    public static SingletonLH getInstance(){
        if (singletonLH == null) {
            // 加锁
            synchronized (SingletonLH.class) {
                // 这一次判断也是必须的，不然会有并发问题
                // (如果没有,可能出现:第一次可能有多个线程进来竞争锁,当第一个创建完成之后,第二个不判断空,也会创建实例)
                if (singletonLH == null) {
                    singletonLH = new SingletonLH();
                }
            }
        }
        return singletonLH;
    }
}
