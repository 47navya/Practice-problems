public class Voting {
    static int findMajority(int[] arr) {
        int count = 0, candidate = -1;
        for (int num : arr) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element: " + findMajority(arr));
    }
}

