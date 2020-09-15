package 结构型模式.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyihua
 * @date 2020-07-20 18:19
 */
public class DictionaryNode extends Node {
    private List<Node> list = new ArrayList<>();

    private String content;

    public DictionaryNode(String content) {
        this.content = content;
    }

    public void addNode(Node node) {
        list.add(node);
    }

    public List<Node> getNodes() {
        return list;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}
