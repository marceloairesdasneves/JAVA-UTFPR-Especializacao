package br.com.ativ09InterfaceGrafica;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerVeiculos{
    
    private void cadastrar() {                                             
        // TODO add your handling code here:
        //primeiro, recuperar os dados no form.
        int qtdPassageiros = Integer.parseInt(cxQtdPassageiros.getText());
        String placa = cxPlaca.getText();
        String marca = cxMarca.getText();
        String modelo = cxModelo.getText();
        String cor = cxCor.getText();
        int qtdRodas = Integer.parseInt(cxQtdRodas.getText());
        int velocMax = Integer.parseInt(cxVelocMax.getText());
        int qtdPistoes = Integer.parseInt(cxQtdPistoes.getText());
        int potencia = Integer.parseInt(cxPotencia.getText());
        //incluindo dados para tabela JTable
        DefaultTableModel  tabelaVeicPass = (DefaultTableModel)tbVeicPass.getModel();
        
        Object[] novoVeicPass = new Object[]{
            qtdPassageiros,
            placa,
            marca,
            modelo,
            cor,
            qtdRodas,
            velocMax,
            qtdPistoes,
            potencia
        };
            tabelaVeicPass.addRow(novoVeicPass);
            
            //limpar campos
            cxQtdPassageiros.setText("");
            cxPlaca.setText("");
            cxMarca.setText("");
            cxModelo.setText("");
            cxCor.setText("");
            cxQtdRodas.setText("");
            cxVelocMax.setText("");
            cxQtdPistoes.setText("");
            cxPotencia.setText("");
            
        
       
    }                                            

    private void limpar() {
        // TODO add your handling code here:
        cxCor.setText("");
        cxMarca.setText("");
        cxModelo.setText("");
        cxPlaca.setText("");
        cxPotencia.setText("");
        cxQtdPassageiros.setText("");
        cxQtdPistoes.setText("");
        cxQtdRodas.setText("");
        cxVelocMax.setText("");
    }                                               

    private void sair(){                                              
        // TODO add your handling code here:
         this.dispose();
    }                                             

    private void cxMarcaActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void consultar() {                                            
        // TODO add your handling code here:

        int linhaSelecionada = tbVeicPass.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma Placa(linha) na tabela para consultar.");
            return;
        }

        // Recupera os dados da linha selecionada
        String qtdPassageiros = tbVeicPass.getValueAt(linhaSelecionada, 0).toString();
        String placa = tbVeicPass.getValueAt(linhaSelecionada, 1).toString();
        String marca = tbVeicPass.getValueAt(linhaSelecionada, 2).toString();
        String modelo = tbVeicPass.getValueAt(linhaSelecionada, 3).toString();
        String cor = tbVeicPass.getValueAt(linhaSelecionada, 4).toString();
        String qtdRodas = tbVeicPass.getValueAt(linhaSelecionada, 5).toString();
        String velocMax = tbVeicPass.getValueAt(linhaSelecionada, 6).toString();
        String qtdPistoes = tbVeicPass.getValueAt(linhaSelecionada, 7).toString();
        String potencia = tbVeicPass.getValueAt(linhaSelecionada, 8).toString();

        // Exibe os dados em um JOptionPane ou em outra tela
        String mensagem = "Dados do Veículo:\n"
                + "Placa: " + placa + "\n"
                + "Marca: " + marca + "\n"
                + "Modelo: " + modelo + "\n"
                + "Cor: " + cor + "\n"
                + "Qtd Passageiros: " + qtdPassageiros + "\n"
                + "Qtd Rodas: " + qtdRodas + "\n"
                + "Velocidade Máx: " + velocMax + "\n"
                + "Qtd Pistões: " + qtdPistoes + "\n"
                + "Potência: " + potencia;

        JOptionPane.showMessageDialog(null, mensagem, "Consulta", JOptionPane.INFORMATION_MESSAGE);

    }                                           

    private void imprimir(){                                           
        // TODO add your handling code here:
        int linhaSelecionada = tbVeicPass.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma Placa(linha) na tabela para consultar.");
            return;
        }
            // Exibir os dados da tabela em um JOptionPane
        if (tbVeicPass.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Não há dados para mostrar.");
            return;
        }
        String qtdPassageiros = tbVeicPass.getValueAt(linhaSelecionada, 0).toString();
        StringBuilder dados = new StringBuilder("Relatório de Dados:\n\n");

        for (int i = 0; i < tbVeicPass.getRowCount(); i++) {
            for (int j = 0; j < tbVeicPass.getColumnCount(); j++) {
                dados.append(tbVeicPass.getColumnName(j))
                        .append(": ")
                        .append(tbVeicPass.getValueAt(i, j))
                        .append("\n   ");
            }
            dados.append("\n");
        }

        JOptionPane.showMessageDialog(null, dados.toString(), "Relatório", JOptionPane.INFORMATION_MESSAGE);


    }                                          

    private void excluir(){                                          
        // TODO add your handling code here:
        int linhaSelecionada = tbVeicPass.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha");
        } else {
            DefaultTableModel tabelaVeicPass = (DefaultTableModel) tbVeicPass.getModel();
            tabelaVeicPass.removeRow(linhaSelecionada);
            JOptionPane.showMessageDialog(null, "Veiculo Passeeio excluido...");

        }
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    break;
                }
            }
        //</editor-fold>
        CadPasseios  cadPasseios = new CadPasseios();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CadPasseios().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private java.awt.Button btCadVeicPas;
    private java.awt.Button btConsultar;
    private java.awt.Button btExcluir;
    private java.awt.Button btImprimir;
    private java.awt.Button btLimparVeicPas;
    private java.awt.Button btSairVeicPas;
    private java.awt.TextField cxCor;
    private java.awt.TextField cxMarca;
    private java.awt.TextField cxModelo;
    private java.awt.TextField cxPlaca;
    private java.awt.TextField cxPotencia;
    private java.awt.TextField cxQtdPassageiros;
    private java.awt.TextField cxQtdPistoes;
    private java.awt.TextField cxQtdRodas;
    private java.awt.TextField cxVelocMax;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenu mnVeicPasseio;
    private java.awt.Label rtCor;
    private java.awt.Label rtMarca;
    private java.awt.Label rtModelo;
    private java.awt.Label rtPlaca;
    private java.awt.Label rtPotencia;
    private java.awt.Label rtQtdPassageiros;
    private java.awt.Label rtQtdPistoes;
    private java.awt.Label rtQtdRodas;
    private java.awt.Label rtVelocMax;
    private javax.swing.JTable tbVeicPass;
    // End of variables declaration                   

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}