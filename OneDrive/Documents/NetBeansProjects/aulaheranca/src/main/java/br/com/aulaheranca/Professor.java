/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.aulaheranca;

/**
 *
 * @author USER
 */
public class Professor extends Pessoa {
    private int salario;
    private String titulo;
    
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
