/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beecrowd_examples;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TesteIf {
    public static void main(String[] args) {
        Scanner teclado;
        teclado = new Scanner(System.in);
        int n1, n2, media;
        
        System.out.print("Digite N1: ");
        n1 = teclado.nextInt();
        System.out.print("Digite N2: ");
        n2 = teclado.nextInt();
        media = (n1 + n2) / 2;
        
        if(media >= 6){
            System.out.println("A \"media\" foi de: " + media + " Aprovado");
        }else{
            System.out.println("A \"media\" foi de: " + media + " Reprovado");
        }
        teclado.close();
    }
}
