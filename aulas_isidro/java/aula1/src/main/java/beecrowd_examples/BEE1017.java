/*
 * calculate and show the amount of spent fuel liters on a trip, using a car that does 12 Km/L.
 * For this, he would like you to help him through a simple program. To perform the calculation, you have to read spent 
 * time (in hours) and the same average speed (km/h)
 */
package beecrowd_examples;
import java.util.Scanner;

public class BEE1017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int time, distance;
        time = scanner.nextInt();
        distance = scanner.nextInt();
        
        double litter = (time * distance) / 12.0;
        
        System.out.printf("%.3f%n", litter);
                
    }
    
}
