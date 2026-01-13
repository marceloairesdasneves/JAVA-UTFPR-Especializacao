package beecrowd_examples; //name of package
import java.util.Scanner; // import the specific Classe Scanner to get some date by keyboard.

public class BEE1014 { // Declared the class
    public static void main(String[] args) { //start the main metodo to start JAVA code.
        Scanner scanner; // declared the variable Scanner.
        scanner = new Scanner(System.in); // instance the Scanner Class 
        
        // Calculate the average with 2 values, one type Int to KM and floating point numeber to fuel total, use 3 digti after the decimal point
        // declared variables
        int km;
        double fuel;
        double totalFuel;
        
        km = scanner.nextInt();
        fuel = scanner.nextDouble();
        totalFuel = km / fuel;
        
        // print the information
        System.out.printf("%.3f km/l%n", totalFuel);
        scanner.close();
    }
}
