import java.util.Scanner;

public class calculadoraCientifica {
    public static void main (String[] args) {
        System.out.println("Maximo entre 2 y 3:"+ mayor(2,3));
        System.out.println("Menor entre 6 y 3:"+ menor(6,3));
        System.out.println("Potencia de 3 a 3:"+ potencia(3,3));
        System.out.println("El 20% de 50:"+ porcentaje(50,20));
    }

    public static double mayor(double a, double b) {
        return Math.max(a, b);
    }

    public static double menor(double a, double b) {
        return Math.min(a, b);
    }

    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static double porcentaje(double numero, double porcentaje) {
        return (numero * porcentaje) / 100;
    }
}
