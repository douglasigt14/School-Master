/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PerguntasMaster.java
 *
 * Created on 11/09/2011, 16:01:29
 */
package schoolmaster10;

import schoolmaster10.PergInfo;

/**
 *
 * @author Douglas
 */
public class PerguntasMaster extends javax.swing.JFrame {

    /** Creates new form PerguntasMaster */
    public PerguntasMaster() {
         this.setLocationRelativeTo(null);
         this.setResizable(false);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        cx1 = new javax.swing.JTextPane();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Perguntas Master");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cb1.setFont(new java.awt.Font("Tahoma", 1, 12));
        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Informática", "Matemática", "Português", "Fisica", "Quimica", "Biologia", "História", "Geografia" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        cx1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cx1.setForeground(new java.awt.Color(0, 0, 255));
        cx1.setText("Selecione uma materia,ao lado e clique em confirmar para começar a respoder as perguntas");
        cx1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cx1.setEnabled(false);
        jScrollPane1.setViewportView(cx1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        String materia;
    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        materia = (String) cb1.getSelectedItem();
        if (materia == " ") {
            cx1.setText("Selecione uma materia,ao lado e clique em confirmar para começar a respoder as perguntas");
        }
        if (materia == "Informática") {
            cx1.setText("Questões de Informatica Basica,Hadware,Programação e Redes,sobre diversos assuntos sobre a Tecnologia");
        }
        if (materia == "Matemática") {
            cx1.setText("Perguntas de Logica,Operações Basicas,Frações,Entre outros assunto da matemática");
        }
        if (materia == "Português") {
            cx1.setText("Verbos,Sujeito,Adjetivos,      Figuras de Linguagem são alguns de varios assuntos abordados");
        }
        if (materia == "Fisica") {
            cx1.setText("Fisica Cinetica e mecanica,Optica,Colorimetria, Eletronica entre outras são explanadas em Fisica");
        }
        if (materia == "Quimica") {
            cx1.setText("Questões sobre Tabela Periodica,composisão do átomo,Quinica Orgânica e Inorgânica entre varios outros");
        }
        if (materia == "Biologia") {
            cx1.setText("Pergutas de Citologia,Corpo Humano,Reinos,Botanica,    Genetica, e outros ");
        }
        if (materia == "História") {
            cx1.setText("História Geral e do Brasil,Pré-História,Gerra Fria são uns dos assuntos abordados");
        }
        if (materia == "Geografia") {
            cx1.setText("Longitude e latitude,relevo,solos,formação do fenômenos naturais entre outras questões");
        }

    }//GEN-LAST:event_cb1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       materia=(String) cb1.getSelectedItem();
       if (materia=="Informática"){
            new PergInfo().show();
        }
       if (materia=="Matemática"){
           new PergMate().show();
       }
       if (materia=="Português"){
           new PergPort().show();
       }
       if (materia=="Fisica"){
           new PergFisi().show();
       }
       if (materia=="Quimica"){
           new PergQuim().show();
       }
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PerguntasMaster().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb1;
    private javax.swing.JTextPane cx1;
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
