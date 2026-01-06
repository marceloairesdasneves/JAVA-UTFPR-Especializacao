package beecrowd_examples;
import java.util.Scanner;

public class BEE1009 {
    public static void main(String[] args) {
        //variable
        try (Scanner scanner = new Scanner(System.in)) {
            //variable
            String firstName = scanner.nextLine();
            double salary = scanner.nextDouble();
            double soldSalary = scanner.nextDouble();
            
            System.out.printf("TOTAL = R$ %.2f ", (soldSalary * 0.15) + salary);
        }
    }
}
