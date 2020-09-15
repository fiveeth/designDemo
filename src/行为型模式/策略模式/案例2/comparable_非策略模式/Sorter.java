package 行为型模式.策略模式.案例2.comparable_非策略模式;

/**
 * @author Administrator
 * @date 2020-06-27 11:39
 */
public class Sorter {

    public void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            Comparable temp;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) == 1) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
