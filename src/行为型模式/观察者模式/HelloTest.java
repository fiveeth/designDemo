package 行为型模式.观察者模式;


import 行为型模式.观察者模式.impl.ChildrenObserver;
import 行为型模式.观察者模式.impl.OlderObserver;
import 行为型模式.观察者模式.impl.SubjectChild;

/**
 * @author Administrator
 * @date 2020-06-10 21:28
 */
public class HelloTest {

    public static void main(String[] args) {
        SubjectChild subjectChild = new SubjectChild();
        subjectChild.setMsg("下大雨了，快回家吧");
        ChildrenObserver childrenObserver = new ChildrenObserver(subjectChild);
        OlderObserver olderObserver = new OlderObserver(subjectChild);
        subjectChild.notifyObservers();
    }
}
