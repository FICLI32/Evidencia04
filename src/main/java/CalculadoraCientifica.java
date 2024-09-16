import java.util.Scanner;

public class CalculadoraCientifica {
    public static void main(String[] args) {
        System.out.println("Calcular soluciones de una ecuacion Cuadratica");
        System.out.println("De la siguiente forma: Ax^2 +Bx +C = 0");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de A: ");
        double A = scanner.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        double B = scanner.nextDouble();
        System.out.print("Ingrese el valor de C: ");
        double C = scanner.nextDouble();

        calcularSoluciones(A, B, C);

        scanner.close();
    }
    public static void calcularSoluciones(double A, double B, double C) {
        double discriminante = calcularDiscriminante(A, B, C);
        System.out.println("El discriminado es: " + discriminante);
    }
    public static double calcularDiscriminante(double A, double B, double C) {
        return B * B - 4 * A * C;
    }
}
