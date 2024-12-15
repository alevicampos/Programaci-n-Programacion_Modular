import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class JuegosEnCintasTest {


    @Test
    void esPosibleGrabar() {

        assertAll(() -> assertTrue(JuegosEnCintas.esPosibleGrabar(new int[]{2, 2}, 2)),
                () -> assertTrue(JuegosEnCintas.esPosibleGrabar(new int[]{1, 2, 3, 4}, 5)),
                () -> assertFalse(JuegosEnCintas.esPosibleGrabar(new int[]{6, 2, 2}, 5)),
                () -> assertFalse(JuegosEnCintas.esPosibleGrabar(new int[]{4, 4, 4}, 6)),
                () -> assertTrue(JuegosEnCintas.esPosibleGrabar(new int[]{8}, 8)),
                () -> assertTrue(JuegosEnCintas.esPosibleGrabar(new int[]{1, 1}, 2)),
                () -> assertFalse(JuegosEnCintas.esPosibleGrabar(new int[]{10, 10}, 5)),
                () -> assertTrue(JuegosEnCintas.esPosibleGrabar(new int[]{1_0000_0000, 1_0000_0000}, 1_0000_0000)),
                () -> assertFalse(JuegosEnCintas.esPosibleGrabar(new int[]{0, 1}, 1)));

    }
}