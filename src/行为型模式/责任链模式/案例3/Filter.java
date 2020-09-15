package 行为型模式.责任链模式.案例3;

/**
 * @author guoyihua
 * @date 2020-07-19 9:51
 */
public interface Filter {
    void doFilter(Request request, Response response, FilterChain filterChain);
}
