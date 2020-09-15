package 行为型模式.策略模式.案例2.comparable_非策略模式;

/**
 * @author Administrator
 * @date 2020-06-27 14:11
 */
public class Dog implements Comparable<Dog> {
    /**
     * 饭量
     */
    private int foodAmount;

    public Dog(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    @Override
    public int compareTo(Dog d) {
        if (this.foodAmount > d.foodAmount) {
            return 1;
        } else if (this.foodAmount < d.foodAmount) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "foodAmount=" + foodAmount +
                '}';
    }
}
