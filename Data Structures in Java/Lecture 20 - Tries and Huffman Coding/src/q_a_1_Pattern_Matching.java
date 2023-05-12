import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Trie3 {

    private TrieNode root;
    private int count;

    public Trie3() {
        root = new TrieNode('\0');
        count = 0;
    }

    public boolean search(String word) {
        return search(root, word);
    }

    private boolean search(TrieNode root, String word) {
        if (word.length() == 0) {
            return true;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            return false;
        }
        return search(child, word.substring(1));
    }

    public boolean patternMatching(ArrayList<String> input, String pattern) {
        for (int i = 0; i < input.size(); i++) {
            String string = input.get(i);
            Trie3 suffixTrie = new Trie3();
            for (int j = 0; j < string.length(); j++) {
                suffixTrie.add(string.substring(j));
            }
            if (suffixTrie.search(pattern)) {
                return true;
            }
        }
        return false;
    }

    public void add(String word) {
        if (insert(root, word)) {
            this.count++;
        }
    }

    private boolean insert(TrieNode root, String word) {
        if (word.length() == 0) {
            if (!root.isTerminating) {
                root.isTerminating = true;
                return true;
            } else {
                return false;
            }
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        return insert(child, word.substring(1));
    }
}

public class q_a_1_Pattern_Matching {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Trie3 t = new Trie3();
        int n = Integer.parseInt(br.readLine().trim());
        ArrayList<String> input = new ArrayList<String>();
        String[] words = br.readLine().split("\\s");
        for (int i = 0; i < n; i++) {
            input.add(words[i]);
        }
        String pattern = br.readLine();
        System.out.println(t.patternMatching(input, pattern));
    }
}
