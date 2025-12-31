package beecrowd_examples;
import java.util.Scanner;

public class BEE1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int workId;
        int amountReceived;
        double salaryWorkedHours;
        
        workId = input.nextInt();
        amountReceived = input.nextInt();
        salaryWorkedHours = input.nextDouble();
        
        System.out.println("NUMBER = " + workId);
        System.out.printf("SALARY = U$ %.2f", salaryWorkedHours * amountReceived);
        
    }
}
