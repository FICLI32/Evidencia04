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

    static class Rectangulo {
        public static double calcularPerimetro(double largo, double ancho) {
            return 2*(largo + ancho);//perimetro del rectangulo
        }

        public static double calcularArea(double largo, double ancho) {
            return largo*ancho;//area del rectangulo
        }
    }

    static class Circulo {
        public static double calcularPerimetro(double radio) {
            return 2 * Math.PI * radio; //biblioteca Math.PI(usa pi)
        } //perimetro del circulo 

        public static double calcularArea(double radio) {
            return Math.PI * radio * radio;
        } //are del circulo
    }

    static class Esfera {
        public static double calcularVolumen(double radio) {
            return (4/3) * Math.PI * Math.pow(radio, 3);
        } //Math.pow(base, exponente) calculo de potencias
    }   //calculo del volumen de la esfera


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in)

    }

}
