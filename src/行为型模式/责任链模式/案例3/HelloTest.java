package 行为型模式.责任链模式.案例3;

/**
 * @author guoyihua
 * @date 2020-07-19 9:51
 */
public class HelloTest {

    public static void main(String[] args) {
        Request request = new Request();
        request.requestMsg = "request_msg";
        Response response = new Response();
        response.responseMsg = "response_msg";

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new FirstFilter()).addFilter(new SecondFilter());
        filterChain.doFilter(request, response);

        System.out.println(request.requestMsg);
        System.out.println(response.responseMsg);
    }
}
