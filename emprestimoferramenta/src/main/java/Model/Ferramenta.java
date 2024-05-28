package Model;


public class Ferramenta {
    
   private int id;
   private String nome;
   private String marca;
   private double custoAquisicao;

    public Ferramenta() {
    }

    public Ferramenta(String nome, String marca, double custoAquisicao) { // construtor sem id (auto-increment)
        this.nome = nome;
        this.marca = marca;
        this.custoAquisicao = custoAquisicao;
    }
    
    public Ferramenta(int id, String nome, String marca, double custoAquisicao) { // construtor para selectAll
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.custoAquisicao = custoAquisicao;
    }