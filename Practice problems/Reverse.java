import java.util.Scanner;

public class Reverse{
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1; 
            result |= (n & 1); 
            n >>= 1; 
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        scanner.close();
        
        int reversed = reverseBits(n);
        System.out.println("Original: " + Integer.toBinaryString(n));
        System.out.println("Reversed: " + Integer.toBinaryString(reversed));
    }
}
