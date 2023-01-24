package ex.serieOrdenacao;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("Ordem aleatória: ");
        Set<Serie> minhasSeries= new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie : minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEp());
        }

        System.out.println("\nOrdem de inserção: ");
        Set<Serie> minhasSeries1= new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie : minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEp());
        }

        System.out.println("\nOrdem de natural (tempo de ep): ");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries);
        for (Serie serie : minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEp());
        }

        System.out.println("\nOrdem nome gênero e tempo episódio: ");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEp());
        minhasSeries3.addAll(minhasSeries); 
        for (Serie serie : minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEp());
        }

        System.out.println("\nOrdem gênero");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries); 
        for (Serie serie : minhasSeries4) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEp());
        }

        System.out.println("\nOrdem tempo episódio");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempoEp());
        minhasSeries5.addAll(minhasSeries); 
        for (Serie serie : minhasSeries5) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEp());
        }
    } 
}




