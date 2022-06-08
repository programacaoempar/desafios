package desafios;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteSomaNumerosMenores {
    @Test
    void somaMenores() {
        SomaNumerosMenores soma = new SomaNumerosMenores();
        int[] numeros = new int[]{
                6, 5, 3, 4
        };
        assertEquals(7, soma.somaMenores(numeros));

    }

}
