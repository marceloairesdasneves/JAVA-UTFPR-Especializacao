package beecrowd_examples;
import java.util.Scanner;

/**
 * Distance
 * @author Marcelo Neves
 */
public class BEE1016 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        int carX = 60; //60km/h
        int carY = 90; //90km/h
        int oneKmForEach = scanner.nextInt(); // 2minutes
        
        int minutos = oneKmForEach * 2;
        System.out.println(minutos + " minutos");
        
        scanner.close();
    }
}
