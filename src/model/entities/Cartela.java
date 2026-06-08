package model.entities;

import java.util.IllegalFormatConversionException;
import java.util.Random;

public class Cartela {

    int codigo;
    int[][] numeros = new int[5][5];

    Random random = new Random();
    public static final String RESET = "\u001B[0m";
    public static final String AZUL = "\u001B[34m";

    public Cartela (int codigo) {
        this.codigo = codigo;
    }

    public Cartela (int codigo, int[][] numeros) {
        this.codigo = codigo;
        this.numeros = numeros;
    }

    public int[][] gerarCartela(int codigo){

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = random.nextInt(101);
            }
        }
        return numeros;
    }

    public void marcarNaCartela (int pedra) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (pedra == numeros[i][j]) {
                    //ERROR // System.out.printf("%d\t ", AZUL + numeros[i][j] + RESET);
                    //TEST
                    //System.out.println(" * ");;
                }
            }
        }
    }

    @Override
    public String toString () {

        StringBuilder sb = new StringBuilder();

        sb.append(" ==== B I N G O ==== \n");
        sb.append(String.format(" == cod.: %d= \n", codigo));

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (marcados[i][j]){
                    sb.append(AZUL)
                    .append(String.format("%d\t", numeros[i][j]))
                    .append(RESET);
                    //sb.append(String.format("[%d]\t", numeros[i][j]));
                }
                else {
                    sb.append(String.format("%d\t", numeros[i][j]));
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
