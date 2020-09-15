package 结构型模式.代理模式.案例1.impl;

import 结构型模式.代理模式.案例1.Food;
import 结构型模式.代理模式.案例1.FoodService;

/**
 * 代理模式说白了就是做 “方法包装” 或做 “方法增强”
 *
 * @author Administrator
 * @date 2020-06-15 11:07
 */
// 代理要表现得“就像是”真实实现类，所以需要实现 FoodService
public class FoodServiceProxy implements FoodService {

    // 内部一定要有一个真实的实现类，当然也可以通过构造方法注入
    private FoodService foodService = new FoodServiceImpl();

    @Override
    public Food makeChicken() {
        System.out.println("开始制作鸡肉");
        // 如果我们定义这句为核心代码的话，那么，核心代码是真实实现类做的，
        // 代理只是在核心代码前后做些“无足轻重”的事情
        Food food = foodService.makeChicken();
        System.out.println("制作完成,加点胡椒粉");
        food.addCondiment("pepper");//增强
        return food;
    }

    @Override
    public Food makeNoodle() {
        System.out.println("开始制作拉面");
        Food food = foodService.makeNoodle();
        System.out.println("制作拉面完成");
        return food;
    }
}
