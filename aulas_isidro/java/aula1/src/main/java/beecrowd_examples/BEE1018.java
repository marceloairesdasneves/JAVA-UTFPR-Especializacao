/*
 * In this problem you have to read an integer value and calculate the smallest possible number of banknotes 
 * in which the value may be decomposed. The possible banknotes are 100, 50, 20, 10, 5, 2 and 1. 
 * Print the read value and the list of banknotes.
 */
package beecrowd_examples;
import java.util.Scanner;

/**
 *
 * @author Marcelo Neves
 */
public class BEE1018 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        System.out.println(amount);
        
        int m100 = amount / 100;
        amount %= 100;

        int m50 = amount / 50;
        amount %= 50;

        int m20 = amount / 20;
        amount %= 20;

        int m10 = amount / 10;
        amount %= 10;

        int m5 = amount / 5;
        amount %= 5;

        int m2 = amount / 2;
        amount %= 2;
        
        int m1 = amount;

        System.out.println(m100 + " nota(s) de R$ 100,00");
        System.out.println(m50 + " nota(s) de R$ 50,00");
        System.out.println(m20 + " nota(s) de R$ 20,00");
        System.out.println(m10 + " nota(s) de R$ 10,00");
        System.out.println(m5 + " nota(s) de R$ 5,00");
        System.out.println(m2 + " nota(s) de R$ 2,00");
        System.out.println(m1 + " nota(s) de R$ 1,00");
        input.close();
    }
}
