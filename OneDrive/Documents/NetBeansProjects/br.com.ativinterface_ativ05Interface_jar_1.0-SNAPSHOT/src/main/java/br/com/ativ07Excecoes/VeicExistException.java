package br.com.ativ07Excecoes;

public class VeicExistException extends Exception {
    public VeicExistException(String placa) {
        super("Ja existe um veiculo com esta placa: " + placa);
    }
}
