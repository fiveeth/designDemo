package 行为型模式.策略模式.案例2.comparable_非策略模式;

import java.util.Arrays;

/**
 * @author Administrator
 * @date 2020-06-27 11:37
 */
public class HelloTest {

    public static void main(String[] args) {
        //int[] a = {1,3,2,4,6,5,0};
        //Cat[] a = {new Cat(3), new Cat(2), new Cat(1), new Cat(4)};
        Dog[] a = {new Dog(3), new Dog(2), new Dog(1), new Dog(4)};
        Sorter sorter = new Sorter();
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
