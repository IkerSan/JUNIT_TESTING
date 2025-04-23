package ejercicioTipoExamen;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class ModuloTest {

    @Test
    void testNotaModuloValida() {
        Modulo m = new Modulo("Java", Arrays.asList(7.0, 8.0), Arrays.asList(6.0, 6.5));
        double nota = m.calcularNota();
        assertTrue(nota > 0 && nota <= 10);
    }

    @Test
    void testModuloConEntregableMenosUno() {
        Modulo m = new Modulo("Java", Arrays.asList(-1.0, 8.0), Arrays.asList(6.0));
        assertEquals(0, m.calcularNota());
    }

    @Test
    void testModuloExamenMenorA4() {
        Modulo m = new Modulo("Java", Arrays.asList(8.0), Arrays.asList(3.0));
        assertEquals(3.0, m.calcularNota());
    }
}

