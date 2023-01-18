import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto{
    /*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
    Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
     e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> temperaturas = new ArrayList<Double>();

        for(int i = 0; i < 6; i++){
            System.out.print("Digite a temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
        }

        // Exibir temperaturas
        System.out.println("\n----- Todas as temperaturas: ------ ");
        for (Double temp : temperaturas) System.out.print( temp + " ");

        // Calcular a média 
        Iterator<Double> iterator = temperaturas.iterator();
         Double soma = 0d;
         while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
         }

         Double media = soma/temperaturas.size(); // soma/ 6

         System.out.println("\n\n Média das temperaturas: " + media);

         for (Double temp : temperaturas) {
            if (temp > media ){
                int i = temperaturas.indexOf(temp);

                switch (i) {
                    case 0:
                        System.out.println((i + 1) + " - JANEIRO: " + temp );
                        break;
                    case 1:
                        System.out.println((i + 1) + " - FEVEREIRO: " + temp);
                        break;
                    case 2:
                        System.out.println((i + 1) + " - MARÇO: " + temp);
                        break;
                    case 3:
                        System.out.println((i + 1) + " - ABRIL: " + temp);
                        break;
                    case 4:
                        System.out.println((i + 1) + " - MAIO: " + temp);
                        break;
                    case 5:
                        System.out.println((i + 1) + " - JUNHO: " + temp);
                        break;
                    default:
                        break;
                }
            }
         }
    }
}