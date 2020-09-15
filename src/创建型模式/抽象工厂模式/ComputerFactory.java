package 创建型模式.抽象工厂模式;

/**
 * @author Administrator
 * @date 2020-06-11 22:19
 */
public interface ComputerFactory {
    /**
     * 生产cpu
     *
     * @return
     */
    CPU makeCpu();

    /**
     * 生产主板
     *
     * @return
     */
    MainBoard makeMainBoard();
}
