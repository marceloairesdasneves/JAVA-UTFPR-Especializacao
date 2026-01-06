package beecrowd_examples; // Declaracao do pacote
import java.util.Scanner; // importacao da classe Scanner para leitura de dados do teclado.

public class BEE1012 { // Definicao da classe BEE1012
    public static void main(String[] args) { //Metodo main ponto de entrada do programa JAVA
        Scanner scanner; //Declara uma variavel do tipo scanner
        scanner = new Scanner(System.in);//Instancia um objeto Scanner
        
        //Declared variables do tipo primitivo double.
        double A = 0.0, B = 0.0, C = 0.0;
        double triangle = 0.000, circle = 0.000, trapezium = 0.000, square = 0.000, rectangle = 0.000;
        
        //Input Samplesj, faz a leitura dos valores
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();
        //Calculate the values, gera os valores das variaveis
        triangle = (A * C) / 2;
        circle = Math.pow(C, 2) * 3.14159;
        trapezium = ((A + B) * C)/2;
        square = B * B;
        rectangle = A * B;
        //Output Samples, imprime os valores calculados
        System.out.printf("TRIANGULO: %.3f%n", triangle);//imprime o texto formatado printf com 3 casas deciamis %.3f%n, quebra a linha 
        System.out.printf("CIRCULO: %.3f%n", circle);
        System.out.printf("TRAPEZIO: %.3f%n", trapezium);
        System.out.printf("QUADRADO: %.3f%n", square);
        System.out.printf("RETANGULO: %.3f%n", rectangle);
        
        scanner.close();//fecha a classe instanciada scanner.
    }//close the main class
}//close the class
