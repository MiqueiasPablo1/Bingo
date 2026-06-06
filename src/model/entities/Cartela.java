package model.entities;

import java.util.Random;

public class Cartela {
    Random random = new Random();

    int codigo;
    int[][] numeros = new int[5][5];

    public Cartela (int codigo) {
        this.codigo = codigo;
    }

    public int[][] gerarCartela(int codigo){

        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                numeros[i][j] = random.nextInt(101);
            }
        }
        return numeros;
    }

    @Override
    public String toString () {

        StringBuilder sb = new StringBuilder();

        sb.append("== B I N G O ==");

        for (int[] linha: numeros){
            for (int coluna: linha){
                sb.append(String.format("%d \t\t", coluna));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
