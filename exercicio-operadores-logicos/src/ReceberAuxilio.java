public class ReceberAuxilio {
    public static void main(String[] args) throws Exception {
        
        double salarioMensal = 1200.83;
        double mediaSalario = 1800.23;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("recebe auxilio? " + recebeAuxilio);
    }
}
