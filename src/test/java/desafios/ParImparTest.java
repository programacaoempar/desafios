package desafios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParImparTest {

    @Test
    void classifica() {
        ParImpar parImpar = new ParImpar();

        var resultado = parImpar.classifica(50);

        assertEquals("É Par", resultado);


    }
}