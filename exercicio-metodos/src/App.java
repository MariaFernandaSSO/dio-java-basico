public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos aos testes :)");

        System.out.println();
        Calculadora.soma(4, 2);
        Calculadora.subtracao(3, 1.5);
        Calculadora.divisao(10, 5);
        Calculadora.multiplicacao(5, 2);

        System.out.println();
        Mensagem.retornarMensagem(8);
        Mensagem.retornarMensagem(13);
        Mensagem.retornarMensagem(22);

        System.out.println();
        Emprestimo.calcularEmprestimo(1, 1000);
        Emprestimo.calcularEmprestimo(2, 1000);
        Emprestimo.calcularEmprestimo(3, 1000);
        Emprestimo.calcularEmprestimo(Emprestimo.getQuatroParcelas(), 1000);
    }
}
