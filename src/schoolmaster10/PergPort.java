/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PergPort.java
 *
 * Created on 14/09/2011, 23:58:26
 */
package schoolmaster10;
import schoolmaster10.PerguntasMaster;
import javax.swing.*;
public class PergPort extends javax.swing.JFrame {

    /** Creates new form PergPort */
    public PergPort() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        perg1 = new javax.swing.JLabel();
        perg2 = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Português");

        perg1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        perg1.setForeground(new java.awt.Color(255, 255, 255));
        perg1.setText("1-A forma correta do verbo submeter-se, na 1a");

        perg2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        perg2.setForeground(new java.awt.Color(255, 255, 255));
        perg2.setText("pessoa do plural do imperativo afirmativo é:");

        op1.setBackground(new java.awt.Color(0, 153, 153));
        op1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        op1.setForeground(new java.awt.Color(255, 255, 255));
        op1.setText("submetamo-nos ");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        op2.setBackground(new java.awt.Color(0, 153, 153));
        op2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        op2.setForeground(new java.awt.Color(255, 255, 255));
        op2.setText("submeta-se ");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        op3.setBackground(new java.awt.Color(0, 153, 153));
        op3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        op3.setForeground(new java.awt.Color(255, 255, 255));
        op3.setText("submete-te");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        op4.setBackground(new java.awt.Color(0, 153, 153));
        op4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        op4.setForeground(new java.awt.Color(255, 255, 255));
        op4.setText("submetei-vos");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1))
                    .addComponent(perg2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(perg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(op4)
                            .addComponent(op1)
                            .addComponent(op2)
                            .addComponent(op3))
                        .addGap(174, 174, 174)))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(250, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(perg1)
                .addGap(5, 5, 5)
                .addComponent(perg2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op4)
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        op1.setSelected(true);
        op2.setSelected(false);
        op3.setSelected(false);
        op4.setSelected(false);
}//GEN-LAST:event_op1ActionPerformed
            int x=1,cont=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (x == 1) {
            if (op1.isSelected()) {
                cont++;
                JOptionPane.showMessageDialog(null, "Resposta Correta \nOpção Correta: A");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta Errada \nOpção Correta: A");
            }
            op1.setSelected(false);
            op2.setSelected(false);
            op3.setSelected(false);
            op4.setSelected(false);
            perg1.setText("2-Depois que o sol se __________,");
            perg2.setText("haverão de __________ as atividades.");
            op1.setText("pôr - suspender ");
            op2.setText("por - suspenderem ");
            op3.setText("puser - suspender ");
            op4.setText("puser - suspenderem");
        }
        if (x == 2) {
            if (op3.isSelected()) {
                cont++;
                JOptionPane.showMessageDialog(null, "Resposta Correta \nOpção Correta: C");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta Errada \nOpção Correta: C");
            }
            op1.setSelected(false);
            op2.setSelected(false);
            op3.setSelected(false);
            op4.setSelected(false);
            perg1.setText("3- __________ mesmo que és capaz de vencer;");
            perg2.setText(" __________ e não __________ ");
            op1.setText("Mostra a ti - decide-te - desanime ");
            op2.setText("Mostre a ti - decida-te - desanimes");
            op3.setText("Mostra a ti - decida-te - desanimes");
            op4.setText("Mostra a ti - decide-te - desanimes");
        }
        if (x == 3) {
            if (op4.isSelected()) {
                cont++;
                JOptionPane.showMessageDialog(null, "Resposta Correta \nOpção Correta: D");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta Errada \nOpção Correta: D");
            }
            op1.setSelected(false);
            op2.setSelected(false);
            op3.setSelected(false);
            op4.setSelected(false);
            perg1.setText("4-Assinale a única alternativa que ");
            perg2.setText("possui substantivo sobrecomum.");
            op1.setText("crocodilo");
            op2.setText("colega");
            op3.setText("cavalheiro");
            op4.setText("indivíduo");
        }
        if (x == 4) {
            if (op4.isSelected()) {
                cont++;
                JOptionPane.showMessageDialog(null, "Resposta Correta \nOpção Correta: D");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta Errada \nOpção Correta: D");
            }
            op1.setSelected(false);
            op2.setSelected(false);
            op3.setSelected(false);
            op4.setSelected(false);
            perg1.setText("5-Na língua portuguesa é o elemento que");
            perg2.setText("contém o significado básico da palavra ");
            op1.setText("afixo ");
            op2.setText("tema");
            op3.setText("radical ");
            op4.setText("desinência");
        }
        if (x == 5) {
            if (op3.isSelected()) {
                cont++;
                JOptionPane.showMessageDialog(null, "Resposta Correta \nOpção Correta: C");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta Errada \nOpção Correta: C");
            }
            op1.setSelected(false);
            op2.setSelected(false);
            op3.setSelected(false);
            op4.setSelected(false);
            perg1.setText("6-É chamado termo integrante da oração:");
            perg2.setText(" ");
            op1.setText("sujeito");
            op2.setText("objeto indireto");
            op3.setText("predicado");
            op4.setText("adjunto adnominal");
        }
        if (x == 6) {
            if (op2.isSelected()) {
                cont++;
                JOptionPane.showMessageDialog(null, "Resposta Correta \nOpção Correta: B");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta Errada \nOpção Correta: B");
            }
            op1.setSelected(false);
            op2.setSelected(false);
            op3.setSelected(false);
            op4.setSelected(false);
            perg1.setText("7-A palavra burocracia é formada por:");
            perg2.setText("");
            op1.setText("hibridismo");
            op2.setText("composição por justaposição ");
            op3.setText("derivação regressiva");
            op4.setText("onomatopéia");
        }
        if (x == 7) {
            if (op1.isSelected()) {
                cont++;
                JOptionPane.showMessageDialog(null, "Resposta Correta \nOpção Correta: A");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta Errada \nOpção Correta: A");
            }
            op1.setSelected(false);
            op2.setSelected(false);
            op3.setSelected(false);
            op4.setSelected(false);
            perg1.setText("8- No sintagma: “Uma palavra branca e fria”,");
            perg2.setText(" encontramos a figura denominada: ");
            op1.setText("sinestesia");
            op2.setText("eufemismo");
            op3.setText("onomatopéia ");
            op4.setText("antonomásia");
        }
        if (x == 8) {
            if (op1.isSelected()) {
                cont++;
                JOptionPane.showMessageDialog(null, "Resposta Correta \nOpção Correta: A");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta Errada \nOpção Correta: A");
            }
            op1.setSelected(false);
            op2.setSelected(false);
            op3.setSelected(false);
            op4.setSelected(false);
            perg1.setText("9-No enunciado: “Virgílio, traga-me uma coca cola bem ");
            perg2.setText("gelada!”, registra-se uma figura de linguagem denominada:"); 
            op1.setText("anáfora");
            op2.setText("personificação");
            op3.setText("metonímia");
            op4.setText("catacrese");
        }
        if (x == 9) {
            if (op3.isSelected()) {
                cont++;
                JOptionPane.showMessageDialog(null, "Resposta Correta \nOpção Correta: C");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta Errada \nOpção Correta: C");
            }
            op1.setSelected(false);
            op2.setSelected(false);
            op3.setSelected(false);
            op4.setSelected(false);
            perg1.setText("10-Assinale a alternativa que os substantivos ");
            perg2.setText("estão flexionados no plural incorretamente  ");
            op1.setText("más-línguas, bananas-maçã");
            op2.setText("cachorros-quentes, pombos-correio");
            op3.setText("grão-duques, tico-ticos");
            op4.setText("bananas-maçãs, altos-falantes");
            
        }
        if (x == 10) {
            if (op4.isSelected()) {
                cont++;
                JOptionPane.showMessageDialog(null, "Resposta Correta \nOpção Correta: D");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta Errada \nOpção Correta: D");
            }
            JOptionPane.showMessageDialog(null,"Você Acertou:"+cont+"/10 questões");
            new PerguntasMaster().show();
            this.dispose();
        }
        x++;
}//GEN-LAST:event_jButton1ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        
        op1.setSelected(false);
        op2.setSelected(false);
        op3.setSelected(false);
        op4.setSelected(true);
}//GEN-LAST:event_op4ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        op1.setSelected(false);
        op2.setSelected(false);
        op3.setSelected(true);
        op4.setSelected(false);
}//GEN-LAST:event_op3ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        op1.setSelected(false);
        op2.setSelected(true);
        op3.setSelected(false);
        op4.setSelected(false);
}//GEN-LAST:event_op2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PergPort().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JLabel perg1;
    private javax.swing.JLabel perg2;
    // End of variables declaration//GEN-END:variables
}
