package 行为型模式.责任链模式.案例1;

/**
 * @author guoyihua
 * @date 2020-07-19 10:14
 */
public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String message = msg.getMessage();
        message = message.replaceAll("UNITED","CHINA");
        msg.setMessage(message);
        return true;
    }
}
