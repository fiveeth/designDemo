package 行为型模式.策略模式.案例2.comparator_策略模式;

/**
 * @author Administrator
 * @date 2020-06-27 16:26
 */
public class Cat {

    private int weight;
    private int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
