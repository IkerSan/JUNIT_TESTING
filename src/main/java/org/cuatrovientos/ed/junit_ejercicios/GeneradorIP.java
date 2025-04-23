package org.cuatrovientos.ed.junit_ejercicios;
import java.util.Random;

public class GeneradorIP {

    private static final Random rnd = new Random();

    public int generarNumero(int min, int max) {
        return rnd.nextInt(max - min + 1) + min;
    }

    public String generarIPV4(int min, int max) {
        int[] segmentos = new int[4];

        for (int i = 0; i < 4; i++) {
            segmentos[i] = generarNumero(min, max);
        }

        // Asegurar que no empieza ni termina por 0
        if (segmentos[0] == 0) segmentos[0] = 1;
        if (segmentos[3] == 0) segmentos[3] = 1;

        return String.format("%d.%d.%d.%d", segmentos[0], segmentos[1], segmentos[2], segmentos[3]);
    }
}

