/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.aulaheranca;

/**
 *
 * @author USER
 */
public class TstPes {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.setNome("Professor Jose Luiz"); //usado por meio de heranca da classe pessoa
        prof.setCpf(25); //usado por meio de heranca da classe pessoa
        prof.setSalario(1000); //pertence a propria classe
        prof.setTitulo("Mestre");
        
        System.out.println("\nCPF PROFESSOR       " + prof.getCpf() );//usado por meio de heranca da classe pessoa
        System.out.println("NOME PROFESSOR      " + prof.getNome() );//usado por meio de heranca da classe pessoa
        System.out.println("SALARIO PROFESSOR   " + prof.getSalario() );//pertence a propria classe professor
        System.out.println("TITULO PROFESSOR    " + prof.getTitulo() );//pertence a propria classe Professor
        
        System.out.println("\n*************ALUNO**********************");
        Aluno aluno = new Aluno();
        aluno.setNome("Marcelo"); //usado por meio de heranca da classe PESSOA
        aluno.setCpf(16); //usado por meio de heranca da classe PESSOA
        aluno.setRa(43); //usado por meio de heranca da classe ALUNO
        aluno.setCurso("Especializacao JAVA"); //usado por meio de heranca da classe ALUNO
        
        System.out.println("\nCPF ALUNO       " + aluno.getCpf() );//usado por meio de heranca da classe PESSOA
        System.out.println("NOME ALUNO      " + aluno.getNome() );//usado por meio de heranca da classe PESSOA
        System.out.println("RA ALUNO        " + aluno.getRa() );//pertence a propria classe ALUNO
        System.out.println("CURSO ALUNO     " + aluno.getCurso() );//pertence a propria classe ALUNO

    }
    
}
