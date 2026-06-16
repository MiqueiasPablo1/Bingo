package model.entities;

public class Jogador {

    String nome;
    int codigo;
    int[][] cartela;
    boolean[][] marcados = new boolean[5][5];
    int marcador;

    public static final String RESET = "\u001B[0m";
    public static final String AZUL = "\u001B[34m";

    public Jogador(String name, int cod) {
        Cartela nova = new Cartela();
        this.cartela = nova.gerarCartela();
        this.codigo = cod;
        this.nome = name;
    }

    public boolean temBingo() {
        return marcador == 25;
    }

    public String getNome() {
        return nome;
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
                if (marcados[i][j]) {
                    texto += AZUL + String.format("%3d ", cartela[i][j]) + RESET;
                } else {
                    texto += String.format("%3d ", cartela[i][j]);
                }
            }
            texto += "\n";
        }

        return texto;
    }

}
