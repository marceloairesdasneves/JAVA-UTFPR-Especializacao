package aulas_isidro.ProjetoAdapter;

public final class ServicoOriginal implements IRelatorios {

    @Override
    public void gerarRelatorio(final String dados) {
        final String nl = System.lineSeparator();
        StringBuilder sb = new StringBuilder(128);
        sb.append("Relation Modulo Original").append(nl)
          .append("-------------------------").append(nl)
          .append(String.valueOf(dados)).append(nl)
          .append("-------------------------").append(nl);

        System.out.print(sb.toString());
    }
}