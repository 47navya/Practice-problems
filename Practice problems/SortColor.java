import java.util.Arrays;
public class SortColor {
    static void sortColor(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low++] = arr[mid];
                arr[mid++] = temp;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high--] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortColor(arr);
        System.out.println(Arrays.toString(arr));
    }
}

