package beecrowd_examples;
import java.util.Scanner;

public class BEE1011 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        double pi = 3.14159;
        double result, radius;
        
        //formula to calculate the volume is (4/3) * pi * R*3)
        radius = scanner.nextDouble();
        result = ((((Math.pow(radius, 3)) * pi) * 4.0)/3.0);
        System.out.printf("VOLUME = %.3f%n", result);
        
        scanner.close();
    }
}
