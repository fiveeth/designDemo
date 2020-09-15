package 结构型模式.组合模式;

/**
 * @author guoyihua
 * @date 2020-07-20 18:19
 */
public class LeafNode extends Node {

    private String content;

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}
