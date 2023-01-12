package exercicios.arrays;

public class Ex_OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {199, 4, 2, 8, 12, 3};

        for(int i = vetor.length-1; i >= 0; i--){
           System.out.print(vetor[i] + " "); 
        }
    }
}
