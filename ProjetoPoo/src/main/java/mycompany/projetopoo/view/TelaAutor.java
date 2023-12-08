/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mycompany.projetopoo.view;

import javax.swing.JOptionPane;
import mycompany.projetopoo.controller.EscritorController;

/**
 *
 * @author debor
 */
public class TelaAutor extends javax.swing.JFrame {

    /**
     * Creates new form TelaAutor
     */
    public TelaAutor() {
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

        jLabelCadastroAutor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelNacionalidade = new javax.swing.JLabel();
        jTextFieldCampoNome = new javax.swing.JTextField();
        jComboBoxCampoNacionalidade = new javax.swing.JComboBox<>();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtoncConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Biblioteca leia um Livro");
        setResizable(false);

        jLabelCadastroAutor.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabelCadastroAutor.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCadastroAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mycompany/projetopoo/imagens/book.png"))); // NOI18N
        jLabelCadastroAutor.setText("Cadastro de Autor");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelNome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNome.setText("NOME:");
        jLabelNome.setToolTipText("");

        jLabelNacionalidade.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNacionalidade.setText("NACIONALIDADE:");

        jTextFieldCampoNome.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldCampoNome.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCampoNome.setText("  Informe o nome do autor...");
        jTextFieldCampoNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldCampoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCampoNomeActionPerformed(evt);
            }
        });

        jComboBoxCampoNacionalidade.setBackground(new java.awt.Color(51, 51, 51));
        jComboBoxCampoNacionalidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxCampoNacionalidade.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxCampoNacionalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma nacionalidade...", " Afeganistão", "    África do Sul", "    Akrotiri", "    Albânia", "    Alemanha", "    Andorra", "    Angola", "    Anguila", "    Antárctida", "    Antígua e Barbuda", "    Arábia Saudita", "    Arctic Ocean", "    Argélia", "    Argentina", "    Arménia", "    Aruba", "    Ashmore and Cartier Islands", "    Atlantic Ocean", "    Austrália", "    Áustria", "    Azerbaijão", "    Baamas", "    Bangladeche", "    Barbados", "    Barém", "    Bélgica", "    Belize", "    Benim", "    Bermudas", "    Bielorrússia", "    Birmânia", "    Bolívia", "    Bósnia e Herzegovina", "    Botsuana", "    Brasil", "    Brunei", "    Bulgária", "    Burquina Faso", "    Burúndi", "    Butão", "    Cabo Verde", "    Camarões", "    Camboja", "    Canadá", "    Catar", "    Cazaquistão", "    Chade", "    Chile", "    China", "    Chipre", "    Clipperton Island", "    Colômbia", "    Comores", "    Congo-Brazzaville", "    Congo-Kinshasa", "    Coral Sea Islands", "    Coreia do Norte", "    Coreia do Sul", "    Costa do Marfim", "    Costa Rica", "    Croácia", "    Cuba", "    Curacao", "    Dhekelia", "    Dinamarca", "    Domínica", "    Egipto", "    Emiratos Árabes Unidos", "    Equador", "    Eritreia", "    Eslováquia", "    Eslovénia", "    Espanha", "    Estados Unidos", "    Estónia", "    Etiópia", "    Faroé", "    Fiji", "    Filipinas", "    Finlândia", "    França", "    Gabão", "    Gâmbia", "    Gana", "    Gaza Strip", "    Geórgia", "    Geórgia do Sul e Sandwich do Sul", "    Gibraltar", "    Granada", "    Grécia", "    Gronelândia", "    Guame", "    Guatemala", "    Guernsey", "    Guiana", "    Guiné", "    Guiné Equatorial", "    Guiné-Bissau", "    Haiti", "    Honduras", "    Hong Kong", "    Hungria", "    Iémen", "    Ilha Bouvet", "    Ilha do Natal", "    Ilha Norfolk", "    Ilhas Caimão", "    Ilhas Cook", "    Ilhas dos Cocos", "    Ilhas Falkland", "    Ilhas Heard e McDonald", "    Ilhas Marshall", "    Ilhas Salomão", "    Ilhas Turcas e Caicos", "    Ilhas Virgens Americanas", "    Ilhas Virgens Britânicas", "    Índia", "    Indian Ocean", "    Indonésia", "    Irão", "    Iraque", "    Irlanda", "    Islândia", "    Israel", "    Itália", "    Jamaica", "    Jan Mayen", "    Japão", "    Jersey", "    Jibuti", "    Jordânia", "    Kosovo", "    Kuwait", "    Laos", "    Lesoto", "    Letónia", "    Líbano", "    Libéria", "    Líbia", "    Listenstaine", "    Lituânia", "    Luxemburgo", "    Macau", "    Macedónia", "    Madagáscar", "    Malásia", "    Malávi", "    Maldivas", "    Mali", "    Malta", "    Man, Isle of", "    Marianas do Norte", "    Marrocos", "    Maurícia", "    Mauritânia", "    México", "    Micronésia", "    Moçambique", "    Moldávia", "    Mónaco", "    Mongólia", "    Monserrate", "    Montenegro", "    Mundo", "    Namíbia", "    Nauru", "    Navassa Island", "    Nepal", "    Nicarágua", "    Níger", "    Nigéria", "    Niue", "    Noruega", "    Nova Caledónia", "    Nova Zelândia", "    Omã", "    Pacific Ocean", "    Países Baixos", "    Palau", "    Panamá", "    Papua-Nova Guiné", "    Paquistão", "    Paracel Islands", "    Paraguai", "    Peru", "    Pitcairn", "    Polinésia Francesa", "    Polónia", "    Porto Rico", "    Portugal", "    Quénia", "    Quirguizistão", "    Quiribáti", "    Reino Unido", "    República Centro-Africana", "    República Dominicana", "    Roménia", "    Ruanda", "    Rússia", "    Salvador", "    Samoa", "    Samoa Americana", "    Santa Helena", "    Santa Lúcia", "    São Bartolomeu", "    São Cristóvão e Neves", "    São Marinho", "    São Martinho", "    São Pedro e Miquelon", "    São Tomé e Príncipe", "    São Vicente e Granadinas", "    Sara Ocidental", "    Seicheles", "    Senegal", "    Serra Leoa", "    Sérvia", "    Singapura", "    Sint Maarten", "    Síria", "    Somália", "    Southern Ocean", "    Spratly Islands", "    Sri Lanca", "    Suazilândia", "    Sudão", "    Sudão do Sul", "    Suécia", "    Suíça", "    Suriname", "    Svalbard e Jan Mayen", "    Tailândia", "    Taiwan", "    Tajiquistão", "    Tanzânia", "    Território Britânico do Oceano Índico", "    Territórios Austrais Franceses", "    Timor Leste", "    Togo", "    Tokelau", "    Tonga", "    Trindade e Tobago", "    Tunísia", "    Turquemenistão", "    Turquia", "    Tuvalu", "    Ucrânia", "    Uganda", "    União Europeia", "    Uruguai", "    Usbequistão", "    Vanuatu", "    Vaticano", "    Venezuela", "    Vietname", "    Wake Island", "    Wallis e Futuna", "    West Bank", "    Zâmbia", "    Zimbabué" }));
        jComboBoxCampoNacionalidade.setToolTipText("");
        jComboBoxCampoNacionalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCampoNacionalidadeActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSalvar.setText("Salvar");

        jButtonLimpar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtoncConsultar.setForeground(new java.awt.Color(0, 0, 0));
        jButtoncConsultar.setText("Consultar");
        jButtoncConsultar.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButtonSalvar)
                        .addGap(53, 53, 53)
                        .addComponent(jButtonLimpar)
                        .addGap(54, 54, 54)
                        .addComponent(jButtonCancelar)
                        .addGap(50, 50, 50)
                        .addComponent(jButtoncConsultar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelNacionalidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxCampoNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldCampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxCampoNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNacionalidade))
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtoncConsultar))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabelCadastroAutor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCadastroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCampoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCampoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCampoNomeActionPerformed

    private void jComboBoxCampoNacionalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCampoNacionalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCampoNacionalidadeActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLimparActionPerformed
    public void limparTelaCadastroEscritor(java.awt.event.MouseEvent evt) {
        jTextFieldCampoNome.setText("");
        jComboBoxCampoNacionalidade.setSelectedItem(0);
    }
    
    public void fecharTelaCadastroAutor(java.awt.event.WindowEvent evt){
       // telaPrincipal.setVisible(true);
    }
    
    private void salvarEscritor(java.awt.event.MouseEvent evt){
        String nome = jTextFieldCampoNome.getText();
        String nacionalidade = jComboBoxCampoNacionalidade.getSelectedItem().toString();
        boolean sucesso;
        
        try{
            EscritorController escritorController = new EscritorController();
            sucesso = escritorController.cadastrarEscritor(nome, nacionalidade);
            if(sucesso == true){
                JOptionPane.showMessageDialog(null, "O Escritor foi cadastrado com sucesso!");
                this.limparTelaCadastroEscritor(evt);
            }else{
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente.");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error:" + e );
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtoncConsultar;
    private javax.swing.JComboBox<String> jComboBoxCampoNacionalidade;
    private javax.swing.JLabel jLabelCadastroAutor;
    private javax.swing.JLabel jLabelNacionalidade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCampoNome;
    // End of variables declaration//GEN-END:variables
}
