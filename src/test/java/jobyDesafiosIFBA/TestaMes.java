package jobyDesafiosIFBA;

import br.com.programacaoempar.Mes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestaMes {

    Mes mes;

    @BeforeEach
    public void Iniciar(){
        mes = new Mes();
    }

    @Test
    public void numeroMes(){ // Exercício 25 Imprime mês de acordo com o número colocado
        assertEquals("Dezembro", mes.numMes(12));
    }


}
