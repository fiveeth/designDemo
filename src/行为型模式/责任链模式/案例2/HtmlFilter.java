package 行为型模式.责任链模式.案例2;

/**
 * @author guoyihua
 * @date 2020-07-19 9:53
 */
public class HtmlFilter implements Filter {

    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        request.requestMsg = request.requestMsg + ",htmlFilter_request";
        filterChain.doFilter(request, response, filterChain);
        response.responseMsg = response.responseMsg + ",htmlFilter_response";
        return true;
    }
}
