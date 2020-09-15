package 创建型模式.建造者模式;

/**
 * @author Administrator
 * @date 2020-06-14 15:30
 */
public class User {
    private String username;
    private String password;
    private int age;

    // 构造方法私有化，不然客户端就会直接调用构造方法了
    private User(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
    }

    // 静态方法，用于生成一个 Builder，这个不一定要有，不过写这个方法是一个很好的习惯，
    // 有些代码要求别人写 new User.UserBuilder().a()...build() 看上去就没那么好
    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public String toString() {
        String str = "用户名:" + username + " 密码:" + password + " 年龄:" + age;
        return str;
    }

    public static class UserBuilder {
        // 下面是和 User 一模一样的一堆属性
        private String username;
        private String password;
        private int age;

        private UserBuilder(){
        }

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        // build() 方法负责将 UserBuilder 中设置好的属性“复制”到 User 中。
        // 当然，可以在 “复制” 之前做点检验
        public User build() {
            if (username == null) {
                throw new RuntimeException("用户名不能为空");
            }

            if (password == null) {
                password = "123456";
            }

            if (age < 18) {
                throw new RuntimeException("不适合未成年");
            }

            return new User(username, password, age);
        }
    }
}
