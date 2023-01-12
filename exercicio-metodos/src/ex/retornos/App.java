package ex.retornos;

public class App {
    public static void main(String[] args) {
        System.out.println("Vamos testar :)");
        System.out.println();

        System.out.println("Área do quadrado: " + Quadrilatero.calcularArea(5));
        System.out.println("Área do retângulo: " + Quadrilatero.calcularArea(3d, 6d));
        System.out.println("Área do trapézio: " +  Quadrilatero.calcularArea(4, 8, 2));
        System.out.println("Área do losango: " + Quadrilatero.calcularArea(3f, 6f));
        
    }
}
