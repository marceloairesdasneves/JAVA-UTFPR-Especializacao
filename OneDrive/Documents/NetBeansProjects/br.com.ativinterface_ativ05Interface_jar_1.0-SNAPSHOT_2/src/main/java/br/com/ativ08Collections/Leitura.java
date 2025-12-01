package br.com.ativ08Collections;

import java.util.Scanner;

public class Leitura {
    Scanner scanner = new Scanner(System.in);
    public String entDados(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }
}
