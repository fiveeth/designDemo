package 行为型模式.策略模式.案例2.comparator_策略模式;

/**
 * @author Administrator
 * @date 2020-06-27 16:16
 */
public interface Comparator<T> {
    int compare(T o1, T o2);
}
