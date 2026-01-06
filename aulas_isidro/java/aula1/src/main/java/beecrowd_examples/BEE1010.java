package beecrowd_examples;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BEE1010 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int product1, product2, unitProduct1, unitProduct2 = 0;
        double valueProduct1, valueProduct2, valueTotalProduct = 0.0;
        try{
            product1 = scanner.nextInt();
            unitProduct1 = scanner.nextInt();
            valueProduct1 = scanner.nextDouble();
            
            product2 = scanner.nextInt();
            unitProduct2 = scanner.nextInt();
            valueProduct2 = scanner.nextDouble();
            
            valueTotalProduct = (unitProduct1 * valueProduct1) + (unitProduct2 * valueProduct2) ;
                
            System.out.printf("Value to Pay: R$ %.2f%n", valueTotalProduct);
        }catch(InputMismatchException e){
                System.out.println("Error: invalid input.");
            }finally{
                scanner.close();
        }
    }
}
