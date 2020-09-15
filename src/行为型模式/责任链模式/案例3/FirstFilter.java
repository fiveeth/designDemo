package 行为型模式.责任链模式.案例3;

/**
 * @author guoyihua
 * @date 2020-07-19 9:53
 */
public class FirstFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.requestMsg = request.requestMsg + ",firstFilter_request";
        filterChain.doFilter(request, response);
        response.responseMsg = response.responseMsg + ",firstFilter_response";
    }
}
