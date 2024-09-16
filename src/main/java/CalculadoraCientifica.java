import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraCientifica {
    public static void main(String[] args) {
        System.out.println("Calcular soluciones de una ecuacion Cuadratica");
        System.out.println("De la siguiente forma: Ax^2 +Bx +C = 0");

        Scanner scanner = new Scanner(System.in);
        try{
           System.out.print("Ingrese el valor de A: ");
           double A = scanner.nextDouble();
           System.out.print("Ingrese el valor de B: ");
           double B = scanner.nextDouble();
           System.out.print("Ingrese el valor de C: ");
           double C = scanner.nextDouble();
           calcularSoluciones(A, B, C);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida. Por favor ingrese un número.");
        } finally {
            scanner.close();
        }
    }
    public static void calcularSoluciones(double A, double B, double C) {
        if (A == 0) {
            throw new IllegalArgumentException("El valor de A no puede ser 0 en una ecuación cuadrática.");
        }

        double discriminante = calcularDiscriminante(A, B, C);
        System.out.println("El discriminador es: " + discriminante);

        if (discriminante > 0) {
            double raizDiscriminante = Math.sqrt(discriminante);
            double x1 = (-B + raizDiscriminante) / (2 * A);
            double x2 = (-B - raizDiscriminante) / (2 * A);
            System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -B / (2 * A);
            System.out.println("Hay una solución y es: x = " + x);
        } else {
            throw new IllegalArgumentException("El discriminante es negativo la ecuación no tiene soluciones reales.");
        }
    }
    public static double calcularDiscriminante(double A, double B, double C) {
        return B * B - 4 * A * C;
    }
    public static double obtenerValor(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Por favor ingrese un número");
                scanner.next();
            }
        }
    }
}
