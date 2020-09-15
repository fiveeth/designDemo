package 行为型模式.观察者模式.impl;

import 行为型模式.观察者模式.Observer;
import 行为型模式.观察者模式.Subject;

/**
 * @author Administrator
 * @date 2020-06-10 21:17
 */
public class OlderObserver implements Observer {

    public OlderObserver(Subject subject){
        subject.registerObserver(this);
    }

    @Override
    public void remind(String msg) {
        System.out.println("老人家" + msg);
    }
}
