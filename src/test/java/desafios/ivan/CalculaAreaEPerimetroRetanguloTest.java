package desafios.ivan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculaAreaEPerimetroRetanguloTest {

    @Test
    void calculaArea() {
        CalculaAreaEPerimetroRetangulo calculadora = new CalculaAreaEPerimetroRetangulo();
        assertEquals(4, calculadora.calculaArea(2,2));
    }

    @Test
    void calculaPerimetro() {
        CalculaAreaEPerimetroRetangulo calculadora = new CalculaAreaEPerimetroRetangulo();
        assertEquals(8, calculadora.calculaPerimetro(2,2));
    }
}