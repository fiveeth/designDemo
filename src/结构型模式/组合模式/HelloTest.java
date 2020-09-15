package 结构型模式.组合模式;

/**
 * @author guoyihua
 * @date 2020-07-20 18:21
 */
public class HelloTest {

    public static void main(String[] args) {
        //创建一个根节点
        DictionaryNode root = new DictionaryNode("root");
        //创建树枝节点
        DictionaryNode A1 = new DictionaryNode("A1");
        DictionaryNode A2 = new DictionaryNode("A2");
        //创建叶子节点
        Node A11 = new LeafNode("A11");
        Node A12 = new LeafNode("A12");
        //创建树枝节点
        DictionaryNode A21 = new DictionaryNode("A21");
        //创建叶子节点
        Node A211 = new LeafNode("A211");
        Node A212 = new LeafNode("A212");

        //建立整体
        root.addNode(A1);
        root.addNode(A2);
        A1.addNode(A11);
        A1.addNode(A12);
        A2.addNode(A21);
        A21.addNode(A211);
        A21.addNode(A212);

        tree(root, 0);
    }

    public static void tree(Node node, int index) {
        for(int i=0;i<=index;i++){
            System.out.print("--");
        }
        node.print();
        if (node instanceof DictionaryNode) {
            for (Node child : ((DictionaryNode) node).getNodes()) {
                tree(child, index + 1);
            }
        }
    }
}
