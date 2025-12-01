package br.com.ativ07Excecoes;

public class VelocException extends Exception {
    public VelocException() {
        super("A velocidade maxima permitida entre 80 e 110 km/h");
    }
}
