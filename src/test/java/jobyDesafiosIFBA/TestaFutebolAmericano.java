package jobyDesafiosIFBA;

import br.com.programacaoempar.FutebolAmericano;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestaFutebolAmericano {

    FutebolAmericano futebol;

    @BeforeEach
    public void inicializa(){
        futebol = new FutebolAmericano();
    }
    @Test
    public void qbRating(){ //Exercício 31 - Calcula qbRating
        assertEquals(82.92,futebol.passesCompletados(6,50,24, 4,10));
    }

}
