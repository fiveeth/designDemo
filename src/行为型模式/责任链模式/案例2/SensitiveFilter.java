package 行为型模式.责任链模式.案例2;

/**
 * @author guoyihua
 * @date 2020-07-19 10:14
 */
public class SensitiveFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        request.requestMsg = request.requestMsg + ",sensitiveFilter_request";
        filterChain.doFilter(request, response, filterChain);
        response.responseMsg = response.responseMsg + ",sensitiveFilter_response";
        return true;
    }
}
