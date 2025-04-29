public class Swap {
    public static void main(String[] args) {
        int m = 5;
        int n = 10;
        
        System.out.println("Before swapping: m = " + m + ", n = " + n);
        
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        
        System.out.println("After swapping: m = " + m + ", n = " + n);
    }
}
