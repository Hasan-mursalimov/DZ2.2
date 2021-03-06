import java.util.Random;
import java.util.Scanner;

public class Dz22 {
    public static void main(String[] args) {
        final Random random=new Random();
        int k = 0;
        double q;
        int q2;

        try {
            k=random.nextInt();
            System.out.println(k);
            if (k<0)throw new Exception();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        q=Math.sqrt(k);
        System.out.println(q);
        q2=(int)q;
        if (q2*q2==k){
            System.out.println(q);
        }

    }
    }

