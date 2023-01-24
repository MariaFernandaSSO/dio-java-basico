package ex.serieOrdenacao;

import java.util.Comparator;

public class ComparatorTempoEp implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        return Integer.compare(s1.getTempoEp(), s2.getTempoEp());
    }
    
}
