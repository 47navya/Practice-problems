package nineteenmarch;
import java.util.*;
public class primeassumprime {
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i*i<= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    static int countConsecutivePrimeSum(int n) {
        int sum = 0;
        int count = 0;
        int lsp=0;
        for (int i = 2; sum <= n; i++) {
            if (isPrime(i)) {
                sum += i;
                //if (sum > n) break; 
                if (sum >= 3 && isPrime(sum)) {
                    count++;
                    lsp=sum;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        int result = countConsecutivePrimeSum(n);
        System.out.println("Number of primes expressible as sum of consecutive primes starting from 2: " + result);
        sc.close();
    }
}

