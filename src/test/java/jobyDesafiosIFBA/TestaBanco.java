package jobyDesafiosIFBA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestaBanco {

    Banco banco;

    @BeforeEach
    public void iniciar() {
        banco = new Banco();
    }

    @Test
    public void sacaNotas() { // Exercício 17 Contar Notas de dinheiro conforme o valor do saque e apresentar valor sacado.
        assertEquals(" Notas 2.0 de cem, 0.0 de cinquenta, 0.0 de vinte, 1.0 de dez, 0.0 de cinco, " +
                "0.0 de dois, 0.0 de um,  O valor sacado e de 210.0", banco.contaNotas(210));
    }

}
