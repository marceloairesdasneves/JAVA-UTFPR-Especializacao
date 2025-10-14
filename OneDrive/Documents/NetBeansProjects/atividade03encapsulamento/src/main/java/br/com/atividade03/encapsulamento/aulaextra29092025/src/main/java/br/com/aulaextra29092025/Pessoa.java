package br.com.aulaextra29092025;

public class Pessoa { //Classe entidades, que modela um objeto do mundo real. (Modelo de Dados)
    //conhecida como classe de visao (MVC, Model View e Controller)
    //Atributos - Declarando variaveis Globais
    //O Encapsulamento e um conceito de gererenciar as trocas de mensagens entre objetos, possui os niveis
    //(modificador/especificador de acesso) Tipos -private-restricao total, +public - sem restricao, 
    //(Tipos #protected (utilizado na Heranca) e package sao restricoes parciais) 
    private int cpf;//atributo do tipo int, tipo primitivo. O modificador de acesso e somente acessado pelo metodos Getters e Setters.
    private String nome; //atributo tipo (Abstrato)referencia (Objeto/classe)

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

//OOP possui 4 artefatos, Classes, Atributos, Metodos e Objetos (Programacao)
//UML, Diagrama de classes, Sequencias (Lista de requisitos)
//OOP 3 conceitos, 
//sao Encapsulamentos, que possui niveis de acessos como o -Private, +Public, #Protected e Package.
//O #Protected necessita de heranca para implementacao.
//Conceito Polimorfismo, Sobrecarga, aplica-se a Metdoso ou Sobrecrista (Overrider - Heranca e ou estrutura de Interface)
//Conceito de Coercao (Necessita de Heranca para sua funcionalidades)
//Conceito de Heranca.