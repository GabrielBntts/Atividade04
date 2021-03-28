package Biblioteca;

public class Livro {
    
    String nome;
    private String genero;
    private int preco;

    public Livro(String nome, String genero, int preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public Livro() {
        
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPreco() {
        return preco;
    }

    
    public void setPreco(int preco) {
        this.preco = preco;
    }

    public double verificarPreco() {
        if(this.preco >= 150) {
            preco = (preco - (preco * 0.2));
        }else{
            preco = preco;
        }
        return preco;
    }

    public String toString() {
        return "Dados Livro" + "\n"
            + "O nome do Livro: " + this.nome + "\n"
            + "O genero do Livro: " + this.genero + "\n"
            + "O preco do Livro: " + this.preco + "\n"
    }        
}
