package 创建型模式.简单工厂模式;

import 创建型模式.简单工厂模式.impl.Red;
import 创建型模式.简单工厂模式.impl.White;
import 创建型模式.简单工厂模式.impl.Yellow;

/**
 * @author Administrator
 * @date 2020-06-11 20:10
 */
public class SimpleFactory {

    public static Color getColor(String type) {
        if ("红色".equals(type)) {
            return new Red();
        } else if ("黄色".equals(type)) {
            return new Yellow();
        }else{
            return new White();
        }
    }
}
