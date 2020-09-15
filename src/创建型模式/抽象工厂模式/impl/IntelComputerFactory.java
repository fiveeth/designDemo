package 创建型模式.抽象工厂模式.impl;

import 创建型模式.抽象工厂模式.CPU;
import 创建型模式.抽象工厂模式.ComputerFactory;
import 创建型模式.抽象工厂模式.MainBoard;

/**
 * @author Administrator
 * @date 2020-06-11 22:22
 */
public class IntelComputerFactory implements ComputerFactory {
    @Override
    public CPU makeCpu() {
        return new IntelCpu();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new IntelMainBoard();
    }
}
