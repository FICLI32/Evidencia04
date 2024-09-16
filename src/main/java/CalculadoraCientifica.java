import java.lang.reflect.Array;

public class CalculadoraCientifica {

    public static void main(String[] args) {
    }

    public static String calcularSistemaEcuaciones(int A,int B, int C, int D, int E, int F) {
        int[] ec1 = inicializarEc1(A, B, C);
        int[] ec2 = inicializarEc2(D, E, F);
        if (ec1[0] != 0 && ec1[1] != 0 && ec2[0] != 0 && ec2[1] != 0) {
            int ecuacionDespejadaX = despejarXEc1(ec1);
            int ecuacionDespejadaY = despejarYEc1(ec1);
            int valorY = reemplazarXEc2(ec2, ecuacionDespejadaX);
            int valorX = reemplazarYEc2(ec2, ecuacionDespejadaY);
            return ("valor de Y = " + valorY + "\n" + "valor de X = " + valorX);
        } else {
            return "Los valores de A,B,D,E deben ser distintos de 0";
        }
    }

    public static int[] inicializarEc1(int A,int B, int C){
        int[] ec1 = new int[3];
        ec1[0] = A;
        ec1[1] = B;
        ec1[2] = C;
        return ec1;
    }

    public static int[] inicializarEc2(int D,int E, int F){
        int[] ec2 = new int[3];
        ec2[0] = D;
        ec2[1] = E;
        ec2[2] = F;
        return ec2;
    }

    public static int despejarXEc1(int[] ecuacion){
        int valorX;
        valorX = (ecuacion[2]-ecuacion[1])/ecuacion[0];
        return valorX;
    }

    public static int despejarYEc1(int[] ecuacion){
        int valorY;
        valorY = (ecuacion[2]-ecuacion[0])/ecuacion[1];
        return valorY;
    }

    public static int reemplazarXEc2(int[] ec2, int valorX){
        int valorYfinal;
        valorYfinal = ec2[2] / (ec2[0] * valorX + ec2[1]);
        return valorYfinal;
    }

    public static int reemplazarYEc2(int[] ec2, int valorY){
        int valorXfinal;
        valorXfinal = ec2[2] / (ec2[1] * valorY + ec2[0]);
        return valorXfinal;
    }

}
