import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Trie1 {

    private TrieNode root;
    private int numWords;

    public Trie1() {
        root = new TrieNode('\0');
        numWords = 0;
    }

    public void remove(String word) {
        if (remove(root, word)) {
            numWords--;
        }
    }


    private boolean remove(TrieNode root, String word) {
        if (word.length() == 0) {
            if (root.isTerminating) {
                root.isTerminating = false;
                return true;
            } else {
                return false;
            }
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return false;
        }
        boolean ans = remove(child, word.substring(1));
        // We can remove child node only if it is non-terminating and its number of children are 0
        if (!child.isTerminating && child.childCount == 0) {
            root.children[childIndex] = null;
            child = null;
            root.childCount--;
        }
        return ans;
    }

    private boolean add(TrieNode root, String word) {
        if (word.length() == 0) {
            if (root.isTerminating) {
                return false;
            } else {
                root.isTerminating = true;
                return true;
            }
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        return add(child, word.substring(1));
    }

    public void add(String word) {
        if (add(root, word)) {
            numWords++;
        }
    }

    public int countWords() {
        return countWords(root);
    }

    private int countWords(TrieNode root) {
        int count = 0;
        if (root.isTerminating) {
            count++;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countWords(root.children[i]);
            }
        }
        return count;
    }
}

public class q_2_Count_Words_in_Trie {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Trie1 t = new Trie1();
        String[] string = br.readLine().split("\\s");
        int choice = Integer.parseInt(string[0]);
        String word = "Null";
        if (string.length != 1) {
            word = string[1];
        }
        while (choice != -1) {
            switch (choice) {
                case 1: // insert
                    t.add(word);
                    break;
                case 2:
                    t.remove(word);
                    break;
                case 3:
                    System.out.println(t.countWords());
                    break;
                default:
                    return;
            }
            string = br.readLine().split("\\s");
            choice = Integer.parseInt(string[0]);
            if (string.length != 1) {
                word = string[1];
            }
        }
    }
}
