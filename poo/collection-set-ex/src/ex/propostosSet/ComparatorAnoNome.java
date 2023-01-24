package ex.propostosSet;

import java.util.Comparator;

public class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (ano !=0 ) return ano;
        return  l1.getNome().compareTo(l2.getNome());  
    }
    
}
