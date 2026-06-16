
import model.entities.Sorteador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int quantidadeJogadores = 0;

        Scanner sc = new Scanner(System.in);

        while (quantidadeJogadores < 1 || quantidadeJogadores > 8) {
            System.out.println("BINGÃO DA GALERA");
            System.out.print("Quantidade de jogadores (máximo 8): \n");

            if (sc.hasNextInt()) {
                quantidadeJogadores = sc.nextInt();
                sc.nextLine();

                if (quantidadeJogadores > 8) {
                    System.out.println("Capacidade excedida! Máximo de 8 jogadores.\n");
                    quantidadeJogadores = 0;
                } else if (quantidadeJogadores < 1) {
                    System.out.println("Quantidade inválida!\n");
                }
            } else {
                System.out.println("Digite apenas valores inteiros!\n");
                sc.next();
            }
        }

        sc.close();

        Sorteador sorteador = new Sorteador(quantidadeJogadores);

        sorteador.adicionarJogador(1);
        sorteador.mostrarCartelas();
        sorteador.iniciarJogo();
    }
}
