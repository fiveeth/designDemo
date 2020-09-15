package 行为型模式.责任链模式.案例3;

/**
 * @author guoyihua
 * @date 2020-07-19 10:14
 */
public class SecondFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        request.requestMsg = request.requestMsg + ",secondFilter_request";
        filterChain.doFilter(request, response);
        response.responseMsg = response.responseMsg + ",secondFilter_response";
    }
}
