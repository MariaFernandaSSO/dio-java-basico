import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MetodosList {
    public static void main(String[] args) throws Exception {
        /*
         * "ArrayList deve ser usado onde mais operações de pesquisa são necessárias, e LinkedList
         deve ser usado onde mais operações de inserção e exclusão são necessárias."
         */
    
        // Dada uma lista com 7 notas de um aluno
        /* Formas de se iniciar lista
         *  List<Double> notas = new ArrayList<>();
         *  List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5,9.4));
         */

         System.out.println("Crie uma lista e adicione as sete notas: ");
         List<Double> notas = new ArrayList<Double>();
         notas.add(8d);
         notas.add(6.2);
         notas.add(8.0);
         notas.add(2d);
         notas.add(5.5);
         notas.add(9.75);
         notas.add(9d);

         /*Formas de exibir a lista */
         System.out.println(notas);
         System.out.println(notas.toString());

         System.out.println("Exiba a posição da nota 5.5: " + notas.indexOf((5.5)));

         System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
         notas.add(4, 8d);
         System.out.println(notas);

         System.out.println("Substitua a nota 9.75 pela nota 6.0: ");
         notas.set(notas.indexOf(9.75), 6d);
         System.out.println(notas);

         System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

         System.out.println("Exiba todas as notas na ordem em que foram informados: ");
         for (Double nota : notas) System.out.println(nota); // imprimindo um abaixo do outro

         System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

         System.out.println("Exiba a menor nota: " + Collections.min(notas));

         System.out.println("Exiba a maior nota: " + Collections.max(notas));

         Iterator<Double> iterator = notas.iterator();
         Double soma = 0d;
         while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
         }

         System.out.println("Exiba a soma dos valores: " + soma);

         System.out.println("Exiba a média das notas: " + (soma/notas.size()));

         System.out.println("Remova a nota 2: ");
         notas.remove(2d);

         System.out.println("Remova a nota da posição 0: ");
         notas.remove(0);

         System.out.println("Remova as notas menores que 7 e exiba a lista: ");
         Iterator<Double> iterator1 = notas.iterator();
         while(iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
         }
         System.out.println(notas);

         System.out.println("Apague toda a lista");
         notas.clear();

         System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


    }
}
