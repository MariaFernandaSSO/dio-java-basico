import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scan = new Scanner(System.in);

        Random random = new Random(); // gerar números aleatórios

        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++) {
            int numero = random.nextInt(100);
            numeros[i] = numero;
        }

        System.out.print("Números Aleatórios: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores dos Números Aleatórios: ");
        for (int numero : numeros) {
            System.out.print((numero + 1) + " ");
        }

        System.out.print("\nAntecessores dos Números Aleatórios: ");
        for (int numero : numeros) {
            System.out.print((numero - 1) + " ");
        }

        System.out.println("\nsocorro deus sou antisocial");
    }
}
