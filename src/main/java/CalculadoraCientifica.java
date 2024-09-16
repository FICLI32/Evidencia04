import java.lang.reflect.Array;

public class CalculadoraCientifica {

    public static void main(String[] args) {
        System.out.println(calcularSistemaEcuaciones(0,2,3,0,0,9));
    }

    public static String calcularSistemaEcuaciones(double A, double B, double C, double D, double E, double F) {
        double[] ec1 = inicializarEc1(A, B, C);
        double[] ec2 = inicializarEc2(D, E, F);
        try {
            double valorY = despejarY(ec1,ec2);
            double valorX = despejarX(ec1, ec2);
            return ("valor de Y = "+ valorY  + "\n" + "valor de X = " + valorX);
        } catch (ArithmeticException e){
            return "Error, el sistema no tiene solucion o tiene infintas soluciones";
        }
    }

    public static double[] inicializarEc1(double A,double B, double C){
        double[] ec1 = new double[3];
        ec1[0] = A;
        ec1[1] = B;
        ec1[2] = C;
        return ec1;
    }

    public static double[] inicializarEc2(double D,double E, double F){
        double[] ec2 = new double[3];
        ec2[0] = D;
        ec2[1] = E;
        ec2[2] = F;
        return ec2;
    }

    public static double despejarX(double[] ec1, double[] ec2){
        double valorX;
        valorX = (ec1[2]*ec2[1] - ec1[1]*ec2[2]) / (ec1[0]*ec2[1] - ec1[1]*ec2[0]);
        return valorX;
    }

    public static double despejarY(double[] ec1, double[] ec2){
        double valorY;
        valorY = (ec1[0]*ec2[2] - ec1[2]*ec2[0]) / (ec1[0]*ec2[1] - ec1[1]*ec2[0]);
        return valorY;
    }
}
