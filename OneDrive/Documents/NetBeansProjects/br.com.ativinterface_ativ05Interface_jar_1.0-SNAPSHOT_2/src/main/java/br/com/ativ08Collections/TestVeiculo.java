package br.com.ativ08Collections;

import br.com.ativ08Collections.*;

import java.util.Scanner;

// ATENÇÃO: As classes 'Passeio', 'Carga', 'Leitura', 'Motor', 'VelocException' e 'VeicExistException'
// devem existir em seu projeto para que este código compile corretamente.

public class TestVeiculo{

    // Variáveis de Controle Estáticas (Mantidas por serem necessárias para o array/funções estáticas)
    private static Passeio[] vetPasseio = new Passeio[5];
    private static Carga[] vetCarga = new Carga[5];
    private static Leitura l = new Leitura(); // Assumindo que 'Leitura' é uma classe utilitária

    // Declarações de variáveis fora do escopo estático foram removidas ou movidas para o método main.

    public static void main(String[] args) {

        // VARIÁVEIS LOCAIS: Instanciadas apenas uma vez, fora do loop
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        // As instâncias 'passeio' e 'carga' serão criadas localmente dentro do switch.
        Passeio passeio = null;
        Carga carga = null;

        do{
            System.out.println("\nSistema de Gestao de Veiculos - Menu Inicial\n");

            // Reutiliza o scanner criado no início
            System.out.println("(1) Cadastrar Veiculo de Passeio ");
            System.out.println("(2) Cadastrar Veiculo de Carga ");
            System.out.println("(3) Imprimir Todos os Veiculos de Passeio ");
            System.out.println("(4) Imprimir Todos os Veiculos de Carga ");
            System.out.println("(5) Imprimir Veiculo de Passeio pela Placa ");
            System.out.println("(6) Imprimir Veiculo de Carga pela Placa ");
            System.out.println("(7) Excluir Veiculo Passeio pela Placa ");
            System.out.println("(8) Excluir Veiculo Carga pela Placa ");
            System.out.println("(9) Sair do sistema ");

            try{
                // Leitura da opção. Usamos Integer.parseInt() para converter a string lida para int.
                opcao = Integer.parseInt(l.entDados("\nEscolha uma opcao < 1 a 9 >: "));
            }
            catch(NumberFormatException nfe){
                System.out.print("\nDeve ser um numero entre < 1 e 9 >: ");
                l.entDados(""); // Leitura adicional para consumo
                continue;
            }

            // Tratamento de exceção de execução (runtime) mais genérico.
            try {
                switch (opcao) {
                    case 1:
                        // Otimização: Acha a primeira vaga e só faz o loop a partir dela
                        int vagaPasseio = achaVagP();
                        if (vagaPasseio == -1) {
                            l.entDados("\nVetor de PASSEIO esta cheio. press <Enter>");
                            break;
                        }

                        // Loop de cadastro
                        for (int i = vagaPasseio; i < vetPasseio.length; i++) {
                            passeio = new Passeio(); // Criação local da instância
                            vetPasseio[i] = cadVeicP(passeio);
                            l.entDados("\nPASSEIO armazenado na posicao " + i + " do VETOR - press <ENTER>");

                            String respPass = l.entDados("\nDeseja cadastrar outro do mesmo Tipo? <s/n>");
                            if (respPass.equalsIgnoreCase("n")) {
                                break;
                            }
                            if (achaVagP() == -1) {
                                l.entDados("\nVetor PASSEIO esta cheio - press <ENTER> ");
                                break;
                            }
                        }
                        break;

                    case 2:
                        // Otimização: Acha a primeira vaga e só faz o loop a partir dela
                        int vagaCarga = achaVagC();
                        if (vagaCarga == -1) {
                            l.entDados("\nVetor de CARGA esta cheio. press <Enter>");
                            break;
                        }

                        // Loop de cadastro
                        for (int i = vagaCarga; i < vetCarga.length; i++) {
                            carga = new Carga(); // Criação local da instância
                            vetCarga[i] = cadVeicC(carga);
                            l.entDados("\nCARGA armazenado na posicao " + i + " do VETOR - press <ENTER>");

                            String respPass = l.entDados("\nDeseja cadastrar outro do mesmo Tipo? <s/n>");
                            if (respPass.equalsIgnoreCase("n")) {
                                break;
                            }
                            if (achaVagC() == -1) {
                                l.entDados("\nVetor CARGA esta cheio - press <ENTER> ");
                                break;
                            }
                        }
                        break;

                    case 3:
                        System.out.println("======================================");
                        System.out.println("\nPASSEIO - Impressao de TODOS veiculos.");
                        System.out.println("======================================");
                        for (int i = 0; i < vetPasseio.length; i++) {
                            if (vetPasseio[i] != null) {
                                impVeicP(vetPasseio[i], i);
                            } else {
                                l.entDados("\nSem mais veiculo PASSEIO para imprimir - press <ENTER>");
                                break;
                            }
                        }
                        System.out.println("==========================================");
                        break;

                    case 4:
                        System.out.println("======================================");
                        System.out.println("\nCARGA - Impressao de TODOS veiculos.");
                        System.out.println("======================================");
                        for (int i = 0; i < vetCarga.length; i++) {
                            if (vetCarga[i] != null) {
                                impVeicC(vetCarga[i], i);
                            } else {
                                l.entDados("\nSem mais veiculo CARGA para imprimir - press <ENTER>");
                                break;
                            }
                        }
                        System.out.println("==========================================");
                        break;

                    case 5:
                        System.out.println("============================================");
                        System.out.println("\nPASSEIO - Impressao de veiculos por PLACA.");
                        System.out.println("============================================");

                        Passeio pesquisaPasseio = new Passeio();
                        boolean existPlacaPasseio = false;
                        String placaPasseio = l.entDados("\nInforme a PLACA para pesquisar: ");
                        pesquisaPasseio.setPlaca(placaPasseio);

                        for (int i = 0; i < vetPasseio.length; i++) {
                            // Verifica se a posição do vetor não é nula antes de tentar acessar o método
                            if (vetPasseio[i] != null && vetPasseio[i].getPlaca().equalsIgnoreCase(pesquisaPasseio.getPlaca())) {
                                impVeicPPlaca(vetPasseio[i], i);
                                existPlacaPasseio = true;
                            }
                        }
                        if (!existPlacaPasseio) {
                            l.entDados("\n\n\t\t=======NAO EXISTE VEICULO COM ESSA PLACA press <ENTER>======");
                        }
                        break;

                    case 6:
                        System.out.println("============================================");
                        System.out.println("\nCARGA - Impressao de veiculos por PLACA.");
                        System.out.println("============================================");

                        Carga pesquisaCarga = new Carga();
                        boolean existPlacaCarga = false;
                        String placaCarga = l.entDados("\nInforme a PLACA para pesquisar: ");
                        pesquisaCarga.setPlaca(placaCarga);

                        for (int i = 0; i < vetCarga.length; i++) {
                            // Verifica se a posição do vetor não é nula antes de tentar acessar o método
                            if (vetCarga[i] != null && vetCarga[i].getPlaca().equalsIgnoreCase(pesquisaCarga.getPlaca())) {
                                impVeicCPlaca(vetCarga[i], i);
                                existPlacaCarga = true;
                            }
                        }
                        if (!existPlacaCarga) {
                            l.entDados("\n\n\t\t=======NAO EXISTE VEICULO COM ESSA PLACA press <ENTER>======");
                        }
                        break;
                    case 7:
                        System.out.println("============================================");
                        System.out.println("\nPASSEIO - Exclusao de veiculos por PLACA.");
                        System.out.println("============================================");

                        String placaExcluirPasseio = l.entDados("\nInforme a PLACA para excluir: ");
                        boolean passeioExcluido = false;

                        for (int i = 0; i < vetPasseio.length; i++) {
                            if (vetPasseio[i] != null && vetPasseio[i].getPlaca().equalsIgnoreCase(placaExcluirPasseio)) {
                                vetPasseio[i] = null; // Exclui o veículo definindo a posição como null
                                passeioExcluido = true;
                                l.entDados("\nVeiculo de PASSEIO com placa " + placaExcluirPasseio + " excluido com sucesso! press <ENTER>");
                                break; // Sai do loop após excluir
                            }
                        }
                        if (!passeioExcluido) {
                            l.entDados("\n\n\t\t=======NAO EXISTE VEICULO COM ESSA PLACA press <ENTER>======");
                        }
                        break;

                    case 8:
                        System.out.println("============================================");
                        System.out.println("\nCARGA - Exclusao de veiculos por PLACA.");
                        System.out.println("============================================");

                        String placaExcluirCarga = l.entDados("\nInforme a PLACA para excluir: ");
                        boolean cargaExcluida = false;

                        for (int i = 0; i < vetCarga.length; i++) {
                            if (vetCarga[i] != null && vetCarga[i].getPlaca().equalsIgnoreCase(placaExcluirCarga)) {
                                vetCarga[i] = null; // Exclui o veículo definindo a posição como null
                                cargaExcluida = true;
                                l.entDados("\nVeiculo de CARGA com placa " + placaExcluirCarga + " excluido com sucesso! press <ENTER>");
                                break; // Sai do loop após excluir
                            }
                        }
                        if (!cargaExcluida) {
                            l.entDados("\n\n\t\t=======NAO EXISTE VEICULO COM ESSA PLACA press <ENTER>======");
                        }
                        break;

                    case 9:
                        // O loop 'do-while' cuidará da saída.
                        System.out.println("\nSaindo do sistema...");
                        break;
                    default:
                        System.out.print("\nSelecione uma opcao valida entre < 1 e 9 >. ");
                }
                // Captura qualquer exceção de tempo de execução (RuntimeException) de forma genérica.
                // Isso resolve o problema de compilação, pois não estamos prometendo capturar exceções checadas.
            } catch (Exception e) {
                System.out.println("\nERRO DE EXECUCAO | Ocorreu um erro inesperado: " + e.getMessage());
                // É essencial consumir a linha pendente do scanner após um erro
                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }
            }
        }while(opcao != 9);

