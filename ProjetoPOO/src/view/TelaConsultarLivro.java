/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.LivroController;
import dao.ExceptionDAO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.Livro;

/**
 *
 * @author debor
 */
public class TelaConsultarLivro extends javax.swing.JFrame {
    
    private TelaCadastroLivros telaCadastroLivros;
    
    public TelaConsultarLivro() {
        initComponents();
    }

 public TelaConsultarLivro(TelaCadastroLivros telaCadastroLivros){
        this.telaCadastroLivros = telaCadastroLivros;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConsultarFilme = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jButtonConsultarSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultarLivro = new javax.swing.JTable();
        jLabelConsultarLivro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca leia um livro");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                Fecharjanela(evt);
            }
        });

        jPanelConsultarFilme.setBackground(new java.awt.Color(102, 102, 102));

        jLabelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Insira o Nome do Livro:");

        jTextFieldTitulo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldTitulo.setText("Insira o titulo...");
        jTextFieldTitulo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonConsultarSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search.png"))); // NOI18N
        jButtonConsultarSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonConsultarSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarLivro(evt);
            }
        });

        jTableConsultarLivro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTableConsultarLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Titulo", "Gênero", "Sinopse", "Páginas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultarLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultarLivroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsultarLivro);

        javax.swing.GroupLayout jPanelConsultarFilmeLayout = new javax.swing.GroupLayout(jPanelConsultarFilme);
        jPanelConsultarFilme.setLayout(jPanelConsultarFilmeLayout);
        jPanelConsultarFilmeLayout.setHorizontalGroup(
            jPanelConsultarFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarFilmeLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanelConsultarFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelConsultarFilmeLayout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonConsultarSearch)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelConsultarFilmeLayout.setVerticalGroup(
            jPanelConsultarFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultarFilmeLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanelConsultarFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultarFilmeLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButtonConsultarSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelConsultarFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabelConsultarLivro.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabelConsultarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png"))); // NOI18N
        jLabelConsultarLivro.setText("Consultar Livro");
        jLabelConsultarLivro.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabelConsultarLivro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanelConsultarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabelConsultarLivro)
                .addGap(18, 18, 18)
                .addComponent(jPanelConsultarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarLivro(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarLivro
      String nome = jTextFieldTitulo.getText();
      DefaultTableModel tableModel = (DefaultTableModel) jTableConsultarLivro.getModel();
      tableModel.setRowCount(0);
      LivroController livroController = new LivroController();
      try{
          ArrayList<Livro> livros = livroController.listarLivros(nome);
          livros.forEach((Livro livro) -> {
              tableModel.addRow(new Object[] { livro.getCodLivro(),
                                               livro.getTitulo(),
                                               livro.getGenero(),
                                               livro.getSinopse(),
                                               livro.getNumPaginas()});
              });
         jTableConsultarLivro.setModel(tableModel);
      } catch (ExceptionDAO ex) {
            Logger.getLogger(TelaCadastroLivros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConsultarLivro

    private void Fecharjanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Fecharjanela
       this.dispose();
       this.telaCadastroLivros.setVisible(true);
    }//GEN-LAST:event_Fecharjanela

    private void jTableConsultarLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultarLivroMouseClicked
       if(evt.getClickCount()==2){
           Integer codLivro = (Integer) jTableConsultarLivro.getModel().getValueAt(jTableConsultarLivro.getSelectedRow(), 0);
           String titulo = (String) jTableConsultarLivro.getModel().getValueAt(jTableConsultarLivro.getSelectedRow(), 1);
           String genero = (String) jTableConsultarLivro.getModel().getValueAt(jTableConsultarLivro.getSelectedRow(), 2);
           String sinopse = (String) jTableConsultarLivro.getModel().getValueAt(jTableConsultarLivro.getSelectedRow(), 3);
           Integer numPaginas = (Integer) jTableConsultarLivro.getModel().getValueAt(jTableConsultarLivro.getSelectedRow(), 4);
           
           this.telaCadastroLivros.buscarLivro(codLivro, titulo, genero, sinopse, numPaginas);
           
           this.telaCadastroLivros.setVisible(true);
           this.dispose();
       }
    }//GEN-LAST:event_jTableConsultarLivroMouseClicked

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
            java.util.logging.Logger.getLogger(TelaConsultarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultarLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultarSearch;
    private javax.swing.JLabel jLabelConsultarLivro;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelConsultarFilme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultarLivro;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
