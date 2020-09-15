package 创建型模式.原型模式;

/**
 * 原型模式:有一个原型实例，基于这个原型实例产生新的实例，也就是“克隆”了
 * <p>
 * 原型模型使用的场景是，创建新对象成本较大时可以利用已有的对象进行复制来获得，
 * 从而降低创建对象的代价，原型模式隐藏了创建对象的复杂性。
 * 只需要知道要创建对象的类型，然后通过请求就可以获得和该对象一模一样的新对象，
 * 无须知道具体的创建过程。使用的目的是创建新对象，而不是获取同一个对象实例，
 * 而且可以进行浅拷贝和深拷贝，单例模式创建的对象都是同一个，该模式只创建了一个对象，而不能创建新的对象。
 *
 * @author Administrator
 * @date 2020-06-14 16:50
 */
public class PrototypeDemo implements Cloneable {

    public Object clone() throws CloneNotSupportedException{
        return null;
    }
}
