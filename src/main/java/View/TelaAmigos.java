package View;

import DAO.AmigoDAO;
import Model.Amigo;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class TelaAmigos extends javax.swing.JFrame {


     private AmigoDAO amigoDAO; // cria o vinculo com o Amigo.java

    public TelaAmigos() {
        initComponents();
        this.amigoDAO = new AmigoDAO(); // carrega DAO de Amigo.java
        this.carregaTabela();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAmigo = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoTelefone = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        btnCadastra = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("AMIGOS");

        tableAmigo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableAmigo);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Telefone:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCadastra.setText("Cadastrar");
        btnCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(28, 28, 28)
                        .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(374, Short.MAX_VALUE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(359, 359, 359)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(479, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
         try {
            int id = 0;
            
            if(this.tableAmigo.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro, selecione um amigo para remover");
            } else {
                id = Integer.parseInt(this.tableAmigo.getValueAt(this.tableAmigo.getSelectedRow(), 0).toString());
            }
            
            int resposta = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja remover este amigo?", "Confirmação", JOptionPane.YES_NO_OPTION);
            
            if(resposta == JOptionPane.YES_OPTION && this.amigoDAO.DeleteAmigoBD(id)) {
                JOptionPane.showMessageDialog(rootPane, "Amigo removido com sucesso!");
            }
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } finally {
            carregaTabela();
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraActionPerformed
        // TODO add your handling code here:
         try {
            // recebendo e validando dados da interface grafica.
            String nome = "";
            long telefone = 0;
            int quantEmprest = 0;

            if (this.campoNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.campoNome.getText();
            }

            if (this.campoTelefone.getText().length() != 11) {
                throw new Mensagens("Telefone deve ser número e conter 11 dígitos.");
            } else {
                telefone = Long.parseLong(this.campoTelefone.getText());
            }
            
            ArrayList<Amigo> minhalista = amigoDAO.getMinhaLista();

            for (Amigo a : minhalista) { // checa se o amigo ja está cadastrado
                if(a.getNome().equalsIgnoreCase(nome) && a.getTelefone() == telefone){
                    throw new Mensagens("Esse amigo já está cadastrado!");
                }
                else if(a.getNome().equalsIgnoreCase(nome) && a.getTelefone() != telefone){
                    int resposta = JOptionPane.showConfirmDialog(rootPane, nome+" já está cadastrado.\nDeseja atualizar o telefone?", "Confirmação", JOptionPane.YES_NO_OPTION);
                    if(resposta == JOptionPane.YES_OPTION) {
                        if (this.amigoDAO.UpdateAmigoBD(new Amigo(a.getId(), nome, telefone))) {
                            // limpa os campos
                            this.campoNome.setText("");
                            this.campoTelefone.setText("");
                            throw new Mensagens("Telefone atualizado!");
                        }
                    } else{
                        throw new Mensagens("Cadastro cancelado!");
                    }
                }
            } 
                // envia os dados para o Controlador cadastrar
                if (this.amigoDAO.InsertAmigoBD(new Amigo(nome, telefone, quantEmprest))) {
                    JOptionPane.showMessageDialog(rootPane, "Amigo cadastrado com sucesso!");
                }
            
                this.campoNome.setText("");
                this.campoTelefone.setText("");
            
        } catch (Mensagens | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Telefone inválido, informe um número.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_btnCadastraActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        try {
            // recebendo e validando dados da interface grafica.
        
            int id = 0;
            String nome = "";
            long telefone =  0;
            
            if (this.campoNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.campoNome.getText();
            }

            if (this.campoTelefone.getText().length() != 11) {
                throw new Mensagens("Telefone deve ser número e conter 11 dígitos.");
            } else {
                telefone = Long.parseLong(this.campoTelefone.getText());
            }
            
            ArrayList<Amigo> minhalista = amigoDAO.getMinhaLista();
            if (this.tableAmigo.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro, selecione um amigo para alterar");
            } else {
                id = Integer.parseInt(this.tableAmigo.getValueAt(this.tableAmigo.getSelectedRow(), 0).toString());
            }
            
            for (Amigo a : minhalista) { // checa se essas informações já estão cadastradas
                if(a.getNome().equalsIgnoreCase(nome) && a.getTelefone() == telefone){
                    throw new Mensagens("Esse amigo já está cadastrado!");
                    } 
                else if(a.getTelefone() == telefone && a.getId() != id){
                    throw new Mensagens("Esse telefone já está cadastrado!");
                }
                else if(a.getNome().equalsIgnoreCase(nome) && a.getId() != id){
                    int resposta = JOptionPane.showConfirmDialog(rootPane, "Já existe um amigo com esse nome.\n Deseja atualizar o telefone?", "Confirmação", JOptionPane.YES_NO_OPTION);
                    if(resposta == JOptionPane.YES_OPTION) {
                        if(a.getTelefone() == telefone && a.getId() != id){
                            throw new Mensagens("Esse telefone já está cadastrado!");
                        } else if (this.amigoDAO.UpdateAmigoBD(new Amigo(a.getId(), nome, telefone))) {
                            // limpa os campos
                            this.campoNome.setText("");
                            this.campoTelefone.setText("");
                            throw new Mensagens("Telefone atualizado!");
                        } 
                    }else{
                        throw new Mensagens("Cadastro cancelado!");
                    }
                }
            } 

            // envia os dados para o Amigo processar
            if (this.amigoDAO.UpdateAmigoBD(new Amigo(id, nome, telefone))) {

                JOptionPane.showMessageDialog(rootPane, "Amigo alterado com sucesso!");
                // limpa os campos
                this.campoNome.setText("");
                this.campoTelefone.setText("");

            }
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Telefone inválido, informe um número.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } finally {
            carregaTabela(); // atualiza a tabela.
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void carregaTabela() { // listando os objetos amigo na tabela

        DefaultTableModel modelo = (DefaultTableModel) this.tableAmigo.getModel();
        modelo.setNumRows(0);

        ArrayList<Amigo> minhalista = amigoDAO.getMinhaLista();

        for (Amigo a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getTelefone(),
                a.getQuantEmprest()
            });
            amigoDAO.UpdateQtdEmprest(a.getId()); // atualiza a qtd de emprestimos de um amigo
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastra;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tableAmigo;
    // End of variables declaration//GEN-END:variables
}
