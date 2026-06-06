import model.entities.Cartela;
import model.entities.Jogador;

public class Main {
    public static void main(String[] args) {

        int[][] array = new int[5][5];

        Cartela cartela = new Cartela(01);
        cartela.gerarCartela(1);

        Jogador jogador = new Jogador("Joao", cartela);

        System.out.println(cartela.toString());


    }
}