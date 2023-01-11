package exercicios.loops;

import java.util.Scanner;

public class Ex_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int menor = 0;
        int soma = 0;
        int contador = 0;

        System.out.println("Informe 5 números: ");

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;
            if (numero < menor) menor = numero;

            contador = contador + 1;
        } while(contador < 5);

        System.out.println("Maior Número Informado: " + maior);
        System.out.println("Menor Número Informado: " + menor);
        System.out.println("Média destes: " + (soma/5));

    }
}
