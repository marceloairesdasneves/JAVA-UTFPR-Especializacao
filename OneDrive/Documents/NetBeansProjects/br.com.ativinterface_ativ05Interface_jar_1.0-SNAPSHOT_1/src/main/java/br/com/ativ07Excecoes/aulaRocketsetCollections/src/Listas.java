    import java.util.*;

    public class Listas {
        public static void main(String[] args) {
            List linguagens = new ArrayList();
            Scanner scanner = new Scanner(System.in);
            String input = "";
            while (true) {
                System.out.print("Digite uma linguagem de programação (ou 'sair' para encerrar): ");
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("sair")) {
                    break;
                }
                linguagens.add(input);
            }
            System.out.println("Linguagens de programação digitadas:");
            for (Object linguagem : linguagens) {
                System.out.println(linguagem);
            }
        }
    }
