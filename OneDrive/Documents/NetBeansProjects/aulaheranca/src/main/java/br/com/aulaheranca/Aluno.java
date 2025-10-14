/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.aulaheranca;

/**
 *
 * @author USER
 */
public class Aluno extends Pessoa {
    private int ra;
    private String curso;
    
    public int getRa(){
        return ra;
    }
    public String getCurso(){
        return curso;
    }
    
    public void setRa(int ra){
        this.ra = ra;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
}
