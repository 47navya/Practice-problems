import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        

        if (n > 0 && (n & (n - 1)) == 0)
            System.out.println(n + " is a power of two.");
        else
            System.out.println(n + " is NOT a power of two.");
    }
}
