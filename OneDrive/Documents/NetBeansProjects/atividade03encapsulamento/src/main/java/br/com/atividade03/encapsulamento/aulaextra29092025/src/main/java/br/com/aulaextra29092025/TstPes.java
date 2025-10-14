package br.com.aulaextra29092025;

public class TstPes {//classe de controle, para controlar o funcionamento da aplicacao.
    //conhecida como classe de visao (MVC, Model View e Controller)
    public static void main(String[] args) { //classLoader, carregar a sua aplicacao o objeto para memoria RAM,sua chamando o metodo principal para execucao na JVM
        //Pessoa p1 = new Pessoa(); // declarando uma variavel do tipo Objeto Criando a instancia do objeto em p1.
        Leitura l1 = new Leitura();
        String frase = l1.entDados("\nInforme uma frase qq: ");
        System.out.println("\n A frase foi " + frase);
                
        /*
        p1.setCpf(55);
        p1.setNome("Marcelo");
        System.out.println("\nCPF - P1...:" + p1.getCpf()); //fazendo a Troca de Mensagens na memoria RAM e a comunicacao entre objetos.
        System.out.println("NOME  - P1...:" + p1.getNome());//fazendo a Troca de Mensagens na memoria RAM 
        
        Pessoa p2 = new Pessoa();
        p2.setCpf(50);
        p2.setNome("Maria Silvana");
        System.out.println("\nCPF - P2...:" + p2.getCpf());//fazendo a Troca de Mensagens na memoria RAM 
        System.out.println("NOME  - P2...:" + p2.getNome());//fazendo a Troca de Mensagens na memoria RAM 
        */
    }
}
