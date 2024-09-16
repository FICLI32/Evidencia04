import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraCientificaTest {
    @Test
    public void testCalcularSoluciones() {
        double A = 1;
        double B = 3;
        double C = 2;
        
        double discriminante = CalculadoraCientifica.calcularDiscriminante(A, B, C);
        
        assertEquals(1, discriminante, "El discriminante debería ser 1 para A=1, B=3, C=2");
    }
    @Test
    public void testCalcularSolucionesDiscriminanteNegativo() {
        double A = 1;
        double B = 2;
        double C = 5;

        double discriminante = CalculadoraCientifica.calcularDiscriminante(A, B, C);
        
        assertEquals(-16, discriminante, "El discriminante debería ser -16 para A=1, B=2, C=5");
    }
    
}
