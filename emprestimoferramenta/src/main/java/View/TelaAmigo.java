/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author victor
 */
public class TelaAmigo extends javax.swing.JFrame {

    /**
     * Creates new form TelaAmigo
     */
    public TelaAmigo() {
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

        Amigo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nome = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        amigoIcon = new javax.swing.JLabel();
        amigoIcon1 = new javax.swing.JLabel();
        BtCadastrar = new javax.swing.JButton();
        BtEditar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Amigo.setFont(new java.awt.Font("Garamond", 1, 48)); // NOI18N
        Amigo.setForeground(new java.awt.Color(255, 255, 255));
        Amigo.setText("Amigo");
        getContentPane().add(Amigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 870, 10));

        nome.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        nome.setForeground(new java.awt.Color(255, 255, 255));
        nome.setText("Nome:");
        getContentPane().add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        telefone.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        telefone.setForeground(new java.awt.Color(255, 255, 255));
        telefone.setText("Telefone:");
        getContentPane().add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 180, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 144, 220, 20));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 184, 220, 20));

        amigoIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\victor\\Documents\\NetBeansProjects\\A3 teste\\A3emprestimoferramentas\\emprestimoferramenta\\A3emprestimoferramentas\\emprestimoferramenta\\src\\main\\java\\View\\imagens\\amizade.png")); // NOI18N
        getContentPane().add(amigoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        amigoIcon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\victor\\Documents\\NetBeansProjects\\A3 teste\\A3emprestimoferramentas\\emprestimoferramenta\\A3emprestimoferramentas\\emprestimoferramenta\\src\\main\\java\\View\\imagens\\amizade.png")); // NOI18N
        getContentPane().add(amigoIcon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, -1, -1));

        BtCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        BtCadastrar.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        BtCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        BtCadastrar.setText("Cadastrar");
        BtCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtCadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(BtCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, -1));

        BtEditar.setBackground(new java.awt.Color(255, 255, 255));
        BtEditar.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        BtEditar.setForeground(new java.awt.Color(255, 255, 255));
        BtEditar.setText("Editar");
        getContentPane().add(BtEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        BtExcluir.setBackground(new java.awt.Color(255, 255, 255));
        BtExcluir.setFont(new java.awt.Font("Garamond", 1, 18)); // NOI18N
        BtExcluir.setForeground(new java.awt.Color(255, 255, 255));
        BtExcluir.setText("Excluir");
        getContentPane().add(BtExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone", "Empréstimos"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 720, 190));

        fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\victor\\Documents\\NetBeansProjects\\A3 teste\\A3emprestimoferramentas\\emprestimoferramenta\\A3emprestimoferramentas\\emprestimoferramenta\\src\\main\\java\\View\\imagens\\fosco.jpg")); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtCadastrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtCadastrarMouseClicked

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
            java.util.logging.Logger.getLogger(TelaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAmigo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAmigo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amigo;
    private javax.swing.JButton BtCadastrar;
    private javax.swing.JButton BtEditar;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JLabel amigoIcon;
    private javax.swing.JLabel amigoIcon1;
    private javax.swing.JLabel fundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel telefone;
    // End of variables declaration//GEN-END:variables
}
