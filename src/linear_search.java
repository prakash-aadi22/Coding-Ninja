public class linear_search {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int k = 15;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.println(i);
            }
        }
    }
}
