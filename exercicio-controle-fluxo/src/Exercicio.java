public class Exercicio {
    public static void main(String[] args) throws Exception {
        
        int mes2 = 81;
        System.out.println("O mês é: " + exibirMes(mes2) + " E " + mostrarFerias(mes2));
        mostrarFeriasSwitch(mes2);
    }

    private static String exibirMes(int mes){
        if (mes == 1){
            return "janeiro";
        }else if(mes == 2){
            return "fevereiro";
        }
        else if(mes == 3){
            return "março";
        }
        else if(mes == 4){
            return "abril";
        }
        else if(mes == 5){
            return "maio";
        }
        else if(mes == 6){
            return "junho";
        }
        else if(mes == 7){
            return "julho";
        }
        else if(mes == 8){
            return "agosto";
        }
        else if(mes == 9){
            return "setembro";
        }
        else if(mes == 10){
            return "outubro";
        }
        else if(mes == 11){
            return "novembro";
        }
        else if(mes ==12){
            return "dezembro";
        }
        else {
            return "mês indefinido";
        }
    }
    
    private static String mostrarFerias(int mes){
        if ( mes == 1 || mes == 7 || mes == 12){
            return "É Férias";
        }
        else {
            return "ainda não é Férias";
        }
    }

    private static void mostrarFeriasSwitch(int mes){
       
        switch(mes){
            case 1:
            case 7:
            case 12:
             System.out.println("Férias");
             break;
             default:
                System.out.println("Mês indefinido"); 
                break;
        }
    }
}
