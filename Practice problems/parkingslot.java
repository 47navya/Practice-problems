package nineteenmarch;
import java.util.Scanner;
public class parkingslot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the parking lot: ");
        int n = sc.nextInt();
        System.out.print("Enter parking lot status (use 'S' for empty and 'X' for occupied): ");
        String input = sc.next();
        char[] arr = input.toCharArray();
        int currentCount = 0;
        int maxCount = 0;
        for (char c : arr) {
            if (c == 'S') {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }
        maxCount = Math.max(maxCount, currentCount);
        System.out.println("Maximum number of cars that can be parked consecutively: " + maxCount);
        sc.close();
    }
}