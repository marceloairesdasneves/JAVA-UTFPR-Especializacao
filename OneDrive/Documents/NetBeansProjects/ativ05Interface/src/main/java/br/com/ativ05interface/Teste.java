package br.com.ativ05interface;


import java.util.Scanner;

public class Teste {
    private static Passeio passeio = new Passeio();
    private static Carga carga = new Carga();
    private static Passeio[] vetPasseio = new Passeio[5];
    private static Carga[] vetCarga = new Carga[5];
    private static int contador = 0;
    private static Leitura l = new Leitura();
    private static int opcao = 0;
    private static int i;
    private static int qtdPassageiros;
    
    public static void main(String[] args) {
        int opcao = 0;
        boolean continua = true;
        
        System.out.println("\n|--------------------------------------------------------|");
        System.out.println("|          Atencao: nao tratei todas as excecoes         |");
        System.out.println("|--------------------------------------------------------|");
        
        
        do{
            System.out.println("\nSistema de Gestao de Veiculos - Menu Inicial\n");
            Scanner scanner = new Scanner(System.in);
            System.out.println("(1) Cadastrar Veiculo de Passeio ");
            System.out.println("(2) Cadastrar Veiculo de Carga ");
            System.out.println("(3) Imprimir Todos os Veiculos de Passeio ");
            System.out.println("(4) Imprimir Todos os Veiculos de Carga ");
            System.out.println("(5) Imprimir Veiculo de Passeio pela Placa ");
            System.out.println("(6) Imprimir Veiculo de Carga pela Placa ");
            System.out.println("(7) Sair do sistema ");
            
            try{
                opcao = Integer.parseInt(l.entDados("\nEscolha uma opcao < 1 a 7 >: "));
            }
            catch(NumberFormatException nfe){
                System.out.print("\nDeve ser um numero entre < 1 e 7 >: ");
                l.entDados("");
                if (opcao == 7){
                    break;
                }
                continue;
            }
            
            switch(opcao){ //cadVeicP(passeio);
                case 1: 
                    //for (int i = 0; i < vetPasseio.length; i++) {
                    for(int i = achaVagP();i<vetPasseio.length;i++){
                        if(i == -1){
                            l.entDados("\nVetor de PASSEIO esta cheio. press <Enter>");
                            break;
                        }
                        passeio = new Passeio();
                        vetPasseio[i] = cadVeicP(passeio);
                        l.entDados("\nPASSEIO armazenado na posicao " + i + " do VETOR - press <ENTER>");
                        String respPass = l.entDados("\nDeseja cadastrar outro? <s/n>");
                        if(respPass.equalsIgnoreCase("n")){
                            break;
                        }
                        if(achaVagP() == -1){
                            l.entDados("\nVetor PASSEIO esta cheio - press <ENTER> ");
                        break;
                        }    
                    }
                    break;
                
                case 2:  
                        for(int i = achaVagC();i<vetCarga.length;i++){//for (int i = 0; i < vetCarga.length; i++) { //cadVeicC(carga);
                            if(i == -1){
                                l.entDados("\nVetor de CARGA esta cheio - press <Enter>");
                            break;
                        }
                            carga = new Carga();
                            vetCarga[i] = cadVeicC(carga);
                            l.entDados("\nCARGA armazenado na posicao " + i + " do VETOR - press <ENTER>");
                            String respPass = l.entDados("\nDeseja cadastrar outro? <s/n>");
                            if(respPass.equalsIgnoreCase("n")){
                                break;
                            }
                            if(achaVagC() == -1){
                                l.entDados("\nVetor CARGA esta cheio - press <ENTER> ");
                            break;
                            }    
                        }
                        break;
                    
                case 3: 
                        System.out.println("======================================");
                        System.out.println("\nPASSEIO - Impressao de TODOS veiculos.");//impVeicP(passeio, i);
                        System.out.println("======================================");
                        for (int i = 0; i < vetPasseio.length; i++) {
                            if(vetPasseio[i] != null){
                                impVeicP(vetPasseio[i], i);
                            }
                            else{
                                l.entDados("\nSem mais veiculo PASSEIO para imprimir - press <ENTER>");
                            }
                        }
                        System.out.println("==========================================");
                        break;
                    
                case 4: 
                        System.out.println("======================================");
                        System.out.println("\nCARGA - Impressao de TODOS veiculos.");//impVeicC(carga, i);
                        System.out.println("======================================");
                        for (int i = 0; i < vetCarga.length; i++) {
                            if(vetCarga[i] != null){
                                impVeicC(vetCarga[i], i);
                            }
                            else{
                                l.entDados("\nSem mais veiculo CARGA para imprimir - press <ENTER>");
                            }
                        }
                        System.out.println("==========================================");
                        break;
                
                case 5: 
                        System.out.println("============================================");
                        System.out.println("\nPASSEIO - Impressao de veiculos por PLACA.");////impVeicPPlaca();
                        System.out.println("============================================");
                        passeio = new Passeio();
                        boolean existPlacaPasseio = false;
                        String placaPasseio = l.entDados("\nInforme a PLACA para pesquisar: ");
                        passeio.setPlaca(placaPasseio);
                        for (int i = 0; i < vetPasseio.length; i++) {
                            if(vetPasseio[i].getPlaca().equalsIgnoreCase(passeio.getPlaca())){
                                impVeicPPlaca(vetPasseio[i], i);
                                existPlacaPasseio = true;
                            }
                        }
                        if(!existPlacaPasseio){
                            l.entDados("\n\n\t\t=======NAO EXISTE VEICULO COM ESSA PLACA press <ENTER>======");
                        }
                        break;
                    
                case 6: 
                        System.out.println("============================================");
                        System.out.println("\nCARGA - Impressao de veiculos por PLACA.");//impVeicCPlaca();
                        System.out.println("============================================");
                        carga = new Carga();
                        boolean existPlacaCarga = false;
                        String placaCarga = l.entDados("\nInforme a PLACA para pesquisar: ");
                        carga.setPlaca(placaCarga);
                        for (int i = 0; i < vetCarga.length; i++) {
                            if(vetCarga[i].getPlaca().equalsIgnoreCase(carga.getPlaca())){
                                impVeicCPlaca(vetCarga[i], i);
                                existPlacaCarga = true;
                            }
                        }
                        if(!existPlacaCarga){
                            l.entDados("\n\n\t\t=======NAO EXISTE VEICULO COM ESSA PLACA press <ENTER>======");
                        }
                        break;
                    
                case 7: sair();
                    break;
                default: 
                    System.out.print("\nSelecione uma opcao valida entre < 1 e 7 >. ");
            }
        }while(opcao != 7);
    }

