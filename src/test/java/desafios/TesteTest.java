package desafios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TesteTest {

    @Test
    void testString(){
        Teste teste = new Teste();
        assertEquals("oi", teste.retornaString());
    }

}