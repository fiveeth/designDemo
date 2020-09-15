package 行为型模式.责任链模式.案例1;

/**
 * @author guoyihua
 * @date 2020-07-19 10:11
 */
public class Msg {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Msg={" +
                "message='" + message + '\'' +
                '}';
    }
}
