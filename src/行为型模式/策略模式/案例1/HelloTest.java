package 行为型模式.策略模式.案例1;

/**
 * @author Administrator
 * @date 2020-06-11 20:01
 */
public class HelloTest {

    public static void main(String[] args) {
        Duck yellowDuck = new YellowDuck();
        yellowDuck.display();
        yellowDuck.performBehavior();

        System.out.println("--------------------------------------------------");

        Duck greenDuck = new GreenDuck();
        greenDuck.display();
        greenDuck.performBehavior();
    }
}
