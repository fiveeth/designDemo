package 行为型模式.责任链模式.案例1;

/**
 * @author guoyihua
 * @date 2020-07-19 9:51
 */
public class HelloTest {

    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMessage("UNITED WILL BACK");
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HtmlFilter()).addFilter(new SensitiveFilter());
        filterChain.doFilter(msg);
        System.out.println(msg);
    }
}
