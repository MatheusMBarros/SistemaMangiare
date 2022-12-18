
package View;

import Controler.ControlerTelaInicial;
import java.awt.event.ActionListener;

/**
 *
 * @author mathe
 */
public class TelaInicial extends javax.swing.JFrame {
    ControlerTelaInicial controlerTelaInicial;

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
         initComponents();
    }

    public void adicionarAcaoBotaoCadastrarCliente(ActionListener acao){
    btnCadastrarCliente.addActionListener(acao);
    }
    public void adicionarAcaoBotaoCadastrarFuincionario(ActionListener acao){
        btnCadastrarFuncionario.addActionListener(acao);
    }
    public void adicionarBotaoListarFuncionarios(ActionListener acao){
        btnListarFuncionario.addActionListener(acao);
    }
    public void adicionarBotaoListarClientes(ActionListener acao) {
        btnListarClientes.addActionListener(acao);
    }

    public void adicionarAcaoRealizarPedido(ActionListener acao){
        btnRealizarPedido.addActionListener(acao);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrarCliente = new javax.swing.JButton();
        btnCadastrarFuncionario = new javax.swing.JButton();
        btnRealizarPedido = new javax.swing.JButton();
        btnListarFuncionario = new javax.swing.JButton();
        btnListarClientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnCadastrarCliente.setText("Cadastrar Cliente");

        btnCadastrarFuncionario.setText("Cadastrar Funcionario");

        btnRealizarPedido.setText("Realizar Pedido");

        btnListarFuncionario.setText("Listar Funcionarios");

        btnListarClientes.setText("Listar Clientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRealizarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListarClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnCadastrarCliente)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarFuncionario)
                .addGap(18, 18, 18)
                .addComponent(btnRealizarPedido)
                .addGap(18, 18, 18)
                .addComponent(btnListarFuncionario)
                .addGap(18, 18, 18)
                .addComponent(btnListarClientes)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {    
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCadastrarFuncionario;
    private javax.swing.JButton btnListarClientes;
    private javax.swing.JButton btnListarFuncionario;
    private javax.swing.JButton btnRealizarPedido;
    // End of variables declaration//GEN-END:variables
}
