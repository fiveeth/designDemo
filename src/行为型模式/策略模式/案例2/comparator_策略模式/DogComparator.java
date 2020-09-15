package 行为型模式.策略模式.案例2.comparator_策略模式;

/**
 * @author Administrator
 * @date 2020-06-27 16:18
 */
public class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.getWeight() > o2.getWeight()) {
            return 1;
        } else if (o1.getWeight() < o2.getWeight()) {
            return -1;
        }
        return 0;
    }
}
