package br.com.ativ07Excecoes;


public final class Passeio extends Veiculo implements Calcular {
    private int qtdPassageiros;

    public Passeio() {
        super();
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    @Override
    public void calcVel() {
        System.out.println("Velocidade - Passeio: " + getVelocMax() * 1000 + " km/h");
    }

    @Override
    public int calcular(){
        int somaLetras = 0;
        somaLetras += getPlaca().length();
        somaLetras += getMarca().length();
        somaLetras += getModelo().length();
        somaLetras += getCor().length();
        return somaLetras;
    }


}
