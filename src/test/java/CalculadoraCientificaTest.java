
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import javax.net.ssl.SSLContext;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraCientificaTest {

    @Test
    void testCuadrado() {
        // Test del cuadrado
        assertEquals(16.0, CalculadoraCientifica.Cuadrado.calcularPerimetro(4), 0.001);
        assertEquals(25.0, CalculadoraCientifica.Cuadrado.calcularArea(5), 0.001);
    }

    @Test
    void testRectangulo() {
        // Test del rectángulo
        assertEquals(14.0, CalculadoraCientifica.Rectangulo.calcularPerimetro(4, 3), 0.001);
        assertEquals(12.0, CalculadoraCientifica.Rectangulo.calcularArea(4, 3), 0.001);
    }

    @Test
    void testCirculo() {
        // Test del círculo
        assertEquals(2 * Math.PI * 3, CalculadoraCientifica.Circulo.calcularPerimetro(3), 0.001);
        assertEquals(Math.PI * Math.pow(3, 2), CalculadoraCientifica.Circulo.calcularArea(3), 0.001);
    }

    @Test
    void testEsfera() {
        // Test de la esfera
        assertEquals((4.0 / 3.0) * Math.PI * Math.pow(3, 3), CalculadoraCientifica.Esfera.calcularVolumen(3), 0.001);
        assertEquals(4 * Math.PI * Math.pow(3, 2), CalculadoraCientifica.Esfera.calcularArea(3), 0.001);
    }

    @Test
    void testCubo() {
        // Test del cubo
        assertEquals(Math.pow(3, 3), CalculadoraCientifica.Cubo.calcularVolumen(3), 0.001);
        assertEquals(6 * Math.pow(3, 2), CalculadoraCientifica.Cubo.calcularArea(3), 0.001);
    }

    @Test
    void testCono() {
        // Test del cono
        double radio = 3;
        double altura = 4;
        double generatriz = Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2)); // calcular generatriz
        assertEquals((1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura, CalculadoraCientifica.Cono.calcularVolumen(radio, altura), 0.001);
        assertEquals(Math.PI * radio * (radio + generatriz), CalculadoraCientifica.Cono.calcularArea(radio, altura), 0.001);
    }
}                                                             

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

