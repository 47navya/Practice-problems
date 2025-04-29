import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
            return;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number.");
                return;
            }
        }
        
        System.out.println(n + " is a prime number.");
    }
}
