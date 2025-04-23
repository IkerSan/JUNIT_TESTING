package ejercicioTipoExamen;
import java.util.*;

public class Modulo {
    private String nombre;
    private List <Double> entregables;
    private List <Double> examenes;

    public Modulo(String nombre, List<Double> entregables, List<Double> examenes) {
        this.nombre = nombre;
        this.entregables = entregables;
        this.examenes = examenes;
    }

    public double calcularNota() {
        // Reglas de validación
        if (entregables.contains(-1.0)) return 0;
        if (examenes.isEmpty()) return 0;

        for (double nota : examenes) {
            if (nota < 4) return Math.min(nota, 4);
        }

        double mediaEntregables = entregables.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double mediaExamenes = examenes.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        return 0.6 * mediaEntregables + 0.4 * mediaExamenes;
    }
}
