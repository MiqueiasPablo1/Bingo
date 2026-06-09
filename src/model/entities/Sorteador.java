package model.entities;

import java.util.Random;

public class Sorteador {

    Jogador[] jogadores = new Jogador[45];
    int[] pedrasSorteadas = new int[75];
    int quantidadeSorteada = 0;

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

    public void mostrarParticipantes() {
        int count = 0;
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] != null) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Nenhum jogador participando.");
            return;
        }

        Jogador[] ativos = new Jogador[count];
        int idx = 0;
        for (int i = 0; i < jogadores.length; i++) {
            if (jogadores[i] != null) {
                ativos[idx] = jogadores[i];
                idx++;
            }
        }

        int limite = 4;
        for (int start = 0; start < count; start += limite) {
            int end = start + limite;
            if (end > count) {
                end = count;
            }

            for (int linha = 0; linha < 8; linha++) {
                for (int k = start; k < end; k++) {
                    Jogador jogador = ativos[k];

                    if (linha == 0) {
                        System.out.printf("Jogador: %-9.9s", jogador.nome);
                    } else if (linha == 1) {
                        System.out.print("--- B I N G O ----");
                    } else if (linha == 2) {
                        System.out.printf("---- cod.: %-3d ----", jogador.cartela.codigo);
                    } else {
                        int mLinha = linha - 3;
                        System.out.print("  ");
                        for (int col = 0; col < 5; col++) {
                            int num = jogador.cartela.numeros[mLinha][col];
                            boolean marcado = jogador.cartela.marcados[mLinha][col];

                            if (marcado) {
                                System.out.print(Cartela.AZUL);
                                System.out.printf("%2d", num);
                                System.out.print(Cartela.RESET);
                            } else {
                                System.out.printf("%2d", num);
                            }

                            if (col < 4) {
                                System.out.print(" ");
                            }
                        }
                        System.out.print("  ");
                    }

                    if (k < end - 1) {
                        System.out.print("  |  ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public void adicionarJogador (Jogador jogador, int contador) {
        jogadores[contador] = jogador;
    }

    public int sortearPedra(){

        Random random = new Random();
        int pedra;
        boolean repetida;

        do {
            pedra = random.nextInt(75) + 1;
            repetida = false;

            for (int i = 0; i < quantidadeSorteada; i++){
                if (pedrasSorteadas[i] == pedra) {
                    repetida = true;
                    break;
                }
            }
        } while (repetida);

        pedrasSorteadas[quantidadeSorteada] = pedra;
        quantidadeSorteada++;

        marcarNaCartela(pedra);

        return pedra;
    }
}