    public static int achaVagP(){
        for (int i = 0; i < vetPasseio.length; i++) {
            if(vetPasseio[i] == null){
                return i;
            }
        }
        return -1;
    }
    
        public static int achaVagC(){
        for (int i = 0; i < vetCarga.length; i++) {
            if(vetCarga[i] == null){
                return i;
            }
        }
        return -1;
    }
    
    private static Passeio cadVeicP(Passeio passeio) {
        System.out.println("\n================================================");
        System.out.println("        Cadastro de veiculo de PASSEIO");
        System.out.println("================================================");
        passeio.setQtdPassageiros(Integer.parseInt(l.entDados("\nQtd de Passageiros....: ")));
        passeio.setPlaca(l.entDados("Placa.................: "));
        passeio.setMarca(l.entDados("Marca.................: "));
        passeio.setCor(l.entDados("Cor...................: "));
        passeio.setQtdRodas(Integer.parseInt(l.entDados("Qtd de Rodas..........: ")));
        passeio.setVelocMax((int)Integer.parseInt(l.entDados("Velocidade Maxima.....: ")));
        passeio.getMotor().setQtdPist(Integer.parseInt(l.entDados("Qtd de Pistoes........: ")));
        passeio.getMotor().setPotencia(Integer.parseInt(l.entDados("Potencia do Motor.....: ")));
        return passeio; 
    }
    
    private static void impVeicP(Passeio passeio, int i) {
        System.out.println("\n================================================");
        System.out.println("        Imprimir veiculo de PASSEIO " + i);
        System.out.println("================================================");
        System.out.println("\nPasseio armazenado no endereco....: "+ i + "(do vetor vetPasseio)");
        System.out.println("Qtd de Passageiros....: " + passeio.getQtdPassageiros());
        System.out.println("Placa....: " + passeio.getPlaca());
        System.out.println("Marca....: " + passeio.getMarca());
        System.out.println("Modelo....: " + passeio.getModelo());
        System.out.println("Cor....: " + passeio.getCor());
        System.out.println("Qtd Rodas....: " + passeio.getQtdRodas());
        System.out.println("Velocidade Maxima....: " + passeio.getVelocMax());
        System.out.println("Qtd Pistoes Motor....: " + passeio.getMotor().getQtdPist());
        System.out.println("Potencia do Motor....: " + passeio.getMotor().getPotencia());
        System.out.println("Qtd total de Letras....: " + passeio.calcular());
        passeio.calcVel();
    }
    
