package Entidades;

public class Produtos {
    private String nome;
    private Double preco;
    private int quantidade;

    public Produtos(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() { return nome; }
    public Double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }

    public void setNome(String nome) { this.nome = nome; }
    public void setPreco(Double preco) { this.preco = preco; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public int adicionar(int item) {
        this.quantidade += item;
        return quantidade;
    }

    public int remover(int item) {
        if (quantidade < item) {
            System.out.println("Não é possível remover mais nenhum item do estoque.");
        }
        return this.quantidade -= item;
    }



}
