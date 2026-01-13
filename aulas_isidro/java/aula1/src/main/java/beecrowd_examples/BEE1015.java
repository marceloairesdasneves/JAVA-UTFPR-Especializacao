package beecrowd_examples;
import java.util.Scanner;

/**
 * Distance Between Two Points
 * @author Marcelo Neves
 */
public class BEE1015 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        double distance;
        double x1 = scanner.nextDouble();//1.0;
        double y1 = scanner.nextDouble();//7.0;
        double x2 = scanner.nextDouble();//5.0;
        double y2 = scanner.nextDouble();//9.0;
        
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        System.out.printf("%.4f%n", distance);
        
        scanner.close();
    }
    
}
