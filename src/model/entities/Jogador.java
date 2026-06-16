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

            int l = linha - 4;

            for (int c = 0; c < 5; c++) {

                if (marcados[l][c]) {

                    System.out.print(AZUL);
                    System.out.printf("%3d ", cartela[l][c]);
                    System.out.print(RESET);

                } else {

                    System.out.printf("%3d ", cartela[l][c]);
                }
            }
        }
    }

    @Override
    public String toString() {

        String texto = "";

        texto += "==== B I N G O ====\n";
        texto += "Código: 000" + codigo + "\n";
        texto += "Jogador: " + nome + "\n";
        texto += "Marcadas: " + marcador + "\n";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                texto += cartela[i][j] + " ";
            }
            texto += "\n";
        }

        return texto;
    }

}
