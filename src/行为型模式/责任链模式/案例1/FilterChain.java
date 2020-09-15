package 行为型模式.责任链模式.案例1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyihua
 * @date 2020-07-19 14:53
 */
public class FilterChain implements Filter{
    private List<Filter> filters = new ArrayList<>();

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    public boolean doFilter(Msg msg) {
        for (Filter filter : filters) {
            if(!filter.doFilter(msg)){
                return false;
            }
        }
        return true;
    }
}
