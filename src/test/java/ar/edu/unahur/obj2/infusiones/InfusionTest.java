package ar.edu.unahur.obj2.infusiones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class InfusionTest {

    @Test
    void prepararTe() {
        Infusion te = new Te();
        String valorEsperado = "Calentar agua. \n" + "Verter el agua caliente sobre el saquito.";
        assertEquals(valorEsperado, te.preparar());
    }

    @Test
    void prepararMate() {
        Infusion mate = new Mate();
        String valorEsperado = "Calentar agua. \n" + "Cargar el mate con yerba y verter el agua caliente.";
        assertEquals(valorEsperado, mate.preparar());
    }

    @Test
    void prepararTeVerde() {
        Infusion teVerde = new TeVerde();
        String valorEsperado = "Calentar agua. \n" + "Elegir el saquito de té verde. \n" + "Verter el agua caliente sobre el saquito.";
        assertEquals(valorEsperado, teVerde.preparar());
    }
}
