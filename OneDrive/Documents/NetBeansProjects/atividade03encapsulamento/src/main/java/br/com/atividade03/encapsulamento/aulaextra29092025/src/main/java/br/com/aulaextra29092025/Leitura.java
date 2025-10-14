package br.com.aulaextra29092025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Leitura {//Classe de Interacao, conhecida como classe de visao (MVC, Model View e Controller)
    
    public String entDados(String rotulo){
        System.out.println(rotulo);
        String ret = "";
        
        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(teclado);
        try {
            ret = buff.readLine();
        } catch (IOException ex) {
            //System.getLogger(Leitura.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            System.out.println("\nERRO: JVM ou RAM");
        }
        
        return ret;
        
    }
    
}
