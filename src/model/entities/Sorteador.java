package model.entities;

import java.util.Random;

public class Sorteador {

    Jogador[] jogadores;
    int[] pedrasSorteadas;

    public Sorteador (){
    }

    public void verificarGanhador(){
        
    }

    public void marcarNaCartela (int pedra) {

        for (int k = 0 ; k < jogadores.length; k++) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                   if (jogadores[k] != null) {
                       if (jogadores[k].cartela.numeros[i][j] == pedra) {
                           jogadores[k].cartela.marcados[i][j] = true;
                       }
                   }
                }
            }
        }
    }

    public void mostrarParticipantes(){
        for (Jogador i : jogadores) {
            if (i != null) {
                    System.out.print(i);
            }

        }
    }

    public void adicionarJogador (Jogador jogador, int contador) {
        jogadores[contador] = jogador;
    }

    public int sortearPedra(){
        Random random = new Random();
        return random.nextInt(101);
    }
}
