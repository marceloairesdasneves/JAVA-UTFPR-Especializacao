package beecrowd_examples; //pacote onde localiza o codigo e sua organizacao.
import static java.lang.Math.abs;
import java.util.Scanner; // Importa a classe Scanner do java.util

public class BEE1013 { // Declaracao da classe 
    public static void main(String[] args) {// Declaracao do metodo principal em JAVA
        Scanner scanner; //Criado a variavel do tipo Scanner;
        scanner = new Scanner(System.in); //intancia do metodo scanner para efetuar a leitura do teclado
        
        // variable declaration
        int a = 0, b = 0, c = 0, maiorAB = 0, maior = 0;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        
        //max a and b
        maiorAB = (a + b + Math.abs(a - b))/ 2;
        //max c 
        maior = (maiorAB + c + Math.abs(maiorAB - c))/ 2;
        
        //print the information
        System.out.println(maior + " eh o maior");
        
    }
    
}
