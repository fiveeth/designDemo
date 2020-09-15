package 行为型模式.策略模式.案例2.comparator_策略模式;

/**
 * @author Administrator
 * @date 2020-06-27 16:31
 */
public class CatHeightComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getHeight() > o2.getHeight()) {
            return 1;
        } else if (o1.getHeight() < o2.getHeight()) {
            return -1;
        }
        return 0;
    }
}
