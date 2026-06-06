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

        Cartela cartela = new Cartela(01);
        cartela.gerarCartela(01);
        Jogador jogador = new Jogador(nome, cartela);

        System.out.println(cartela.toString());
        cartela.marcarNaCartela(sorteador.sortearPedra());
        System.out.println(cartela.toString());

        /*
        System.out.println(cartela.toString());
        System.out.println(new Sorteador().sortearPedra());
        */
    }
}