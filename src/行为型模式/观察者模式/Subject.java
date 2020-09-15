package 行为型模式.观察者模式;

/**
 * @author Administrator
 * @date 2020-06-10 17:40
 */
//主题接口
public interface Subject {
    //添加一个观察者
    void registerObserver(Observer observer);
    //删除一个观察者
    void deleteObserver(Observer observer);
    //通知
    void notifyObservers();
}
