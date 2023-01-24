package ex.propostosSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArcoIris {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto contendo as cores do arco-iris e exiba uma abaixo da outra: ");
        Set<String> arcoIris = new HashSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        for (String cores : arcoIris) {
            System.out.println(cores.toString());
        }
        
        System.out.println("\nA quantida de cores do arco-iris: " + arcoIris.size());

        System.out.println("\nExibir as cores em ordem alfabética: ");
        Set<String> arcoIris2 = new TreeSet<>(arcoIris);
        for (String cores : arcoIris2) {
            System.out.println(cores.toString());
        }

        System.out.println("\nExiba as cores na ordem inversa da que foi informada ");
        Set<String> arcoIris3 = new LinkedHashSet<>(arcoIris);
        List<String> coresArcoIrisList = new ArrayList<>(arcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("\nExiba todas as cores que começam com a letra ”v”: ");
        for (String cores: arcoIris) {
            if(cores.startsWith("v")) System.out.println(cores);
        }

        System.out.println("\nRemova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator = arcoIris.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("v")) iterator.remove();
        }
        System.out.println(arcoIris);

        System.out.println("\nLimpe o conjunto: ");
        arcoIris.clear();

        System.out.println("\nConfira se o conjunto está vazio: " + arcoIris.isEmpty());
    }
}
