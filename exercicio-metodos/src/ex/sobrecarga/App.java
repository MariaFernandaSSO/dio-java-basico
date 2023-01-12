package ex.sobrecarga;

public class App {
    public static void main(String[] args) {
        System.out.println("Vamos testar :)");
        System.out.println();

        Quadrilatero.calcularArea(5);
        Quadrilatero.calcularArea(3d, 6d);
        Quadrilatero.calcularArea(4, 8, 2);
        Quadrilatero.calcularArea(3f, 6f);
    }
}