        scanner.close(); // Fecha o Scanner ao sair do sistema
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

    public static void verificaExistencia(String placa) throws VeicExistException {
        // Verifica nos vetores de Passeio e Carga
        for (Passeio p : vetPasseio) {
            // Verifica se a posição do vetor não é nula antes de acessar o método
            if (p != null && p.getPlaca().equalsIgnoreCase(placa)) {
                throw new VeicExistException(placa); // Lança a exceção verificada
            }
        }
        for (Carga c : vetCarga) {
            if (c != null && c.getPlaca().equalsIgnoreCase(placa)) {
                throw new VeicExistException(placa); // Lança a exceção verificada
            }
        }
    }

    // É necessário que o método declare que pode lançar a exceção.
    public static void verificaLimiteVelocidade(int veloc) throws VelocException {

        // A regra é: menor que 80 OU maior que 110.
        if (veloc < 80 || veloc > 110) {

            // LANÇA A EXCEÇÃO:
            // O construtor da VelocException já contém a mensagem de erro.
            throw new VelocException();
        }
        // Se a velocidade estiver entre 80 e 110, o método termina normalmente.
    }

        private static Passeio cadVeicP (Passeio passeio) throws VeicExistException, VelocException {
            System.out.println("\n================================================");
            System.out.println("        Cadastro de veiculo de PASSEIO");
            System.out.println("================================================");
            passeio.setPlaca(l.entDados("\nPlaca.................: "));
            //String placaEntrada = passeio.getPlaca();
            verificaExistencia(passeio.getPlaca()); // Verifica se a placa já existe
            //passeio.setQtdPassageiros(Integer.parseInt(l.entDados("Qtd de Passageiros....: ")));
            passeio.setQtdPassageiros(Integer.parseInt(l.entDados("Qtd de Passageiros....: ")));

            passeio.setMarca(l.entDados("Marca.................: "));
            passeio.setCor(l.entDados("Cor...................: "));
            passeio.setQtdRodas(Integer.parseInt(l.entDados("Qtd de Rodas..........: ")));
            passeio.setVelocMax((int)Integer.parseInt(l.entDados("Velocidade Maxima.....: ")));
            verificaLimiteVelocidade( (int)passeio.getVelocMax()); // Verifica o limite de velocidade
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

        private static Carga cadVeicC (Carga carga) throws VeicExistException, VelocException {
            System.out.println("\n================================================");
            System.out.println("        Cadastro de veiculo de CARGA");
            System.out.println("================================================");
            verificaExistencia(carga.getPlaca()); // Verifica se a placa já existe
            carga.setPlaca(l.entDados("\nPlaca.................: "));
            carga.setMarca(l.entDados("Marca.................: "));
            carga.setCor(l.entDados("Cor...................: "));
            carga.setQtdRodas(Integer.parseInt(l.entDados("Qtd de Rodas..........: ")));
            carga.setVelocMax((int)Integer.parseInt(l.entDados("Velocidade Maxima.....: ")));
            verificaLimiteVelocidade( (int)carga.getVelocMax()); // Verifica o limite de velocidade
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
            System.out.println("Potencia do Motor....: " + carga.getMotor().getPotencia());
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
            System.out.println("Potencia do Motor....: " + carga.getMotor().getPotencia());
            System.out.println("Carga Maxima.........: " + carga.getCargaMax());
            System.out.println("Qtd total de Letras....: " + carga.calcular());
            carga.calcVel();
        }
        //remove veiculo passeio pela placa
        private static void excluirVeicP() {
            String placaExcluir = l.entDados("\nInforme a PLACA para excluir: ");
            boolean passeioExcluido = false;
            String passeio = buscarVeicP(placaExcluir);

            if(passeio != null){
                DBVeiculos dbVeiculos = new DBVeiculos();
                dbVeiculos.getListaVeiculos().remove(passeio);
                passeioExcluido = true;
                l.entDados("\nVeiculo de PASSEIO com placa " + placaExcluir + " excluido com sucesso! press <ENTER>");
            }else{
                l.entDados("\n\n\t\t=======NAO EXISTE VEICULO COM ESSA PLACA press <ENTER>======");
            }
        }

        private static void excluirVeicC() {
            String placaExcluir = l.entDados("\nInforme a PLACA para excluir: ");
            boolean cargaExcluido = false;
            String carga = buscarVeicC(placaExcluir);

            if(carga != null){
                DBVeiculos dbVeiculos = new DBVeiculos();
                dbVeiculos.getListaVeiculos().remove(carga);
                cargaExcluido = true;
                l.entDados("\nVeiculo de CARGA com placa " + placaExcluir + " excluido com sucesso! press <ENTER>");
            }else{
                l.entDados("\n\n\t\t=======NAO EXISTE VEICULO COM ESSA PLACA press <ENTER>======");
            }
        }
    private static String buscarVeicP(String placaExcluir) {
        return placaExcluir;
    }
    private static String buscarVeicC(String placaExcluir) {
        return placaExcluir;
    }

}
