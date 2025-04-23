package org.cuatrovientos.ed.junit_ejercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeneradorIPTest {

	@Test
	void testGenerarNumero() {
	    GeneradorIP generador = new GeneradorIP();
	    
	    for (int i = 0; i < 1000; i++) {
	        int numero = generador.generarNumero(0, 254);
	        assertTrue(numero >= 0 && numero <= 254, "Número fuera de rango");
	    }
	}
	@Test
	void testGenerarIPV4() {
		GeneradorIP generador = new GeneradorIP();

		for (int i = 0; i < 100; i++) {
			String ip = generador.generarIPV4(0, 254);
			String[] partes = ip.split("\\.");
        
			assertEquals(4, partes.length, "La IP no tiene 4 partes");

        for (String parte : partes) {
            int valor = Integer.parseInt(parte);
            assertTrue(valor >= 0 && valor <= 254, "Valor fuera de rango");
        }

        assertNotEquals("0", partes[0], "La IP no puede empezar con 0");
        assertNotEquals("0", partes[3], "La IP no puede terminar con 0");
    }
}
}
