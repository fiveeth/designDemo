package 行为型模式.责任链模式.案例3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyihua
 * @date 2020-07-19 14:53
 */
public class FilterChain{
    private List<Filter> filters = new ArrayList<>();
    //记录执行位置
    int index = 0;

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if (index == filters.size()) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }
}