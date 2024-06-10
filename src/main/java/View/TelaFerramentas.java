package View;

import DAO.FerramentaDAO;
import Model.Ferramenta;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class TelaFerramentas extends javax.swing.JFrame {

    private FerramentaDAO ferramentaDAO; // cria o vinculo com o Ferramenta.java

    public TelaFerramentas() {
        initComponents();
        this.ferramentaDAO = new FerramentaDAO(); // carrega DAO de Ferramenta.java
        carregaTabela();
        custoFerramentas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoCusto = new javax.swing.JTextField();
        campoMarca = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        campoCustoTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableFerramenta = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Ferramentas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Marca:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Custo:");

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(102, 255, 255));
        jPanel15.setForeground(new java.awt.Color(255, 0, 51));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setText("R$:");

        campoCustoTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        campoCustoTotal.setText("a");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCustoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel20)
                .addComponent(campoCustoTotal))
        );

        tableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Marca", "Custo"
            }
        ));
        tableFerramenta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableFerramenta);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Gasto total das ferramentas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCusto, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(campoMarca)
                            .addComponent(campoNome))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(149, 149, 149))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        try {
            // recebendo e validando dados da interface grafica.

            int id = 0;
            String nome = "";
            String marca = "";
            double custoAquisicao = 0;

            if (this.campoNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.campoNome.getText();
            }

            if (this.campoMarca.getText().length() < 2) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = (this.campoMarca.getText());
            }

            if (this.campoCusto.getText().length() < 2) {
                throw new Mensagens("Custo deve ser número e conter ao menos 2 dígitos.");
            } else {
                custoAquisicao = Double.parseDouble(this.campoCusto.getText());
            }

            ArrayList<Ferramenta> minhalista = ferramentaDAO.getMinhaLista();
            if (this.tableFerramenta.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro, selecione uma ferramenta para alterar");
            } else {
                id = Integer.parseInt(this.tableFerramenta.getValueAt(this.tableFerramenta.getSelectedRow(), 0).toString());
            }

            for (Ferramenta f : minhalista) { // checa se essas informações já estão cadastradas
                if(f.getNome().equalsIgnoreCase(nome) && f.getMarca().equalsIgnoreCase(marca) && f.getId() != id){
                    int resposta = JOptionPane.showConfirmDialog(rootPane, "Já existe uma ferramenta com o mesmo nome e marca.\nDeseja mesmo continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
                    if(resposta == JOptionPane.NO_OPTION) {
                        throw new Mensagens("Edição cancelada!");
                    }
                }
                else if(f.getNome().equalsIgnoreCase(nome) && f.getId() != id){
                    int resposta = JOptionPane.showConfirmDialog(rootPane, "Foi encontrada outra ferramenta com este nome.\nDeseja mesmo continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
                    if(resposta == JOptionPane.NO_OPTION) {
                        throw new Mensagens("Edição cancelada!");
                    }
                }
            }

            // envia os dados para a Ferramenta processar
            if (this.ferramentaDAO.UpdateFerramentaBD(new Ferramenta(id, nome, marca, custoAquisicao))) {

                // limpa os campos
                this.campoNome.setText("");
                this.campoMarca.setText("");
                this.campoCusto.setText("");
                JOptionPane.showMessageDialog(rootPane, "Ferramenta alterada com sucesso!");

            }
            System.out.println(this.ferramentaDAO.getMinhaLista().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Custo inválido, informe um número.");
        } finally {
            carregaTabela(); // atualiza a tabela.
            custoFerramentas();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        try {
            int id = 0;

            if(this.tableFerramenta.getSelectedRow() == -1) {
                throw new Mensagens("Primeiro, selecione uma ferramenta para remover");
            } else {
                id = Integer.parseInt(this.tableFerramenta.getValueAt(this.tableFerramenta.getSelectedRow(), 0).toString());
            }

            String pergunta = "Tem certeza que deseja remover esta ferramenta?";
            int resposta = JOptionPane.showConfirmDialog(rootPane, pergunta, "Confirmação", JOptionPane.YES_NO_OPTION);

            if(resposta == JOptionPane.YES_OPTION && this.ferramentaDAO.DeleteFerramentaBD(id)) {
                JOptionPane.showMessageDialog(rootPane, "Ferramenta removida com sucesso!");
            }
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } finally {
            carregaTabela();
            custoFerramentas();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        try {
            // recebendo e validando dados da interface grafica.
            String nome = "";
            String marca = "";
            double custo = 0;

            if (this.campoNome.getText().length() < 2) {
                throw new Mensagens("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.campoNome.getText();
            }

            if (this.campoMarca.getText().length() < 2) {
                throw new Mensagens("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = this.campoMarca.getText();
            }

            if (this.campoCusto.getText().length() < 2) {
                throw new Mensagens("Custo deve ser número e conter ao menos 2 dígitos.");
            } else {
                custo = Double.parseDouble(this.campoCusto.getText());
            }

            Ferramenta objeto = new Ferramenta(nome, marca, custo);

            // envia os dados para o Controlador cadastrar
            if (this.ferramentaDAO.FerramentaExistenteDB(nome)) {
                String pergunta = "Foi encontrado outra ferramenta com este nome.\nDeseja adicionar mais uma no estoque?";
                int resposta = JOptionPane.showConfirmDialog(rootPane, pergunta, "Confirmação", JOptionPane.YES_NO_OPTION);

                if(resposta == JOptionPane.YES_OPTION) {

                    if(this.ferramentaDAO.InsertFerramentaBD(objeto)) {
                        JOptionPane.showMessageDialog(rootPane, "Ferramenta cadastrada com sucesso!");

                        // limpa campos da interface
                        this.campoNome.setText("");
                        this.campoMarca.setText("");
                        this.campoCusto.setText("");
                    }
                }
            } else {
                if(this.ferramentaDAO.InsertFerramentaBD(objeto)) {
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta cadastrada com sucesso!");

                    this.campoNome.setText("");
                    this.campoMarca.setText("");
                    this.campoCusto.setText("");
                }
            }

        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Custo inválido, informe um número.", "Aviso", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException erro) {
            Logger.getLogger(TelaFerramentas.class.getName()).log(Level.SEVERE, null, erro);
        } finally {
            carregaTabela(); // atualiza a tabela.
            custoFerramentas(); // atualiza o valor das ferramentas.
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

     private void carregaTabela() { // listando os objetos ferramenta na tabela

        DefaultTableModel modelo = (DefaultTableModel) this.tableFerramenta.getModel();
        modelo.setNumRows(0);

        ArrayList<Ferramenta> minhalista = ferramentaDAO.getMinhaLista();

        for (Ferramenta a : minhalista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getMarca(),
                a.getCustoAquisicao()
            });
        }
    }
    
    private void custoFerramentas(){
        String contadorCusto = String.valueOf(ferramentaDAO.getContadorCusto());
        this.campoCustoTotal.setText(contadorCusto);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JTextField campoCusto;
    private javax.swing.JLabel campoCustoTotal;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tableFerramenta;
    // End of variables declaration//GEN-END:variables
}
