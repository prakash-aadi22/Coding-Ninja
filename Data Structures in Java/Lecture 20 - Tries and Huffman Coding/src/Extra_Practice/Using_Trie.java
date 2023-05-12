package Extra_Practice;

class TrieNode {
    char data;
    boolean isTerminating;
    TrieNode[] children;
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}

public class Using_Trie {
    private TrieNode root;

    public Using_Trie() {
        root = new TrieNode('\0');
    }

    private boolean search(TrieNode root, String word) {
        if (word.length() == 0) {
            return root.isTerminating;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return false;
        }
        return search(child, word.substring(1));
    }

    public boolean search(String word) {
        return search(root, word);
    }

    private void add(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminating = true;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
        }
        add(child, word.substring(1));
    }

    public void add(String word) {
        add(root, word);
    }

    public void remove(String word) {
        remove(root, word);
    }

    private void remove(TrieNode root, String word) {
        if (word.length() == 0) {
            root.isTerminating = false;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return;
        }
        remove(child, word.substring(1));
        if (!child.isTerminating && child.childCount == 0){
            root.children[childIndex] = null;
            child = null;
            root.childCount--;
        }
    }

    public static void main(String[] args) {
        Using_Trie t = new Using_Trie();
        t.add("hell");
        t.add("hello");
        System.out.println(t.search("hell"));
        System.out.println(t.search("hello"));
        t.remove("hell");
        System.out.println(t.search("o"));
        System.out.println(t.search("hello"));
        System.out.println(t.search("hell"));
    }
}
