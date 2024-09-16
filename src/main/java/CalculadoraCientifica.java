import java.lang.reflect.Array;

public class CalculadoraCientifica {

    public static void main(String[] args) {
        System.out.println(calcularSistemaEcuaciones(-1,-3,5,7,8,9));
    }

    public static String calcularSistemaEcuaciones(double A, double B, double C, double D, double E, double F) {
        double[] ec1 = inicializarEc1(A, B, C);
        double[] ec2 = inicializarEc2(D, E, F);
        if (ec1[0] != 0 && ec1[1] != 0 && ec2[0] != 0 && ec2[1] != 0) {
            double valorY = despejarY(ec1,ec2);
            double valorX = despejarX(ec1, ec2);
            String valorYsr = Double.toString(valorY);
            String valorXsr = Double.toString(valorX);
            return ("valor de Y = "+ valorYsr  + "\n" + "valor de X = " + valorXsr);
        } else {
            return "Los valores de A,B,D,E deben ser distintos de 0";
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
