package model.entities;

public class Jogador {

    String nome;
    int codigo;
    int[][] cartela;
    boolean[][] marcados = new boolean[5][5];
    int marcador;


    public Jogador(String name,int cod) {
        Cartela nova = new Cartela();
        this.cartela = nova.gerarCartela();
        this.codigo = cod;
        this.nome = name;

    }



    public static final String RESET = "\u001B[0m";
    public static final String AZUL = "\u001B[34m";



    public void exibirLinha(int linha) {

        if (linha == 0) {
            System.out.printf("%-20s", "==== B I N G O ====");
        }
        else if (linha == 1) {
            System.out.printf("%-20s",
                    String.format("Cod: %04d", codigo));
        }
        else if (linha == 2) {
            System.out.printf("%-20s",
                    "Jogador: " + nome);
        }
        else if (linha == 3) {
            System.out.printf("%-20s",
                    "Marcadas: " + marcador);
        }
        else {

            int i = linha - 4;

            for (int j = 0; j < 5; j++) {

                if (marcados[i][j]) {

                    System.out.print(AZUL);
                    System.out.printf("%3d ", cartela[i][j]);

                    System.out.printf("%3d ", cartela[i][j]);
                }
            }
        }
    }


    public String toString() {

        String texto = "==== B I N G O ====\n" +
                "Jogador: " + nome + "\n" +
                "Código 000" + codigo + "\n" +
                "Marcadas: " + marcador;
        return texto;
    }

}
