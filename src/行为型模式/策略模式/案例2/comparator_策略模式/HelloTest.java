package 行为型模式.策略模式.案例2.comparator_策略模式;

import java.util.Arrays;

/**
 * @author Administrator
 * @date 2020-06-27 16:15
 */
public class HelloTest {

    public static void main(String[] args) {
        Dog[] dogs = {new Dog(3),new Dog(1),new Dog(2)};
        Sorter<Dog> s1 = new Sorter<>();
        s1.sort(dogs,new DogComparator());
        System.out.println(Arrays.toString(dogs));

        Cat[] cats = {new Cat(1,4),new Cat(1,3),new Cat(1,1),new Cat(1,2)};
        Sorter<Cat> s2 = new Sorter<>();
        s2.sort(cats,new CatHeightComparator());
        System.out.println(Arrays.toString(cats));
    }
}
