/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.EscritorController;
import dao.ExceptionDAO;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author debor
 */
public class TelaAutor extends javax.swing.JFrame {
    private TelaPrincipal telaPrincipal;
    private Integer codAutor = 0;
    /**
     * Creates new form TelaAutor
     */
    public TelaAutor() {
        initComponents();
    }

    public TelaAutor(TelaPrincipal telaPrincipal) {
         initComponents();
         this.telaPrincipal = telaPrincipal;
    }

   public void buscarAtor(Integer codAutor, String nome, String nacionalidade){
        this.codAutor = codAutor;
        this.jTextFieldCampoNome.setText(nome);
            for(int contador=0;contador<jComboBoxCampoNacionalidade.getItemCount();contador++){
            if(jComboBoxCampoNacionalidade.getItemAt(contador).equals(nacionalidade))
                    jComboBoxCampoNacionalidade.setSelectedIndex(contador);
        }
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCadastroAutor = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldCampoNome = new javax.swing.JTextField();
        jLabel1Nacionalidade = new javax.swing.JLabel();
        jComboBoxCampoNacionalidade = new javax.swing.JComboBox<>();
        jButtonSalvar = new javax.swing.JButton();
        limparTelaCadastroEscritor = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biblioteca Leia um Livro");
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);

        jLabelCadastroAutor.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabelCadastroAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png"))); // NOI18N
        jLabelCadastroAutor.setText("Cadastro de Autor");

        jLabelNome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNome.setText("NOME:");

        jTextFieldCampoNome.setBackground(new java.awt.Color(153, 153, 153));
        jTextFieldCampoNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextFieldCampoNome.setText("Insira o nome...");
        jTextFieldCampoNome.setToolTipText("");
        jTextFieldCampoNome.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1Nacionalidade.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1Nacionalidade.setText("NACIONALIDADE:");

        jComboBoxCampoNacionalidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBoxCampoNacionalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Afeganistão", "África do Sul", "Akrotiri", "Albânia", "Alemanha", "Andorra", "Angola", "Anguila", "Antárctida", "Antígua e Barbuda", "Arábia Saudita", "Arctic Ocean", "Argélia", "Argentina", "Arménia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Austrália", "Áustria", "Azerbaijão", "Baamas", "Bangladeche", "Barbados", "Barém", "Bélgica", "Belize", "Benim", "Bermudas", "Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burquina Faso", "Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Clipperton Island", "Colômbia", "Comores", "Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Curacao", "Dhekelia", "Dinamarca", "Domínica", "Egipto", "Emiratos Árabes Unidos", "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Unidos", "Estónia", "Etiópia", "Faroé", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Gaza Strip", "Geórgia", "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Grécia", "Gronelândia", "Guame", "Guatemala", "Guernsey", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria", "Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk", "Ilhas Caimão", "Ilhas Cook", "Ilhas dos Cocos", "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "Ilhas Salomão", "Ilhas Turcas e Caicos", "Ilhas Virgens Americanas", "Ilhas Virgens Britânicas", "Índia", "Indian Ocean", "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Jan Mayen", "Japão", "Jersey", "Jibuti", "Jordânia", "Kosovo", "Kuwait", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia", "Listenstaine", "Lituânia", "Luxemburgo", "Macau", "Macedónia", "Madagáscar", "Malásia", "Malávi", "Maldivas", "Mali", "Malta", "Man, Isle of", "Marianas do Norte", "Marrocos", "Maurícia", "Mauritânia", "México", "Micronésia", "Moçambique", "Moldávia", "Mónaco", "Mongólia", "Monserrate", "Montenegro", "Mundo", "Namíbia", "Nauru", "Navassa Island", "Nepal", "Nicarágua", "Níger", "Nigéria", "Niue", "Noruega", "Nova Caledónia", "Nova Zelândia", "Omã", "Pacific Ocean", "Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paracel Islands", "Paraguai", "Peru", "Pitcairn", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal", "Quénia", "Quirguizistão", "Quiribáti", "Reino Unido", "República Centro-Africana", "República Dominicana", "Roménia", "Ruanda", "Rússia", "Salvador", "Samoa", "Samoa Americana", "Santa Helena", "Santa Lúcia", "São Bartolomeu", "São Cristóvão e Neves", "São Marinho", "São Martinho", "São Pedro e Miquelon", "São Tomé e Príncipe", "São Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal", "Serra Leoa", "Sérvia", "Singapura", "Sint Maarten", "Síria", "Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca", "Suazilândia", "Sudão", "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Svalbard e Jan Mayen", "Tailândia", "Taiwan", "Tajiquistão", "Tanzânia", "Território Britânico do Oceano Índico", "Territórios Austrais Franceses", "Timor Leste", "Togo", "Tokelau", "Tonga", "Trindade e Tobago", "Tunísia", "Turquemenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "União Europeia", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué", " " }));
        jComboBoxCampoNacionalidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonSalvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        limparTelaCadastroEscritor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        limparTelaCadastroEscritor.setText("Limpar");
        limparTelaCadastroEscritor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        limparTelaCadastroEscritor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparTelaCadastroEscritor(evt);
            }
        });

        jButtonCancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonConsultar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrir_telaConsulta(evt);
            }
        });

        jButtonApagar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButtonApagar.setText("Apagar");
        jButtonApagar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1Nacionalidade)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(limparTelaCadastroEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxCampoNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabelCadastroAutor)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCadastroAutor)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldCampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Nacionalidade)
                    .addComponent(jComboBoxCampoNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limparTelaCadastroEscritor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       this.dispose();
       telaPrincipal.setVisible(true);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void abrir_telaConsulta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrir_telaConsulta
       TelaConsultarAutor telaConsultarAutor = new TelaConsultarAutor(this);
       this.setVisible(false);
       telaConsultarAutor.setVisible(true);
    }//GEN-LAST:event_abrir_telaConsulta

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
         String nome = jTextFieldCampoNome.getText();
        String nacionalidade = jComboBoxCampoNacionalidade.getSelectedItem().toString();
        boolean sucesso;
        
        try{
            
            EscritorController escritorController = new EscritorController();
            
            if(this.codAutor==0){
                sucesso = escritorController.cadastrarEscritor(nome, nacionalidade);
            }else{
                sucesso = escritorController.alterarEscritor(this.codAutor, nome, nacionalidade);
            }
            if(sucesso == true){
                JOptionPane.showMessageDialog(null, "O Escritor foi cadastrado com sucesso!");
                this.limparTelaCadastroEscritor(evt);
            }else{
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente.");
            }
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(null, "Error:" + e );
        } catch (ExceptionDAO ex) {
            Logger.getLogger(TelaAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void limparTelaCadastroEscritor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparTelaCadastroEscritor
       jTextFieldCampoNome.setText("");
        jComboBoxCampoNacionalidade.setSelectedItem(0);
    }//GEN-LAST:event_limparTelaCadastroEscritor

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
       boolean sucesso;
        EscritorController escritorController = new EscritorController();
        try{
            sucesso = escritorController.apagarEscritor(this.codAutor);
            if(sucesso){
                JOptionPane.showMessageDialog(null, "Escritor apagado!");
                this.limparTelaCadastroEscritor(evt);
            }else{
                JOptionPane.showMessageDialog(null, "Error ao apagar escritor, por favor selecione novamente.");
            }
        } catch (ExceptionDAO ex) {
            Logger.getLogger(TelaAutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonApagarActionPerformed

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
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxCampoNacionalidade;
    private javax.swing.JLabel jLabel1Nacionalidade;
    private javax.swing.JLabel jLabelCadastroAutor;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JTextField jTextFieldCampoNome;
    private javax.swing.JButton limparTelaCadastroEscritor;
    // End of variables declaration//GEN-END:variables
}
