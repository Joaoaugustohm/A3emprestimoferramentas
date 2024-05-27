package Model;

public class Amigo {
    
    private int id;
    private String nome;
    private long telefone;
    private int quantEmprest;

    public Amigo() {
    }
    
    public Amigo(String nome, long telefone, int quantEmprest) { // construtor sem id (auto-increment)
        this.nome = nome;
        this.telefone = telefone;
        this.quantEmprest = quantEmprest;
    }
    public Amigo(int id, String nome, long telefone) { // construtor para alteraçoes
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public Amigo(int id, String nome, long telefone, int quantEmprest) { // construtor para selectAll
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.quantEmprest = quantEmprest;
    }