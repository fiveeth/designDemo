package 创建型模式.单例模式.嵌套式;

/**
 * @author Administrator
 * @date 2020-06-13 10:57
 */
public class SingletonQT {

    private SingletonQT(){
    }

    private static class Holder{
        private static SingletonQT singletonQT = new SingletonQT();
    }

    public static SingletonQT getInstance(){
        return Holder.singletonQT;
    }
}
