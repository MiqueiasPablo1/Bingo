import model.entities.Cartela;
import model.entities.Jogador;
import model.entities.Sorteador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Sorteador sorteador = new Sorteador();
        Cartela cartela;
        Jogador jogador;

        int contador = 0;
        String opcao;
        do {
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

        sorteador.mostrarParticipantes();

        contador = 0;
        do {
            System.out.println("Sorteie a pedra! (P) ");
            char botaoSortear = scanner.next().toUpperCase().charAt(0);

            if (botaoSortear == 'P') {
                int pedra = sorteador.sortearPedra();
                System.out.println("============================");
                System.out.printf("         Pedra: %d         \n", pedra);
                System.out.println("============================");
            }
            sorteador.mostrarParticipantes();

            scanner.nextLine();
            System.out.print("Deseja continuar(S/N)? ");
            opcao = scanner.next().toUpperCase();
            contador++;
        } while (opcao.equals("S"));

        sorteador.mostrarParticipantes();

    }
}
