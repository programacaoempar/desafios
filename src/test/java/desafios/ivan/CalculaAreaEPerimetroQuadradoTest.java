package desafios.ivan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculaAreaEPerimetroQuadradoTest {

    @Test
    void calculaArea() {
        CalculaAreaEPerimetroQuadrado calculadora = new CalculaAreaEPerimetroQuadrado();
        assertEquals(4, calculadora.calculaArea(2));
    }

    @Test
    void calculaPerimetro() {
        CalculaAreaEPerimetroQuadrado calculadora = new CalculaAreaEPerimetroQuadrado();
        assertEquals(8, calculadora.calculaPerimetro(2));
    }
}