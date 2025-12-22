import aulas_isidro.ProjetoAdapter.IRelatorios;
import aulas_isidro.ProjetoAdapter.ServicoOriginal;

public class MainClass{
    public static void main(String args[]){
        IRelatorios rel;
        rel = new IRelatorios() {
            @Override
            public void gerarRelatorio(String dados) {

            }
        };
        //rel = new ServicoOriginal();
        rel.gerarRelatorio("Unidade1 1000\nUnidade2 1200\nUnidade3 1300");
    }
}