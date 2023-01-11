package exercicios.loops;

import java.util.Scanner;

public class Ex_Tabuada {
    /*
     * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
     * O usuário deve informar de qual numero ele deseja ver a tabuada.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        System.out.println("Informe o número da tabuada:");
        numero = scan.nextInt();

        for(int i = 1; i <= 10; i++){
            int conta = numero * i;
            System.out.println(numero + " x " + i + " = " + conta);
        }
    }
}   
