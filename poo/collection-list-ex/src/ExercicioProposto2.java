import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> respostas = new ArrayList<String>();
       
        System.out.println("Perguntas: ");
        System.out.print("\nTelefonou para vítima? ");
        String resposta = scan.next();
        respostas.add(resposta);
        System.out.print("Esteve no local do crime? ");
        resposta = scan.next();
        respostas.add(resposta);
        System.out.print("Mora perto da vítima? ");
        resposta = scan.next();
        respostas.add(resposta);
        System.out.print("Devia para vítima? ");
        resposta = scan.next();
        respostas.add(resposta);
        System.out.print("Já trabalhou com a vítima? ");
        resposta = scan.next();
        respostas.add(resposta);  
        
        int cont = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s") || resp.contains("S")) {
                cont ++;
            }
        }

        switch(cont) {
            case 2:
                System.out.println("SUSPEITA"); break;
            case 3:
            case 4:
                System.out.println("CÚMPLICE"); break;
            case 5:
                System.out.println("ASSASSINO"); break;
            default:
                System.out.println("INOCENTE"); break;
        }
    }
}
