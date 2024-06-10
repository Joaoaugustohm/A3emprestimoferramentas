package View;

import DAO.*;
import Model.Emprestimo;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import javax.swing.text.MaskFormatter;

public class TelaEmprestimos extends javax.swing.JFrame {

    private EmprestimoDAO emprestimoDAO;
    private AmigoDAO amigoDAO;
    private FerramentaDAO ferramentaDAO;
    private MaskFormatter mascaraData;

    public TelaEmprestimos() {
        initComponents();
        this.emprestimoDAO = new EmprestimoDAO();
        this.amigoDAO = new AmigoDAO();
        this.ferramentaDAO = new FerramentaDAO();
        carregaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        campoFerramenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoAmigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoDataPed = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoDataDev = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEmprestimos = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("EMPRESTIMOS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ID amigo:");

        campoFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFerramentaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("ID ferramenta:");

        campoAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoAmigoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Data devolução:");

        campoDataPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataPedActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Data do pedido:");

        campoDataDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataDevActionPerformed(evt);
            }
        });

        tableEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Amigo", "Ferramenta", "Data de pedido", "Data de devolução", "Status"
            }
        ));
        jScrollPane2.setViewportView(tableEmprestimos);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExit.setText("fechar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoDataPed, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnExit)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(campoFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoDataPed, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(campoDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFerramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFerramentaActionPerformed

    private void campoAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoAmigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoAmigoActionPerformed

    private void campoDataPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataPedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataPedActionPerformed

    private void campoDataDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataDevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataDevActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        {

            try {
                // recebendo e validando dados da interface grafica.
                this.amigoDAO = new AmigoDAO();
                this.ferramentaDAO = new FerramentaDAO();

                int idAmigo = 0;
                int idFerramenta = 0;
                java.sql.Date dataEmprestimo;
                java.sql.Date dataDevolucao = null;

                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                sdf.setLenient(false);

                if (Integer.parseInt(this.campoAmigo.getText()) < 0 || Integer.parseInt(this.campoFerramenta.getText()) < 0) {
                    throw new Mensagens("O ID inserido é inválido.");
                } else {
                    idAmigo = Integer.parseInt(this.campoAmigo.getText());
                    idFerramenta = Integer.parseInt(this.campoFerramenta.getText());
                }

                if (this.campoDataPed.getText().contains("_")) {
                    throw new Mensagens("Insira uma data de empréstimo válida.");
                } else {
                    Date dataPadrao = sdf.parse(this.campoDataPed.getText());
                    long tempo = dataPadrao.getTime();
                    dataEmprestimo = new java.sql.Date(tempo);
                }

                if (!this.campoDataDev.getText().contains("_")) {
                    Date dataPadrao = sdf.parse(this.campoDataDev.getText());
                    long tempo = dataPadrao.getTime();
                    dataDevolucao = new java.sql.Date(tempo);

                    if (dataEmprestimo.getTime() > dataDevolucao.getTime()) {
                        throw new Mensagens("Data de empréstimo se encontra após data de devolução");
                    }
                }

                if (emprestimoDAO.amigoPendente(idAmigo) > 0) { // verifica pendencias do amigo
                    int ferramentaPendente = emprestimoDAO.amigoPendente(idAmigo); // retorna id da ferramenta pendente

                    String nome = amigoDAO.carregaAmigo(idAmigo).getNome();
                    String ferramenta = ferramentaDAO.carregaFerramenta(ferramentaPendente).getNome();

                    int resposta = JOptionPane.showConfirmDialog(rootPane, nome + " ainda não devolveu a(o) " + ferramenta + "\nTem certeza que deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);

                    if (resposta == JOptionPane.NO_OPTION) {
                        throw new Mensagens("Empréstimo cancelado!");
                    }

                } else if (ferramentaDAO.amigoComFerramenta(idFerramenta) > 0) { // verifica disponibilidade da ferramenta
                    int idEmprestimo = ferramentaDAO.amigoComFerramenta(idFerramenta);
                    Emprestimo emprestimoPendente = emprestimoDAO.carregaEmprestimo(idEmprestimo);
                    String nome = emprestimoPendente.getAmigo().getNome();

                    if (dataDevolucao == null || dataDevolucao.compareTo(emprestimoPendente.getDataEmprestimo()) == 1) {
                        throw new Mensagens("Esta ferramenta ainda não foi devolvida por " + nome);
                    }
                } else {
                    idAmigo = Integer.parseInt(this.campoAmigo.getText());
                    idFerramenta = Integer.parseInt(this.campoFerramenta.getText());
                }

                ArrayList<Emprestimo> minhalista = emprestimoDAO.getMinhaLista();

                for (Emprestimo e : minhalista) { // checa se essas informações já estão cadastradas
                    if (e.getAmigo().getId() == idAmigo && e.getFerramenta().getId() == idFerramenta && e.getDataEmprestimo().getTime() == dataEmprestimo.getTime()) {
                        throw new Mensagens("Esse empréstimo já está cadastrado!");
                    }
                }

                Emprestimo objeto = new Emprestimo(amigoDAO.carregaAmigo(idAmigo),
                        ferramentaDAO.carregaFerramenta(idFerramenta),
                        dataEmprestimo,
                        dataDevolucao);

                if (this.emprestimoDAO.InsertEmprestimoBD(objeto)) {

                    this.campoAmigo.setText("");
                    this.campoFerramenta.setText("");
                    this.campoDataPed.setText(null);
                    this.campoDataDev.setText(null);

                    JOptionPane.showMessageDialog(rootPane, "Empréstimo cadastrado com sucesso!");
                }

            } catch (Mensagens | SQLException erro) {
                JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Favor, informe os IDs necessários para o cadastro.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } catch (ParseException erro) {
                JOptionPane.showMessageDialog(null, "Erro ao converter data inválida.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } finally {
                carregaTabela(); // atualiza a tabela.
            }
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        try {

            int id = 0;
            int idAmigo = 0;
            int idFerramenta = 0;
            java.sql.Date dataEmprestimo;
            java.sql.Date dataDevolucao = null;

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            sdf.setLenient(false);

            if (this.tableEmprestimos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro, selecione um empréstimo para editar.");
            } else {
                id = Integer.parseInt(this.tableEmprestimos.getValueAt(this.tableEmprestimos.getSelectedRow(), 0).toString());
            }

            if (Integer.parseInt(this.campoAmigo.getText()) < 0 || Integer.parseInt(this.campoFerramenta.getText()) < 0) {
                throw new Mensagens("ID deve ser um número positivo.");
            } else {
                idAmigo = Integer.parseInt(this.campoAmigo.getText());
                idFerramenta = Integer.parseInt(this.campoFerramenta.getText());
            }

            if (this.campoDataPed.getText().contains("_")) {
                throw new Mensagens("Insira uma data de empréstimo válida.");
            } else {
                Date dataPadrao = sdf.parse(this.campoDataPed.getText());
                long tempo = dataPadrao.getTime();
                dataEmprestimo = new java.sql.Date(tempo);
            }

            if (!this.campoDataDev.getText().contains("_")) {
                Date dataPadrao = sdf.parse(this.campoDataDev.getText());
                long tempo = dataPadrao.getTime();
                dataDevolucao = new java.sql.Date(tempo);

                if (dataEmprestimo.getTime() > dataDevolucao.getTime()) {
                    throw new Mensagens("Data de empréstimo se encontra após data de devolução.");
                }
            }

            ArrayList<Emprestimo> minhalista = emprestimoDAO.getMinhaLista();

            for (Emprestimo e : minhalista) { // checa se essas informações já estão cadastradas
                if (e.getAmigo().getId() == idAmigo && e.getFerramenta().getId() == idFerramenta && e.getDataEmprestimo().getTime() == dataEmprestimo.getTime() && e.getId() != id) {
                    throw new Mensagens("Esse empréstimo já está cadastrado!");
                }
            }

            if (ferramentaDAO.amigoComFerramenta(idFerramenta) > 0) {
                Emprestimo e = emprestimoDAO.carregaEmprestimo(ferramentaDAO.amigoComFerramenta(idFerramenta));

                if (!(e.getAmigo().getId() == idAmigo && e.getFerramenta().getId() == idFerramenta && e.getDataEmprestimo().getTime() == dataEmprestimo.getTime())) {
                    if (dataDevolucao != null && e.getDataEmprestimo().compareTo(dataDevolucao) == -1) {
                        if (e.getId() != id) {
                            throw new Mensagens("A data de devolução se encontra a frente de um empréstimo pendente desta ferramenta!");
                        }
                        throw new Mensagens("A ferramenta que você está tentando inserir está em um empréstimo pendente!");
                    }
                }

            } else if (emprestimoDAO.amigoPendente(idAmigo) > 0) {
                int ferramentaPendente = emprestimoDAO.amigoPendente(idAmigo);

                String nome = amigoDAO.carregaAmigo(idAmigo).getNome();
                String ferramenta = ferramentaDAO.carregaFerramenta(ferramentaPendente).getNome();

                int resposta = JOptionPane.showConfirmDialog(rootPane, nome + " ainda não devolveu a(o) " + ferramenta + "\nTem certeza que deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);

                if (resposta == JOptionPane.NO_OPTION) {
                    throw new Mensagens("Empréstimo cancelado!");
                }
            }

            Emprestimo objeto = new Emprestimo(id,
                    amigoDAO.carregaAmigo(idAmigo),
                    ferramentaDAO.carregaFerramenta(idFerramenta),
                    dataEmprestimo,
                    dataDevolucao);
            if (this.emprestimoDAO.UpdateEmprestimoBD(objeto)) {

                // limpa os campos
                this.campoAmigo.setText("");
                this.campoFerramenta.setText("");
                this.campoDataPed.setText(null);
                this.campoDataDev.setText(null);
                JOptionPane.showMessageDialog(rootPane, "Empréstimo alterado com sucesso!");

            }

        } catch (Mensagens | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Favor, informe os IDs necessários para alteração.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (ParseException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao converter data inválida.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        try {
            int id = 0;
            int idAmigo = 0;

            if (this.tableEmprestimos.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro, selecione um empréstimo para remover");
            } else {
                id = Integer.parseInt(this.tableEmprestimos.getValueAt(this.tableEmprestimos.getSelectedRow(), 0).toString());
                idAmigo = emprestimoDAO.carregaEmprestimo(id).getAmigo().getId();
            }

            int resposta = JOptionPane.showConfirmDialog(rootPane, "Tem certeza que deseja remover este empréstimo?", "Confirmação", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION && this.emprestimoDAO.DeleteEmprestimoBD(id)) {
                JOptionPane.showMessageDialog(rootPane, "Empréstimo removido com sucesso!");
            }
        } catch (Mensagens | SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        TelaEmprestimos.this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void carregaTabela() { // listando os objetos emprestimo na tabela

        DefaultTableModel modelo = (DefaultTableModel) this.tableEmprestimos.getModel();
        modelo.setNumRows(0);

        ArrayList<Emprestimo> minhalista = emprestimoDAO.getMinhaLista();

        for (Emprestimo e : minhalista) {
            String stt = e.isStatus() ? "concluído" : "pendente";

            modelo.addRow(new Object[]{
                e.getId(),
                e.getAmigo().getNome(),
                e.getFerramenta().getNome(),
                e.getDataEmprestimo(),
                e.getDataDevolucao(),
                stt
            });
            amigoDAO.UpdateQtdEmprest(e.getAmigo().getId()); // atualiza a qtd de emprestimos de um amigo
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEmprestimos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExit;
    private javax.swing.JTextField campoAmigo;
    private javax.swing.JTextField campoDataDev;
    private javax.swing.JTextField campoDataPed;
    private javax.swing.JTextField campoFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableEmprestimos;
    // End of variables declaration//GEN-END:variables
}
