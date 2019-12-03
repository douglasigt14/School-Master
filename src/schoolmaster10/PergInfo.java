


package schoolmaster10;
import java.math.*;
import sun.nio.cs.*;
import javax.swing.*;
public class PergInfo extends javax.swing.JFrame {

    /** Creates new form PergInfo */
    public PergInfo() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        perg = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Informática");

        perg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        perg.setForeground(new java.awt.Color(255, 255, 255));
        perg.setText("1-Qual Principal componente de um computador?");

        op1.setBackground(new java.awt.Color(0, 153, 153));
        op1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        op1.setForeground(new java.awt.Color(255, 255, 255));
        op1.setText("Monitor");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });

        op2.setBackground(new java.awt.Color(0, 153, 153));
        op2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        op2.setForeground(new java.awt.Color(255, 255, 255));
        op2.setText("Mouse");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });

        op3.setBackground(new java.awt.Color(0, 153, 153));
        op3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        op3.setForeground(new java.awt.Color(255, 255, 255));
        op3.setText("Processador");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });

        op4.setBackground(new java.awt.Color(0, 153, 153));
        op4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        op4.setForeground(new java.awt.Color(255, 255, 255));
        op4.setText("HD");
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1))
                    .addComponent(perg)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(op4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(op1)
                                    .addComponent(op2)
                                    .addComponent(op3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(perg)
                .addGap(18, 18, 18)
                .addComponent(op1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(op4)
                .addGap(11, 11, 11)
                .addComponent(jButton1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
       
       op1.setSelected(false);
       op2.setSelected(false);
       op3.setSelected(false);
       op4.setSelected(true);
    }//GEN-LAST:event_op4ActionPerformed
      int x = 1;// +(int)((3 - 1)*Math.random());
      int cont=0;
    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
       op1.setSelected(true);
       op2.setSelected(false);
       op3.setSelected(false);
       op4.setSelected(false);
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
       op1.setSelected(false);
       op2.setSelected(true);
       op3.setSelected(false);
       op4.setSelected(false);
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
       op1.setSelected(false);
       op2.setSelected(false);
       op3.setSelected(true);
       op4.setSelected(false);
    }//GEN-LAST:event_op3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (x == 1) {
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
            perg.setText("2-Qual desse programas é um editor de videos?");
            op1.setText("Sony Sourge");
            op2.setText("After Efects");
            op3.setText("Net Beans");
            op4.setText("Formact Factory");
        }
        if (x == 2) {
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
            perg.setText("3-Qual dessas linguagens é para paginas WEB?");
            op1.setText("C++");
            op2.setText("C");
            op3.setText("Pascal");
            op4.setText("PHP");
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
            perg.setText("4-Qual desses é um dispositivo de saida?");
            op1.setText("Teclado");
            op2.setText("Impresora");
            op3.setText(" Estabilizador");
            op4.setText("Mouse");
        }
        if (x == 4) {
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
            perg.setText("5- Botão utilizado para entrar no modo de segurança?");
            op1.setText("F5");
            op2.setText("F7");
            op3.setText("F8");
            op4.setText("F12");
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
            perg.setText("6-Tag HTML para fazer negrito?");
            op1.setText("<negrito>");
            op2.setText("<b>");
            op3.setText("<n>");
            op4.setText("<black>");
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
            perg.setText("7-Qual dessas Linguagem é Orientada a Objetos?");
            op1.setText("C");
            op2.setText("Pascal");
            op3.setText("Java");
            op4.setText("Visual Basic");
        }
        if (x == 7) {
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
            perg.setText("8- Dispositivo de acesso Sequencial?");
            op1.setText("Fita magnetica");
            op2.setText("Disquete");
            op3.setText("CD-ROM");
            op4.setText("DVD-ROM");
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
            perg.setText("9-Computador portatil que usa SSD no lugar de um HD? ");
            op1.setText("NoteBook");
            op2.setText("NetBook");
            op3.setText("MacBook");
            op4.setText("JetBook");
        }
        if (x == 9) {
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
            perg.setText("10-Qual desses Softwares é um editor de textos?");
            op1.setText("Writer");
            op2.setText("RocketDocs");
            op3.setText("Orbit");
            op4.setText("Lazarus");
            
        }
        if (x == 10) {
            if (op1.isSelected()) {
                cont++;
                JOptionPane.showMessageDialog(null, "Resposta Correta \nOpção Correta: A");
            } else {
                JOptionPane.showMessageDialog(null, "Resposta Errada \nOpção Correta: A");
            }
            JOptionPane.showMessageDialog(null,"Você Acertou:"+cont+"/10 questões");
            new PerguntasMaster().show();
            this.dispose();
        }
        x++;
}//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new PergInfo().setVisible(true);
                
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
    private javax.swing.JLabel perg;
    // End of variables declaration//GEN-END:variables
}
