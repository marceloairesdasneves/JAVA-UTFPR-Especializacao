import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int intNum1 = readInt(teclado, "Digite um número inteiro: ");
        int intNum2 = readInt(teclado, "Digite outro número inteiro: ");

        int soma = intNum1 + intNum2;
        System.out.println("A soma dos números é: " + soma);

        teclado.close();
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            }
        }
    }
}
