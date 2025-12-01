package br.com.ativ08Collections;

import java.util.*;
import java.util.List;

public class DBVeiculos {
    // Simulacao com a List e inicializacao com ArrayList
    private List<Passeio> dbPas = new ArrayList<>();
    private List<Carga> dbCar = new ArrayList<>();
    
    public List<Passeio> getListaVeiculos() {
        return dbPas;
    }
    public void setDBPas(List<Passeio> dbPas) {
        this.dbPas = dbPas;
    }
    public List<Carga> getDBCar() {
        return dbCar;
    }
    public void setDBCar(List<Carga> dbCar) {
        this.dbCar = dbCar;
    }

}