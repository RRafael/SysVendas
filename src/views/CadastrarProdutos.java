/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao.DaoProdutosEstoque;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import library.bibliotecas;
import model.Produto;

/**
 *
 * @author Rafael
 */
public class CadastrarProdutos extends javax.swing.JDialog {

    boolean flagProduto = true;
    int codigoProduto = -1;
    bibliotecas libs;

    /**
     * Creates new form CadastroProdutos
     */
    public CadastrarProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jTextField4Estoque.setEditable(false);
        libs = new bibliotecas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCodigoProduto = new javax.swing.JTextField();
        jTextFieldDescricaoProduto = new javax.swing.JTextField();
        jTextFieldPreco = new javax.swing.JTextField();
        jTextField4Estoque = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Código do Produto ....:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Descrição do Produto :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Preço de Venda .........:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Estoque Atual ............:");

        jTextFieldCodigoProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoProdutoActionPerformed(evt);
            }
        });

        jTextFieldDescricaoProduto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecoActionPerformed(evt);
            }
        });

        jTextField4Estoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Digite a Quantidade ...:");

        jTextFieldQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Limpar Campos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Cadastro de Produto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonBuscar))
                                    .addComponent(jTextFieldDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                            .addComponent(jTextField4Estoque, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldPreco, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel6)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4Estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoProdutoActionPerformed
        jButtonBuscarActionPerformed(evt);
    }//GEN-LAST:event_jTextFieldCodigoProdutoActionPerformed

    private void jTextFieldPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

        DaoProdutosEstoque bancoEstoque = new DaoProdutosEstoque();
        Produto p = new Produto();       

        if (!libs.soContemNumeros(jTextFieldCodigoProduto.getText().trim())) {
            jTextField4Estoque.setText("");
            jTextFieldCodigoProduto.setText("");
            jTextFieldDescricaoProduto.setText("");
            jTextFieldPreco.setText("");
            jTextFieldQuantidade.setText("");
            jTextFieldCodigoProduto.requestFocus();
            return;
        }

        int codigo = Integer.parseInt(jTextFieldCodigoProduto.getText().trim());

        p = bancoEstoque.buscarProdutoEstoque(codigo);

        if (p.getId() == 0) {
            flagProduto = false;
            jTextField4Estoque.setEnabled(false);
            jTextFieldCodigoProduto.setEditable(false);
            JOptionPane.showMessageDialog(rootPane, "produto nao cadastrado");
            jTextFieldDescricaoProduto.setText("");
            jTextFieldPreco.setText("");
            jTextField4Estoque.setText("");
            jTextFieldQuantidade.setText("");
            jTextFieldDescricaoProduto.requestFocus();
            return;
        }

        codigoProduto = p.getCodigo();
        flagProduto = true;
        jTextField4Estoque.setEnabled(true);
        jTextFieldDescricaoProduto.setText(p.getNome());
        jTextFieldPreco.setText("" + libs.formatarFloat(p.getValor()));
        jTextField4Estoque.setText("" + p.getQuantidade());
        jTextFieldQuantidade.setText("");
        jTextFieldQuantidade.requestFocus();
        jTextFieldCodigoProduto.setEditable(false);

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Produto verificaProduto = new Produto();  // verificar produto por seguranca
        DaoProdutosEstoque bancoEstoque = new DaoProdutosEstoque();
        Produto p = new Produto();

        if (!libs.isNumeric(jTextFieldCodigoProduto.getText().trim())) {
            JOptionPane.showMessageDialog(rootPane, "informe o codigo do produto");
            jTextFieldCodigoProduto.requestFocus();
            return;
        }
        verificaProduto = bancoEstoque.buscarProdutoEstoque(Integer.parseInt(jTextFieldCodigoProduto.getText().trim()));

        String vpTesto = jTextFieldPreco.getText().trim();
        String valor = vpTesto.replace(",", ".");

        if ("".equals(jTextFieldDescricaoProduto.getText().trim())) {
            JOptionPane.showMessageDialog(rootPane, "digite o nome do produto");
            jTextFieldDescricaoProduto.requestFocus();
            return;
        }

        if (!libs.isNumericFloat(valor)) {
            JOptionPane.showMessageDialog(rootPane, "digite um valor valido");
            jTextFieldPreco.setText("");
            jTextFieldPreco.requestFocus();
            return;
        }

        if (!libs.isNumeric(jTextFieldQuantidade.getText().trim())) {

            JOptionPane.showMessageDialog(rootPane, "digite a quantidade do produto");
            jTextFieldQuantidade.setText("");
            jTextFieldQuantidade.requestFocus();
            return;
        }

        p.setCodigo(Integer.parseInt(jTextFieldCodigoProduto.getText().trim()));
        p.setNome(jTextFieldDescricaoProduto.getText().trim());
        p.setValor(Float.parseFloat(valor));
        p.setQuantidade(Integer.parseInt(jTextFieldQuantidade.getText().trim()));

        if (flagProduto == false) {
            bancoEstoque.adicionaProdutoEstoque(p);
            JOptionPane.showMessageDialog(rootPane, "Produto cadastrado com sucesso");
        } else {
            if (!(verificaProduto.getCodigo() == codigoProduto)) {   // verificar se o codigo do testo é o mesmo que esta sendo inserido
                JOptionPane.showMessageDialog(rootPane, "codigo do produto invalido - Tente novamente !!!");
                jTextFieldCodigoProduto.requestFocus();
                return;
            }
            bancoEstoque.atualizaProdutoEstoque(p);
            JOptionPane.showMessageDialog(rootPane, "Produto atualizado com sucesso");
        }

        jTextFieldCodigoProduto.setText("");
        jTextField4Estoque.setText("");
        jTextFieldDescricaoProduto.setText("");
        jTextFieldPreco.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldCodigoProduto.requestFocus();

        codigoProduto = -1; // limpa a variavel codigo
        flagProduto = true;
        jTextFieldCodigoProduto.setEditable(true);
        jTextFieldCodigoProduto.setEditable(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextFieldCodigoProduto.setEditable(true);
        jTextField4Estoque.setText("");
        jTextFieldCodigoProduto.setText("");
        jTextFieldDescricaoProduto.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldPreco.setText("");
        jTextFieldCodigoProduto.requestFocus();


    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastrarProdutos dialog = new CadastrarProdutos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField4Estoque;
    private javax.swing.JTextField jTextFieldCodigoProduto;
    private javax.swing.JTextField jTextFieldDescricaoProduto;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldQuantidade;
    // End of variables declaration//GEN-END:variables
}
