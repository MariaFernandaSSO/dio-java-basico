package ex.metodos1;
public class Emprestimo {
    static double taxa_1 = 0.5;
    static double taxa_2 = 0.8;
    static double taxa_3 = 1.5;

    public static int getQuatroParcelas(){
        return 4;
    }

    public static void calcularEmprestimo(int parcelas, double valor){
        
        
        if (parcelas == 1){
            double valorFinal = valor + (valor * taxa_1);
            System.out.println("Valor inicial informado: " + valor);
            System.out.println("Valor final do empréstimo para " + parcelas + " parcelas: R$ " + valorFinal);
        }
        else if (parcelas == 2){
            double valorFinal = valor + (valor * taxa_2);
            System.out.println("Valor inicial informado: " + valor);
            System.out.println("Valor final do empréstimo para " + parcelas + " parcelas: R$ " + valorFinal);
        }
        else if (parcelas == 3){
            double valorFinal = valor + (valor * taxa_3);
            System.out.println("Valor inicial informado: " + valor);
            System.out.println("Valor final do empréstimo para " + parcelas + " parcelas: R$ " + valorFinal);
        }
        else if (parcelas == 4){
            double valorFinal = valor + (valor * getQuatroParcelas());
            System.out.println("Valor inicial informado: " + valor);
            System.out.println("Valor final do empréstimo para " + parcelas + " parcelas: R$ " + valorFinal);
        }
        else {
            System.out.println("Número de parcelas para empréstimo inexistente;");
        }
    }
}
