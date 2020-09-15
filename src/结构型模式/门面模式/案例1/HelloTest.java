package 结构型模式.门面模式.案例1;

/**
 * 门面模式的优点显而易见，客户端不再需要关注实例化时应该使用哪个实现类，
 * 直接调用门面提供的方法就可以了，因为门面类提供的方法的方法名对于客户
 * 端来说已经很友好了。
 *
 * @author Administrator
 * @date 2020-07-05 17:39
 */
public class HelloTest {

    public static void main(String[] args) {
//        Animal dog = new Dog();
//        dog.food();
//
//        Animal cat = new Cat();
//        cat.food();
        AnimalMaker animalMaker = new AnimalMaker();
        animalMaker.getDogFood();
        animalMaker.getCatFood();
    }
}
