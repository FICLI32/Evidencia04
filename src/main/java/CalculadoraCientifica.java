import java.util.Scanner;

public class CalculadoraCientifica {

   //implementa una clase cuadrado para no confundir entre codigos
    static class Cuadrado {
        public static double calcularPerimetro(double lado) {
            return 4*lado; //como tiene 4 lados
        }

        public static double calcularArea(double lado) {
            return lado*lado; //area del cuadrado
        }
     
    }
    //clase cuadrado
    static class Rectangulo {
        public static double calcularPerimetro(double largo, double ancho) {
            return 2*(largo + ancho);//perimetro del rectangulo
        }

        public static double calcularArea(double largo, double ancho) {
            return largo*ancho;//area del rectangulo
        }
    }
    //clase circulo
    static class Circulo {
        public static double calcularPerimetro(double radio) {
            return 2 * Math.PI * radio; //biblioteca Math.PI(usa pi)
        } //perimetro del circulo 

        public static double calcularArea(double radio) {
            return Math.PI * radio * radio;
        } //are del circulo
    }
    //clase esfera
    static class Esfera {
        public static double calcularVolumen(double radio) {
            return (4.0/3.0) * Math.PI * Math.pow(radio, 3);
        } //Math.pow(base, exponente) calculo de potencias
        //calculo del volumen de la esfera
        public static double calcularArea(double radio) {
            return 4 * Math.PI * Math.pow(radio,2);
        }
    }

    static class Cubo {
        public static double calcularVolumen(double lado) {
            return Math.pow(lado, 3);
        }
        public static double calcularArea(double lado) {
            return 6* Math.pow(lado, 2);
        }
    }

    static class Cono {
        public static double calcularVolumen(double radio, double altura){
            return (1.0/3.0) * Math.PI * Math.pow(radio, 2) * altura;
        }
        public static double calcularArea(double radio, double altura) {
            //hacer una variable generatriz para realizar calculos de esta e implementar la biblioteca de raiz
            double generatriz = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));
            return Math.PI * radio * (radio + generatriz);
        }
    }
    //implementar el menu de usuario
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
        } while (opcion != 7);
    }

    public static void mostrarMenu() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║  Menu Calculadora Cientifica    ║");
        System.out.println("╠═════════════════════════════════╣");
        System.out.println("║ 1. Cuadrado                     ║");
        System.out.println("║ 2. Rectangulo                   ║");
        System.out.println("║ 3. Circulo                      ║");
        System.out.println("║ 4. Esfera                       ║");
        System.out.println("║ 5. Cubo                         ║");
        System.out.println("║ 6. Cono                         ║"); 
        System.out.println("║ 7. Salir                        ║");
        System.out.println("╚═════════════════════════════════╝"); 
        System.out.print("Selecione una opcion: ");   
    }

    public static int leerOpcion(Scanner scanner) {
        int opcion = 0;
        while (true) { 
            if(scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 1 && opcion <=7) {
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
                //cuadrado
                System.out.print("Ingrese el lado del cuadrado: ");
                double ladoCuadrado = scanner.nextDouble();
                System.out.println("Perimetro: " + Cuadrado.calcularPerimetro(ladoCuadrado));
                System.out.println("Area: " + Cuadrado.calcularArea(ladoCuadrado));
            }

            case 2 -> {
                //rectangulo
                System.out.print("Ingrese el largo del rectangulo: ");
                double largo = scanner.nextDouble();
                System.out.print("Ingrese el ancho del rectangulo: ");
                double ancho = scanner.nextDouble();
                System.out.println("Perimetro: " + Rectangulo.calcularPerimetro(largo, ancho));
                System.out.println("Area: " + Rectangulo.calcularArea(largo, ancho));
            }

            case 3 -> {
                //circulo
                System.out.print("Ingrese el radio del circulo: ");
                double radio = scanner.nextDouble();
                System.out.println("Perimetro: " + Circulo.calcularPerimetro(radio));
                System.out.println("Area: " + Circulo.calcularArea(radio));
            }
            
            case 4 -> {
                //esfera
                System.out.print("Ingrese el radio de la esfera: ");
                double radioE = scanner.nextDouble();
                System.out.println("Volumen: " + Esfera.calcularVolumen(radioE));
                System.out.println("Area: " + Esfera.calcularArea(radioE));
            }
        
            case 5 -> {
                //cubo
                System.out.print("Ingrese el lado del cubo: ");
                double ladoCubo = scanner.nextDouble();
                System.out.println("Volumen: " + Cubo.calcularVolumen(ladoCubo));
                System.out.println("Area: " + Cubo.calcularArea(ladoCubo));
            }
            
            case 6 -> {
                //cono
                System.out.print("Ingrese el radio del cono: ");
                double radioC = scanner.nextDouble();
                System.out.print("Ingrese la altura del cono: ");
                double altura = scanner.nextDouble();
                System.out.println("Volumen: " + Cono.calcularVolumen(radioC, altura));
                System.out.println("Area: " + Cono.calcularArea(radioC, altura));
            }
            
            case 7 -> System.out.println("Saliendo del programa...");

            default -> System.out.println("Opcion no valida, intente de nuevo");
        }
    } 

}
