public class RGB {
    public static int toGrayscale(int r, int g, int b) {
        return (r & 0xFF) * 30 / 100 + (g & 0xFF) * 59 / 100 + (b & 0xFF) * 11 / 100; 
    }

    public static void main(String[] args) {
        int grayscale = toGrayscale(100, 150, 200);
        System.out.println("Grayscale value: " + grayscale);
    }
}
