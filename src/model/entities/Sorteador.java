package model.entities;

import java.util.Random;
import java.util.Scanner;

public class Sorteador {

    Jogador[] jogadores;
    int[] pedrasSorteadas = new int[75];
    int quantidadeSorteada = 0;

    public Sorteador (int total){
        this.jogadores= new Jogador[total];
    }

    public void marcarNaCartela(int pedra) {

        for (int h =0;h< jogadores.length;h++){
            for(int i = 0;i<5;i++){
                for(int j = 0;j<5;j++){
                    if(jogadores[h].cartela[i][j]== pedra){
                        jogadores[h].marcados[i][j]= true;
                        jogadores[h].marcador++;

                       }
                   }
                }
            }
        }


    public void mostrarParticipantes() {
        int limite = 4;
        for (int inicio = 0; inicio < jogadores.length; inicio += limite) {

            int fim = inicio + limite;

            if (fim > jogadores.length) {
                fim = jogadores.length;
            }
            for (int linha = 0; linha < 9; linha++) {

                for (int j = inicio; j < fim; j++) {
                    if (jogadores[j] != null) {

                        jogadores[j].exibirLinha(linha);

                        if (j < fim - 1) {
                            System.out.print(" | ");
                        }
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public void adicionarJogador (int cod) {
        Scanner input = new Scanner(System.in);
        for(int i =0;i<jogadores.length;i++ ){

            System.out.printf("Jogador %d: \n",i+1);
            System.out.println("Nome do jogador: ");
            
            String nome = input.nextLine();


            jogadores[i]= new Jogador(nome,cod);
            cod++;

        }
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

        return pedra;
    }

    public void iniciarJogo(){

        Scanner input = new Scanner(System.in);

        while(true){

            System.out.print("\nPressione ENTER para chamar a próxima pedra...");
            input.nextLine();

            int pedra = sortearPedra();

            System.out.println("\nPedra sorteada: " + pedra);
            System.out.println("\nPedras chamadas " + quantidadeSorteada );

            marcarNaCartela(pedra);

            mostrarParticipantes();

            }
        }
    }


