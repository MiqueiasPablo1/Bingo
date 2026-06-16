package model.entities;

import java.util.Random;

public class Cartela {

    int[][] numeros = new int[5][5];


    Random random = new Random();

    public int[][] gerarCartela() {

        int[] min = {1, 16, 31, 46, 61};
        int[] max = {15, 30, 45, 60, 75};
        int sorteado;
        boolean repetido;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                do {
                    sorteado = random.nextInt(min[i], max[i] + 1);
                    repetido = false;
                    for (int k = 0; k < j; k++) {
                        if (sorteado == numeros[k][i]) {
                            repetido = true;
                        }
                    }
                } while (repetido);
                numeros[j][i] = sorteado;
            }
        }
        return numeros;
    }
}


