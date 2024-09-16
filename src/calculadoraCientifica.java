import java.util.Scanner;

public class calculadoraCientifica {
    public static void main (String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            menu(scanner);
        }
    }

    public static void menu(Scanner scanner) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion(scanner);
            ejecutarOpcion(opcion, scanner);
        } while (opcion != 5);
    }

    public static void mostrarMenu() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║  Menu Calculadora Cientifica    ║");
        System.out.println("║           (Aritmética)          ║");
        System.out.println("╠═════════════════════════════════╣");
        System.out.println("║ 1. Mayor                        ║");
        System.out.println("║ 2. Menor                        ║");
        System.out.println("║ 3. Potencia                     ║");
        System.out.println("║ 4. Porcetaje                    ║");
        System.out.println("║ 5. Salir                        ║");
        System.out.println("╚═════════════════════════════════╝");
        System.out.print("Selecione una opcion: ");
    }

    public static int leerOpcion(Scanner scanner) {
        int opcion = 0;
        while (true) {
            if(scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <=5) {
                    break;
                } else {
                    System.out.println("Opcion invalida, ingrese nuevamente");
                    scanner.next();
                }
            } else {
                System.out.println("Entrada no valida, ingrese nuevamente");
                scanner.next();
            }
        }
        scanner.nextLine();
        return opcion;
    }

    public static void ejecutarOpcion(int opcion, Scanner scanner) {
        switch (opcion) {
            case 1 -> {
                System.out.println("Calcular el mayor entre dos números. ");
                System.out.println("Ingrese el primer número: ");
                double primerNumero = scanner.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                double segundoNumero = scanner.nextDouble();
                System.out.println("El mayor de los dos es:" + mayor(primerNumero, segundoNumero));;
            }

            case 2 -> {
                System.out.println("Calcular el menor entre dos números. ");
                System.out.println("Ingrese el primer número: ");
                double primerNumero = scanner.nextDouble();
                System.out.println("Ingrese el segundo número: ");
                double segundoNumero = scanner.nextDouble();
                System.out.println("El menor de los dos es:" + menor(primerNumero, segundoNumero));;
            }

            case 3 -> {
                System.out.println("Calcular potencia. ");
                System.out.println("Ingrese la base: ");
                double base = scanner.nextDouble();
                System.out.println("Ingrese el exponente: ");
                double exponente = scanner.nextDouble();
                System.out.println("La potencia de: " + base + "elevado a:" + exponente + "= " + potencia(base, exponente));

            }

            case 4 -> {
                System.out.println("Calcular porcentaje. ");
                System.out.println("Ingrese número: ");
                double numero = scanner.nextDouble();
                System.out.println("ingrese porcentaje: ");
                double porcentaje = scanner.nextDouble();
                System.out.println("El: " + porcentaje + "% de: " + numero + "= " + calcularPorcentaje(numero, porcentaje));
            }

            case 5 -> {
                System.out.println("Saliendo del programa...");
            }

            default -> System.out.println("Opcion no valida, intente de nuevo");
        }
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

    public static double calcularPorcentaje(double numero, double porcentaje) {
        return (numero * porcentaje) / 100;
    }
}
