import java.util.Random;
import java.util.Scanner;

public class Dz22 {
    public static void main(String[] args) {
        final Random random = new Random();
        int k = 0;
        double q;
        int q2;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            try {
                k = random.nextInt();
                if (k < 0) throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("Число не может быть ниже нуля: " + e.getMessage());
            }
            q = Math.sqrt(k);
            q2 = (int) q;
            if (q2 * q2 == k) {
                System.out.println((int) q);
            }
        }
    }
}

