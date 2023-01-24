package ex.serieOrdenacao;

public class Serie implements Comparable <Serie> {
        private String nome;
        private String genero;
        private Integer tempoEp;
    
        public Serie(String nome, String genero,Integer tempoEp){
            this.nome = nome;
            this.genero = genero;
            this.tempoEp = tempoEp;
        }
    
        public String getNome(){
            return nome;
        }
    
        public String getGenero(){
            return genero;
        }
    
        public Integer getTempoEp(){
            return tempoEp;
        }
    
        @Override
        public String toString() {
            return "[nome=" + nome + ", genero=" + genero + ", tempoEp=" + tempoEp + "]";
        }
    
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((nome == null) ? 0 : nome.hashCode());
            result = prime * result + ((genero == null) ? 0 : genero.hashCode());
            result = prime * result + ((tempoEp == null) ? 0 : tempoEp.hashCode());
            return result;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Serie other = (Serie) obj;
            if (nome == null) {
                if (other.nome != null)
                    return false;
            } else if (!nome.equals(other.nome))
                return false;
            if (genero == null) {
                if (other.genero != null)
                    return false;
            } else if (!genero.equals(other.genero))
                return false;
            if (tempoEp == null) {
                if (other.tempoEp != null)
                    return false;
            } else if (!tempoEp.equals(other.tempoEp))
                return false;
            return true;
        }

        @Override
        public int compareTo(Serie serie) {
            int tempoEpisodio = Integer.compare(this.getTempoEp(), serie.getTempoEp());
            if(tempoEpisodio !=0 ) return tempoEpisodio;
            return this.getGenero().compareTo(serie.getGenero());
        }

        
    }

    