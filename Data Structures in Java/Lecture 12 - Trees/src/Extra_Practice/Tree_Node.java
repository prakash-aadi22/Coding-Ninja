package Extra_Practice;

import java.util.ArrayList;

public class Tree_Node<T> {
    T data;
    ArrayList<Tree_Node> children;

    Tree_Node(T data) {
        this.data = data;
        children = new ArrayList<>();
    }

}
