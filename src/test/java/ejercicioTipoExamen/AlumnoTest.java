package ejercicioTipoExamen;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

public class AlumnoTest {

    @Test
    void testAlumnoAprueba() {
        Modulo m = new Modulo("Java", Arrays.asList(7.0), Arrays.asList(7.0));
        Alumno a = new Alumno("Pepe", "pepe@mail.com", List.of(m));
        assertTrue(a.aprobarCurso());
    }

    @Test
    void testAlumnoSinEmail() {
        Alumno a = new Alumno("Pepe", null, new ArrayList<>());
        assertThrows(IllegalArgumentException.class, () -> a.aprobarCurso());
    }

    @Test
    void testAlumnoSinModulos() {
        Alumno a = new Alumno("Pepe", "pepe@mail.com", new ArrayList<>());
        assertTrue(a.aprobarCurso());
    }
}

