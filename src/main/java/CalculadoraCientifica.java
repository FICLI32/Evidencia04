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
            return (4/3) * Math.PI * Math.pow(radio, 3);
        } //Math.pow(base, exponente) calculo de potencias
        //calculo del volumen de la esfera
        public static double calcularArea(double radio) {
            return 4 * Math.PI * StrictMath.pow(radio,2);
        }
    }

    static class Cubo {
        public static double calcularVolumen(double lado) {
            return Math.pow(lado, 3)
        }
        public static double calculalArea(double lado) {
            return 6* Math.pow(lado, 2);
        }
    }

    static class Cono {
        public static double calcularVolumen(double radio, double altura){
            return (1/3) * Math.PI * Math.pow(radio, 2) * altura;
        }
        public static double calcularArea(double radio, double altura) {
            //hacer una variable generatriz para realizar calculos de esta e implementar la biblioteca de raiz
            double generatriz = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2));
            return Math.PI * radio * (radio + generatriz);
        }
    }
    //implementar el menu de usuario
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in)
        menu(scanner);
        scanner.close();
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

}
