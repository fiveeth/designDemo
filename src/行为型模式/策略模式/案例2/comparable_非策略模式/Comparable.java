package 行为型模式.策略模式.案例2.comparable_非策略模式;

/**
 * comparable运用的不是策略模式
 *
 * @author Administrator
 * @date 2020-06-27 11:38
 */
public interface Comparable<T> {
    int compareTo(T o);
}
