import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Trie4 {
    private TrieNode root;
    public int count;

    public Trie4() {
        root = new TrieNode('\0');
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
            root.childCount++;
        }
        add(child, word.substring(1));
    }

    public void add(String word) {
        add(root, word);
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

    public boolean search(String word) {
        return search(root, word);
    }

    private void print(TrieNode root, String word) {
        if (root == null) {
            return;
        }
        if (root.isTerminating) {
            System.out.println(word);
        }
        for (TrieNode child : root.children) {
            if (child == null) {
                continue;
            }
            String fwd = word + child.data;
            print(child, fwd);
        }
    }

    public void print() {
        print(this.root, "");
    }

    /*..................... Palindrome Pair................... */

    public String reverse(String word) {
        String xString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            xString += word.charAt(i);
        }
        return xString;
    }

    public boolean isPalindromePair(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String string = reverse(words.get(i));
            Trie4 suffixTrie = new Trie4();
            for (int j = 0; j < string.length(); j++) {
                suffixTrie.add(string.substring(j));
            }
            for (String word : words) {
                if (suffixTrie.search(word)) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class q_a_2_Palindrome_Pair {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static ArrayList<String> takeInput() throws IOException {
        ArrayList<String> words = new ArrayList<>();
        int n = Integer.parseInt(br.readLine().trim());
        if (n == 0) {
            return words;
        }
        String[] listOfWords;
        listOfWords = br.readLine().split("\\s");
        for (int i = 0; i < n; ++i) {
            words.add(listOfWords[i]);
        }
        return words;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        Trie4 root = new Trie4();
        ArrayList<String> words = takeInput();
        System.out.println(root.isPalindromePair(words));
    }
}
