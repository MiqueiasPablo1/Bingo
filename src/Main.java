import model.entities.Cartela;
import model.entities.Jogador;

public class Main {
    public static void main(String[] args) {

        Cartela cartela = new Cartela(01);
        Jogador jogador = new Jogador("Joao", cartela.gerarCartela(01).toString());

        System.out.println(cartela.gerarCartela(01).toString());


    }
}