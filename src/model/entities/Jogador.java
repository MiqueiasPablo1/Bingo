package model.entities;

public class Jogador {

    int idJogador;
    String name;
    Cartela cartela;

    public Jogador(String name, Cartela cartela) {
        this.name = name;
        this.cartela = cartela;
    }

}
