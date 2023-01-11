package exercicios.loops;

import java.util.Scanner;

public class Ex_Fatorial {
    /*
     * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
       Ex.: 5!=5.4.3.2.1=120
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o número do fatorial:");
        int numero = scan.nextInt();

        int conta = 1;
        for(int i = numero ; i >= 1; i--){
            conta = conta * i;
        }
        System.out.println(numero + "! = " + conta);

    }
}
