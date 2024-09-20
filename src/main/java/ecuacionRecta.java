public class ecuacionRecta {
    public static void main (String[] args) {
        double x1 = 2;
        double x2 = 3;
        double y1 = 4;
        double y2 = 5;
        double pendiente = pendiente(x1, y1, x2, y2);
        double inter = interseccion(x1, y1, pendiente);
        System.out.println("Ecuacion de la recta es: Y = " + pendiente +"X + " + inter);
    }

    public static double pendiente(double x1, double y1, double x2, double y2) {
        if (x2 == x1) {
            System.out.println("Pendiente indefinida. ");
        }
        return (y2 - y1) / (x2 - x1);
    }

    public static double interseccion(double x1, double y1, double pendiente) {
        return y1 - (pendiente * x1);
    }
}