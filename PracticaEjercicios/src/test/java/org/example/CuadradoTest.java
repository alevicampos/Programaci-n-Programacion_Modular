package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {

    @Test
    void cuadrado() {
    }

    @Test
    void pedirNumero() {
        //simulamos que el usuario ingresa caracteres
        String entradaSimulada = "aaa"; // 'a' es un carácter no válido
        System.setIn(new ByteArrayInputStream(entradaSimulada.getBytes()));

        //creamos un ByteArrayOutputStream para guardar la salida por consola
        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));

        Cuadrado cuadrado = new Cuadrado();

        //llamamos al metodo que procesa la entrada
        int resultado = cuadrado.pedirNumero();

        //verificamos que el valor que devuelve es el esperado (-1)
        assertEquals(-1, resultado);

        //verificamos que se haya impreso el mensaje de error esperado
        String salidaEsperada = "Formato no válido.";
        // assertEquals(salidaEsperada, salida.toString().trim());
        assertTrue(salida.toString().trim().contains(salidaEsperada));

    }

    @Test
    void validarNumero() {
        assertAll(
                ()-> assertTrue(Cuadrado.validarNumero(2)),
                ()-> assertTrue(Cuadrado.validarNumero(20)),
                ()->assertFalse(Cuadrado.validarNumero(100000000)),
                ()->assertTrue(Cuadrado.validarNumero(-3))
        );
    }

    @Test
    void calcularCuadrado() {
        assertAll(
                ()-> assertEquals(25, Cuadrado.calcularCuadrado(5)),
                        ()-> assertEquals(0, Cuadrado.calcularCuadrado(0))
                                );




    }
}