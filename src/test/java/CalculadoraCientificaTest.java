import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.net.ssl.SSLContext;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraCientificaTest {

    private double[] ec1;
    private double[] ec2;

    @Test
    void calcularSistemaEcuaciones() {
        assertEquals("valor de Y = " + 2.0 + "\n" + "valor de X = " + -1.0, CalculadoraCientifica.calcularSistemaEcuaciones(1, 2, 3, 4, 5, 6));
        assertEquals("valor de Y = " + "NaN" + "\n" + "valor de X = " + "-Infinity", CalculadoraCientifica.calcularSistemaEcuaciones(0, 2, 3, 0, 0, 6));
    }

    @Test
    void despejarX() {
        ec1 = new double[]{1,2,3};
        ec2 = new double[]{4,5,6};
        assertEquals(-1,CalculadoraCientifica.despejarX(ec1,ec2));
    }

    @Test
    void despejarY() {
        ec1 = new double[]{1,2,3};
        ec2 = new double[]{4,5,6};
        assertEquals(2,CalculadoraCientifica.despejarY(ec1,ec2));
    }
}