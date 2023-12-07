package mycompany.projetopoo.view;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTelaLogoPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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
        setResizable(false);

        jPanelTelaLogoPrincipal.setBackground(new java.awt.Color(153, 153, 153));
        jPanelTelaLogoPrincipal.setForeground(new java.awt.Color(153, 153, 153));
        jPanelTelaLogoPrincipal.setToolTipText("");
        jPanelTelaLogoPrincipal.setAutoscrolls(true);
        jPanelTelaLogoPrincipal.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mycompany/projetopoo/imagens/logo.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanelTelaLogoPrincipalLayout = new javax.swing.GroupLayout(jPanelTelaLogoPrincipal);
        jPanelTelaLogoPrincipal.setLayout(jPanelTelaLogoPrincipalLayout);
        jPanelTelaLogoPrincipalLayout.setHorizontalGroup(
            jPanelTelaLogoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaLogoPrincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelTelaLogoPrincipalLayout.setVerticalGroup(
            jPanelTelaLogoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaLogoPrincipalLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Bem - Vindo!");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenuReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mycompany/projetopoo/imagens/book.png"))); // NOI18N
        jMenuReserva.setText("Reserve");
        jMenuReserva.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N

        jMenuItemEmprestimos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItemEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mycompany/projetopoo/imagens/seta.png"))); // NOI18N
        jMenuItemEmprestimos.setText("Empréstimos");
        jMenuItemEmprestimos.setToolTipText("");
        jMenuItemEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmprestimosActionPerformed(evt);
            }
        });
        jMenuReserva.add(jMenuItemEmprestimos);

        jMenuItemConsultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItemConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mycompany/projetopoo/imagens/seta.png"))); // NOI18N
        jMenuItemConsultar.setText("Consultar");
        jMenuItemConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarActionPerformed(evt);
            }
        });
        jMenuReserva.add(jMenuItemConsultar);

        jMenuBar1TelaPrincipal.add(jMenuReserva);

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N

        jMenuItemAutor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItemAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mycompany/projetopoo/imagens/seta.png"))); // NOI18N
        jMenuItemAutor.setText("Autor");
        jMenuItemAutor.setToolTipText("");
        jMenuCadastro.add(jMenuItemAutor);

        jMenuItemCliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mycompany/projetopoo/imagens/seta.png"))); // NOI18N
        jMenuItemCliente.setText("Cliente");
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemLivro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItemLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mycompany/projetopoo/imagens/seta.png"))); // NOI18N
        jMenuItemLivro.setText("Livro");
        jMenuCadastro.add(jMenuItemLivro);

        jMenuItem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mycompany/projetopoo/imagens/seta.png"))); // NOI18N
        jMenuItem.setText("Item");
        jMenuCadastro.add(jMenuItem);

        jMenuBar1TelaPrincipal.add(jMenuCadastro);

        jMenuSair.setText("Sair");
        jMenuSair.setFocusable(false);
        jMenuSair.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jMenuBar1TelaPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBar1TelaPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanelTelaLogoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(372, 372, 372))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanelTelaLogoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmprestimosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemEmprestimosActionPerformed

    private void jMenuItemConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemConsultarActionPerformed

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
    private javax.swing.JLabel jLabel2;
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

