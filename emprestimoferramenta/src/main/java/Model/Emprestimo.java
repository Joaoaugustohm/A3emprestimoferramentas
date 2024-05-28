package Model;

import java.sql.Date;

public class Emprestimo {
    
    private int id;
    private Amigo amigo;
    private Ferramenta ferramenta;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private boolean status;

    public Emprestimo() {
    }

    public Emprestimo(int id, Amigo amigo, Ferramenta ferramenta, Date dataEmprestimo, Date dataDevolucao) {
        this.id = id;
        this.amigo = amigo;
        this.ferramenta = ferramenta;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = (dataDevolucao != null);
    }
