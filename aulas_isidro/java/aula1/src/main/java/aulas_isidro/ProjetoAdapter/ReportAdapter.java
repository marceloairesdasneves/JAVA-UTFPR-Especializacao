import aulas_isidro.ProjetoAdapter.IRelatorios;

public class ReportAdapter implements IRelatorios {
    private RelatorioMasterBlasterPlus report;
    public ReportAdapter(){
        this.report = new RelatorioMasterBlasterPlus();
    }
    
    @Override
    public void gerarRelatorio(String dados){
        String[] csvDados = dados.split("\n");
        this.report.generateReport(csvDados);
    }
}