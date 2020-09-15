package 行为型模式.策略模式.案例2.comparator_策略模式;

/**
 * @author Administrator
 * @date 2020-06-27 16:15
 */
public class Sorter<T> {

    public void sort(T[] arr, Comparator comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            T temp;
            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(arr[i], arr[j]) == 1) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
