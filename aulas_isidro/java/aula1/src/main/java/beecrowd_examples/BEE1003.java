package beecrowd_examples;

import java.util.Scanner;

public class BEE1003{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A, B, SOMA;
        
        A = teclado.nextInt();
        B = teclado.nextInt();
        
        SOMA = A + B;
        
        System.out.println("SOMA = " + SOMA);
        teclado.close();
    }
}