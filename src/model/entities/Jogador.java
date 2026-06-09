package model.entities;

public class Jogador {

    String nome;
    public Cartela cartela;

    public Jogador() {
    }

    public Jogador(String name, Cartela cartela) {
        this.nome = name;
        this.cartela = cartela;
    }

    @Override
    public String toString() {
        return "Jogador : "
                + nome
                + "\n"
                + cartela.toString();
    }

}
