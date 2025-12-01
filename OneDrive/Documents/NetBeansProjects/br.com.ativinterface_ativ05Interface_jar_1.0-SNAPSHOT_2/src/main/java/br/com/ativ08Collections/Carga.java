package br.com.ativ08Collections;

public final class Carga extends Veiculo implements Calcular{
    private int cargaMax;
    private int tara;

    public Carga(){
        super();
        this.cargaMax = 0;
        this.tara = 0;
    }
    public Carga(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, Motor motor, int cargaMax, int tara){
        super(placa, marca, modelo, cor, velocMax, qtdRodas, motor);
        this.cargaMax = cargaMax;
        this.tara = tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public void Calcular(){
        System.out.println("\nTeste calcular Carga");
    }

    @Override
    public void calcVel() {
        System.out.println("Velocidade Maxima: " + getVelocMax() * 10000 + " km/h");
    }

    @Override
    public int getQtdPassageiros() {
        return 0;
    }

    @Override
    public int calcular(){
        int somNum = 0;
        somNum+=getMotor().getQtdPist();
        somNum+=getMotor().getPotencia();
        somNum+=getQtdRodas();
        somNum+= (int)getVelocMax();
        somNum+=getCargaMax();
        somNum+=getTara();
        return somNum;

    }


}
