package ex.retornos;

public class Quadrilatero {
    
    public static double calcularArea(double lado){
        return lado * lado;
    }

    public static double calcularArea(double lado1, double lado2){
        return lado1 * lado2;
    }

    public static double calcularArea(double base1, double base2, double h){
        return ((base1+base2)*h) / 2;
    }

    public static double calcularArea(float diagonal1, float diagonal2){
       return (diagonal1 * diagonal2)/2;
    }
}
