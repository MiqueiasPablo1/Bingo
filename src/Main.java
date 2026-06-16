
import model.entities.Sorteador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int quantidadeJogadores = 0;

    while (quantidadeJogadores < 1 || quantidadeJogadores > 8) {
        System.out.print("==== BINGÃO DA GALERA ====\n");
        System.out.print("Patrocinado por :\nJP\nLucas\nLuís\nMiqueias\n1°PRÊMIO: 0,5 ponto em LP2 \n" +
                "2°PRÊMIO:um Guiné  \n");


        System.out.print("Quantidade de jogadores (máximo 8): \n");
        if(input.hasNextInt()){
            quantidadeJogadores = input.nextInt();

            if (quantidadeJogadores > 8) {
                System.out.println("Capacidade excedida! Máximo de 8 jogadores.\n");
            }

            else if (quantidadeJogadores < 1) {
                System.out.println("Quantidade inválida!\n");
            }
        }else{
            System.out.println("Digite apenas valores inteiros !\n");
            input.next();
        }


    }

    Sorteador jogo = new Sorteador(quantidadeJogadores);
    int cod =1;

    jogo.adicionarJogador(cod);
    jogo.mostrarCartelas();

    jogo.iniciarJogo();

    input.close();

}
}
