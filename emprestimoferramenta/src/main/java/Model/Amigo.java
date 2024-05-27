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