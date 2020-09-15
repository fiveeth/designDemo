package 行为型模式.责任链模式.案例1;

/**
 * @author guoyihua
 * @date 2020-07-19 9:53
 */
public class HtmlFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        String message = msg.getMessage();
        message = message.replace("BACK", "WIN");
        msg.setMessage(message);
        return false;
    }
}
