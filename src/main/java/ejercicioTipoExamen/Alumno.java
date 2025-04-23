package ejercicioTipoExamen;
import java.util.*;

public class Alumno {
    private String nombre;
    private String email;
    private List<Modulo> modulos;

    public Alumno(String nombre, String email, List<Modulo> modulos) {
        this.nombre = nombre;
        this.email = email;
        this.modulos = modulos;
    }

    public boolean aprobarCurso() {

        if (modulos.isEmpty()) return true;

        for (Modulo modulo : modulos) {
            if (modulo.calcularNota() <= 5) return false;
        }
        return true;
    }
}
