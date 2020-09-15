package 行为型模式.策略模式.案例2.comparable_非策略模式;

/**
 * @author Administrator
 * @date 2020-06-27 11:39
 */
public class Cat implements Comparable<Cat> {
    private int weight;

    public Cat(int weight) {
        this.weight = weight;
    }

    public int compareTo(Cat c) {
        if (this.weight > c.weight) {
            return 1;
        } else if (this.weight < c.weight) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }
}
