package 创建型模式.抽象工厂模式;

import 创建型模式.抽象工厂模式.impl.AmdComputerFactory;

/**
 * @author Administrator
 * @date 2020-06-11 22:28
 */
public class HelloTest {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new AmdComputerFactory();
        CPU cpu = computerFactory.makeCpu();
        MainBoard mainBoard = computerFactory.makeMainBoard();
        cpu.display();
        mainBoard.display();
    }
}
