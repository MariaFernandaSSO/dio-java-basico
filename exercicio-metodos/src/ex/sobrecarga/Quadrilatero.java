package ex.sobrecarga;

public class Quadrilatero {
    
    public static void calcularArea(double lado){
        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void calcularArea(double lado1, double lado2){
        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void calcularArea(double base1, double base2, double h){
        System.out.println("Área do trapézio: " + ((base1+base2)*h) / 2);
    }

    public static void calcularArea(float diagonal1, float diagonal2){
        System.out.println("Área do losango: " + (diagonal1 * diagonal2)/2);
    }
}
