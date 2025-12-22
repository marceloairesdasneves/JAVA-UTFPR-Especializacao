package br.com.ativ09InterfaceGrafica;

public class VeicExistException extends Exception {
    public VeicExistException(String placa) {
        super("Ja existe um veiculo com esta placa: " + placa);
    }
}
