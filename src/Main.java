import model.entities.Cartela;
import model.entities.Jogador;
import model.entities.Sorteador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[5][5];
        Sorteador sorteador = new Sorteador();

        System.out.println(" Digite o nome do jogador: ");
        String nome = scanner.nextLine();

            cartela = new Cartela(contador);
            cartela.gerarCartela(contador);
            jogador = new Jogador(nome, cartela);
            sorteador.adicionarJogador(jogador, contador);

            System.out.println("JOGADOR REGISTRADO E CARTELA CRIADA! ");

            System.out.print("Há mais jogadores participantes (S/N)? ");
            opcao = scanner.nextLine().toUpperCase();

            contador++;
        } while (opcao.equals("S"));

        System.out.println(cartela.toString());
        cartela.marcarNaCartela(sorteador.sortearPedra());
        System.out.println(cartela.toString());

        /*
        System.out.println(cartela.toString());
        System.out.println(new Sorteador().sortearPedra());
        */
    }
}