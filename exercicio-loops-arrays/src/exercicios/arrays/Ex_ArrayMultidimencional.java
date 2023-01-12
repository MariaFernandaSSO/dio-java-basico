package exercicios.arrays;

import java.util.Random;

public class Ex_ArrayMultidimencional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i<M.length; i++){
            for(int j = 0; j<M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("matriz: ");
        for (int[] linha : M) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }

    }
}
