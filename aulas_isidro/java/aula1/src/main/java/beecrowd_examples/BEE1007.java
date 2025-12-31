package beecrowd_examples;
import java.util.Scanner;

public class BEE1007 { 
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        int D;
        int DIFERENCA;
        
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        
        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
