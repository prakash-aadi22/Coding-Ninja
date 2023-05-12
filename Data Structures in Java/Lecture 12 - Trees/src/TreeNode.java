import Extra_Practice.Tree_Node;

import java.util.ArrayList;

public class TreeNode<T> {
    T data;
    ArrayList<TreeNode> children;

    TreeNode(T data) {
        this.data = data;
        children = new ArrayList<>();
    }

}
