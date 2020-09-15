package 结构型模式.代理模式.案例1;

/**
 * @author Administrator
 * @date 2020-06-15 11:11
 */
public class Food {
    private String foodName;
    private boolean isChicken;
    private boolean isNoodle;

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public boolean isChicken() {
        return isChicken;
    }

    public void setChicken(boolean chicken) {
        isChicken = chicken;
    }

    public boolean isNoodle() {
        return isNoodle;
    }

    public void setNoodle(boolean noodle) {
        isNoodle = noodle;
    }

    public void addCondiment(String pepper) {
    }
}
