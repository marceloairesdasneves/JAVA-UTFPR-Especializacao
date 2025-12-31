package beecrowd_examples;
import java.util.Scanner;

public class BEE1006 {

        public static void main(String[] args) {
            double A, B, C, MEDIA;

            Scanner input = new Scanner(System.in);
            A = input.nextDouble();
            B = input.nextDouble();
            C = input.nextDouble();

            MEDIA = (A * 2 + B * 3 + C * 5) / 10.0;
            System.out.printf("MEDIA = %.1f\n", MEDIA);
        }
    }
