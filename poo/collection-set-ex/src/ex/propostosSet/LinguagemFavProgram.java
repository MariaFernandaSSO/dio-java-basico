package ex.propostosSet;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinguagemFavProgram {
    public static void main(String[] args) {
        Set<LinguagemFavorita> LinguagensFavoritas = new LinkedHashSet<>()
            {{
                add(new LinguagemFavorita("Javascript", 1995, "Visual Studio Code"));
                add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
                add(new LinguagemFavorita("C#", 2002, "Visual Studio"));
            }};
        
        System.out.println("\nExibir por ordem de inserção: ");
        for (LinguagemFavorita linguagemFavorita : LinguagensFavoritas) {
            System.out.println(linguagemFavorita.toString());
        }
        
        System.out.println("\nExibir por ordem natural (nome): ");
        Set<LinguagemFavorita> linguagemFav = new TreeSet<>(LinguagensFavoritas);
        for (LinguagemFavorita linguagemFavorita : linguagemFav) {
            System.out.println(linguagemFavorita.toString());
        }

        System.out.println("\nExibir por IDE: ");
        Set<LinguagemFavorita> linguagemFav2 = new TreeSet<>(new ComparatorIDE());
        linguagemFav2.addAll(linguagemFav);
        for (LinguagemFavorita linguagemFavorita : linguagemFav2) {
            System.out.println(linguagemFavorita.toString());
        }

        System.out.println("\nExibir por Ano de criação e nome: ");
        Set<LinguagemFavorita> linguagemFav3 = new TreeSet<>(new ComparatorAnoNome());
        linguagemFav3.addAll(linguagemFav);
        for (LinguagemFavorita linguagemFavorita : linguagemFav3) {
            System.out.println(linguagemFavorita.toString());
        }

        System.out.println("\nExibir por Ano de criação, nome e IDE: ");
        Set<LinguagemFavorita> linguagemFav4 = new TreeSet<>(new ComparatorAnoNomeIDE());
        linguagemFav4.addAll(linguagemFav);
        for (LinguagemFavorita linguagemFavorita : linguagemFav4) {
            System.out.println(linguagemFavorita.toString());
        }
        }
}
