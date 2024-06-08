package View;

public class TelaMenu extends javax.swing.JFrame {

    public TelaMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnFerramentas = new javax.swing.JButton();
        btnAmigos = new javax.swing.JButton();
        btnEmprestimos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Garamond", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bem vindo ");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setMaximumSize(new java.awt.Dimension(190, 48));
        jLabel2.setMinimumSize(new java.awt.Dimension(190, 48));
        jLabel2.setPreferredSize(new java.awt.Dimension(190, 48));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 230, 50));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selecione uma das opções abaixo !");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 240, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\victor\\Documents\\NetBeansProjects\\A3copy\\src\\main\\java\\View\\imagens\\ferramenta (1).png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\victor\\Documents\\NetBeansProjects\\A3copy\\src\\main\\java\\View\\imagens\\arquiteto.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        btnFerramentas.setText("Ferramentas ");
        btnFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFerramentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnFerramentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, -1));

        btnAmigos.setText("Amigos");
        btnAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAmigosActionPerformed(evt);
            }
        });
        getContentPane().add(btnAmigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        btnEmprestimos.setText("Emprestimos");
        btnEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestimosActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\victor\\Documents\\NetBeansProjects\\A3copy\\src\\main\\java\\View\\imagens\\novo.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setBounds(0, 0, 622, 645);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFerramentasActionPerformed
        // TODO add your handling code here:
         new TelaFerramentas().setVisible(true);
    }//GEN-LAST:event_btnFerramentasActionPerformed

    private void btnEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimosActionPerformed
        // TODO add your handling code here:
            new TelaEmprestimos().setVisible(true);
    }//GEN-LAST:event_btnEmprestimosActionPerformed

    private void btnAmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAmigosActionPerformed
        // TODO add your handling code here:
                new TelaAmigos().setVisible(true);

    }//GEN-LAST:event_btnAmigosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAmigos;
    private javax.swing.JButton btnEmprestimos;
    private javax.swing.JButton btnFerramentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