    private static Carga cadVeicC(Carga carga) {
        System.out.println("\n================================================");
        System.out.println("        Cadastro de veiculo de CARGA");
        System.out.println("================================================");
        carga.setPlaca(l.entDados("\nPlaca.................: "));
        carga.setMarca(l.entDados("Marca.................: "));
        carga.setCor(l.entDados("Cor...................: "));
        carga.setQtdRodas(Integer.parseInt(l.entDados("Qtd de Rodas..........: ")));
        carga.setVelocMax((int)Integer.parseInt(l.entDados("Velocidade Maxima.....: ")));
        carga.getMotor().setQtdPist(Integer.parseInt(l.entDados("Qtd de Pistoes........: ")));
        carga.getMotor().setPotencia(Integer.parseInt(l.entDados("Potencia do Motor.....: ")));
        carga.setCargaMax(Integer.parseInt(l.entDados("Carga Maxima..........: ")));
        carga.setTara(Integer.parseInt(l.entDados("Tara..................: ")));
        return carga; 
    }

    private static void impVeicC(Carga carga, int i) {
        System.out.println("\n================================================");
        System.out.println("        Imprimir veiculo de CARGA " + i);
        System.out.println("================================================");
        System.out.println("\nPasseio armazenado no endereco....: "+ i + "(do vetor vetCarga)");
        System.out.println("Placa................: " + carga.getPlaca());
        System.out.println("Marca................: " + carga.getMarca());
        System.out.println("Modelo...............: " + carga.getModelo());
        System.out.println("Cor..................: " + carga.getCor());
        System.out.println("Qtd Rodas............: " + carga.getQtdRodas());
        System.out.println("Velocidade Maxima....: " + carga.getVelocMax());
        System.out.println("Qtd Pistoes Motor....: " + carga.getMotor().getQtdPist());
        System.out.println("Potencia do Motor....: " + passeio.getMotor().getPotencia());
        System.out.println("Carga Maxima.........: " + carga.getCargaMax());
        System.out.println("Qtd total de Letras....: " + carga.calcular());
        carga.calcVel();
    }

    private static void impVeicPPlaca(Passeio passeio, int i) {
        System.out.println("\n================================================");
        System.out.println("        Imprimir veiculo de PASSEIO por Placa");
        System.out.println("================================================");
        System.out.println("Qtd de Passageiros....: " + passeio.getQtdPassageiros());
        System.out.println("Placa................: " + passeio.getPlaca());
        System.out.println("Marca................: " + passeio.getMarca());
        System.out.println("Modelo...............: " + passeio.getModelo());
        System.out.println("Cor..................: " + passeio.getCor());
        System.out.println("Qtd Rodas............: " + passeio.getQtdRodas());
        System.out.println("Velocidade Maxima....: " + passeio.getVelocMax());
        System.out.println("Qtd Pistoes Motor....: " + passeio.getMotor().getQtdPist());
        System.out.println("Potencia do Motor....: " + passeio.getMotor().getPotencia());
        System.out.println("Qtd total de Letras....: " + passeio.calcular());
        passeio.calcVel();
    }

    private static void impVeicCPlaca(Carga carga, int i) {
        System.out.println("\n================================================");
        System.out.println("        Imprimir veiculo de CARGA por Placa");
        System.out.println("================================================");
        System.out.println("\nPasseio armazenado no endereco....: "+ i + "(do vetor vetCarga)");
        System.out.println("Placa................: " + carga.getPlaca());
        System.out.println("Marca................: " + carga.getMarca());
        System.out.println("Modelo...............: " + carga.getModelo());
        System.out.println("Cor..................: " + carga.getCor());
        System.out.println("Qtd Rodas............: " + carga.getQtdRodas());
        System.out.println("Velocidade Maxima....: " + carga.getVelocMax());
        System.out.println("Qtd Pistoes Motor....: " + carga.getMotor().getQtdPist());
        System.out.println("Potencia do Motor....: " + passeio.getMotor().getPotencia());
        System.out.println("Carga Maxima.........: " + carga.getCargaMax());
        System.out.println("Qtd total de Letras....: " + carga.calcular());
        carga.calcVel();
    }

    private static void sair() {
        //int opcao = 0;
        if (opcao == 7){
            sair();
        }
    } 
}

