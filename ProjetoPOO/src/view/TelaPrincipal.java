/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
/**
 *
 * @author debor
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTelaLogoPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1TelaPrincipal = new javax.swing.JMenuBar();
        jMenuReserva = new javax.swing.JMenu();
        jMenuItemEmprestimos = new javax.swing.JMenuItem();
        jMenuItemConsultar = new javax.swing.JMenuItem();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemAutor = new javax.swing.JMenuItem();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemLivro = new javax.swing.JMenuItem();
        jMenuItem = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Leia um Livro");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanelTelaLogoPrincipal.setBackground(new java.awt.Color(128, 128, 128));
        jPanelTelaLogoPrincipal.setToolTipText("");
        jPanelTelaLogoPrincipal.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logo.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanelTelaLogoPrincipalLayout = new javax.swing.GroupLayout(jPanelTelaLogoPrincipal);
        jPanelTelaLogoPrincipal.setLayout(jPanelTelaLogoPrincipalLayout);
        jPanelTelaLogoPrincipalLayout.setHorizontalGroup(
            jPanelTelaLogoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaLogoPrincipalLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanelTelaLogoPrincipalLayout.setVerticalGroup(
            jPanelTelaLogoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaLogoPrincipalLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jMenuBar1TelaPrincipal.setBackground(new java.awt.Color(128, 128, 128));
        jMenuBar1TelaPrincipal.setForeground(new java.awt.Color(36, 36, 38));
        jMenuBar1TelaPrincipal.setToolTipText("");
        jMenuBar1TelaPrincipal.setPreferredSize(new java.awt.Dimension(229, 39));

        jMenuReserva.setBackground(new java.awt.Color(128, 128, 128));
        jMenuReserva.setForeground(new java.awt.Color(35, 35, 36));
        jMenuReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png"))); // NOI18N
        jMenuReserva.setText("Reserve");
        jMenuReserva.setToolTipText("");
        jMenuReserva.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N

        jMenuItemEmprestimos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItemEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemEmprestimos.setText("Empréstimos");
        jMenuItemEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmprestimosActionPerformed(evt);
            }
        });
        jMenuReserva.add(jMenuItemEmprestimos);

        jMenuItemConsultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItemConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemConsultar.setText("Consultar");
        jMenuItemConsultar.setToolTipText("");
        jMenuReserva.add(jMenuItemConsultar);

        jMenuBar1TelaPrincipal.add(jMenuReserva);

        jMenuCadastro.setBackground(new java.awt.Color(128, 128, 128));
        jMenuCadastro.setForeground(new java.awt.Color(35, 35, 36));
        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setToolTipText("");
        jMenuCadastro.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N

        jMenuItemAutor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItemAutor.setForeground(new java.awt.Color(35, 35, 36));
        jMenuItemAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemAutor.setText("Autor");
        jMenuItemAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAutorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemAutor);

        jMenuItemCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItemCliente.setForeground(new java.awt.Color(35, 35, 36));
        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemLivro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItemLivro.setForeground(new java.awt.Color(35, 35, 36));
        jMenuItemLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItemLivro.setText("Livro");
        jMenuItemLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLivroActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemLivro);

        jMenuItem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem.setForeground(new java.awt.Color(35, 35, 36));
        jMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jMenuItem.setText("Item");
        jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItem);

        jMenuBar1TelaPrincipal.add(jMenuCadastro);

        jMenuSair.setBackground(new java.awt.Color(128, 128, 128));
        jMenuSair.setForeground(new java.awt.Color(35, 35, 36));
        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuBar1TelaPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBar1TelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanelTelaLogoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTelaLogoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmprestimosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEmprestimosActionPerformed

    private void jMenuItemLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLivroActionPerformed
        TelaCadastroLivros telaCadastroLivro = new TelaCadastroLivros(this);
        telaCadastroLivro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemLivroActionPerformed

    private void jMenuItemAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAutorActionPerformed
        TelaAutor telaAutor = new TelaAutor(this);
        telaAutor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemAutorActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        TelaCliente telaCliente = new TelaCliente(this);
        telaCliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemActionPerformed
        TelaItem telaItem = new TelaItem(this);
        telaItem.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1TelaPrincipal;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItem;
    private javax.swing.JMenuItem jMenuItemAutor;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemConsultar;
    private javax.swing.JMenuItem jMenuItemEmprestimos;
    private javax.swing.JMenuItem jMenuItemLivro;
    private javax.swing.JMenu jMenuReserva;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelTelaLogoPrincipal;
    // End of variables declaration//GEN-END:variables
}
