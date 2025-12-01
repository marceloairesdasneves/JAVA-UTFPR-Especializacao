package br.com.ativ07Excecoes;

import java.util.ArrayList;

public class DBVeiculos {
    private Passeio[] passeio;
    private Carga[] carga;
       

    public DBVeiculos(int capacidade) {
        this.passeio = new Passeio[capacidade];
        this.carga = new Carga[capacidade];
    }

    public Passeio[] getPasseio() {
        return passeio;
    }

    public void setPasseio(Passeio[] passeio) {

        this.passeio = passeio;
    }

    public Carga[] getCarga() {

        return carga;
    }

    public void setCarga(Carga[] carga) {

        this.carga = carga;
    }
}
