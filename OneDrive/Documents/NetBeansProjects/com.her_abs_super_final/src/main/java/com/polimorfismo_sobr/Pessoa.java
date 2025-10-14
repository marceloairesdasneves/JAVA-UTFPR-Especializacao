/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polimorfismo_sobr;

/**
 *
 * @author USER
 */
public class Pessoa {
    private int cpf;
    private String nome;
    
    //==================================
    public void impLocal(){
        System.out.println("\nEstou na classe PESSOA que e a classe MAE ");
    }
    //==================================
    
    public int getCpf(){
        return cpf;
    }
    public String getNome(){
        return nome;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    
}
