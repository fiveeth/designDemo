package 行为型模式.责任链模式.案例2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyihua
 * @date 2020-07-19 14:53
 */
public class FilterChain implements Filter {
    private List<Filter> filters = new ArrayList<>();

    int index = 0;

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        if (index == filters.size()) {
            return false;
        }
        Filter filter = filters.get(index);
        index++;
        return filter.doFilter(request, response, filterChain);
    }
}