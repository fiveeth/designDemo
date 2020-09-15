package 行为型模式.观察者模式.impl;

import 行为型模式.观察者模式.Observer;
import 行为型模式.观察者模式.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @date 2020-06-10 21:13
 */
public class SubjectChild implements Subject {
    private List<Observer> observerList = new ArrayList<Observer>();
    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index >= 0) {
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.remind(msg);
        }
    }

    /**
     * 主题更新信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }
}
