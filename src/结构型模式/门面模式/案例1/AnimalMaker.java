package 结构型模式.门面模式.案例1;

/**
 * @author Administrator
 * @date 2020-07-05 17:41
 */
public class AnimalMaker {
    private Dog dog;
    private Cat cat;

    public AnimalMaker(){
        this.dog = new Dog();
        this.cat = new Cat();
    }

    public void getDogFood(){
        dog.food();
    }

    public void getCatFood(){
        cat.food();
    }
}
