package Extra_Practice;

import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;

public class Trying_Tree {
    public static void main(String[] args) {
        Tree t = new Tree() {
            @Override
            public Kind getKind() {
                return null;
            }

            @Override
            public <R, D> R accept(TreeVisitor<R, D> visitor, D data) {
                return null;
            }
        };
    }
}
