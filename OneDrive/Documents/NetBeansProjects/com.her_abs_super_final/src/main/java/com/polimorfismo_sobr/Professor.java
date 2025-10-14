/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polimorfismo_sobr;

/**
 *
 * @author USER
 */
public class Professor extends Pessoa {
    private int salario;
    private String titulo;
    
    //==================================
    @Override
    public void impLocal(){//polimorfismo por sobreescrita
        System.out.println("\nEstou na classe FILHO, Professor, imprimindo o impLocal por SobreCarga");
        super.impLocal();//super e um objeto, aponta para a classe-mae PESSOA no mecanisco de heranca
    }
    //==================================
    
    
    public int getSalario(){
        return salario;
    }
    public String getTitulo(){
        return titulo;
    }
    
    public void setSalario(int salario){
        this.salario = salario;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
}
