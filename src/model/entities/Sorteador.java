package model.entities;

import java.util.Random;

public class Sorteador {

    Jogador[] jogadores;
    int[] pedrasSorteadas;

    public Sorteador (){
    }

    public int sortearPedra(){
        Random random = new Random();
        return random.nextInt(101);
    }
}
