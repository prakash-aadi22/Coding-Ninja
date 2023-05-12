public class binary_search {
    public static void main(String[] args) {
        int[] arr = {10, 12, 24, 29, 39, 40, 51};
        int value = 40;
        int start = 0, end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int mid = (end - start) / 2;
            if (arr[i] == value) {
                System.out.println(i);
            } else if (arr[mid] < value) {
                start = mid + 1;
            } else if (arr[mid] > value) {
                end = mid - 1;
            }
        }
    }
}
