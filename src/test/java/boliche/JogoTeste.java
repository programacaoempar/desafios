package boliche;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JogoTeste {
    Jogo jogo;

    @BeforeEach
    void setup(){
        jogo = new Jogo();
    }
    private void variasJogadas(int n, int qtdPinusDerrubados) {
        for (int i = 0; i < n; i++)
            jogo.jogada(qtdPinusDerrubados);
    }

    @Test
    void teste(){
        variasJogadas(10, 1);
        assertEquals(10, jogo.pontuacao());
    }

    @Test
    void todosEmUm(){
        variasJogadas(10, 2);
        assertEquals(20, jogo.pontuacao());
    }

    @Test
    void testaSpare() {
        jogo.jogada(5);
        jogo.jogada(5); //spare 15

        jogo.jogada(5);
        jogo.jogada(5);// 13

        jogo.jogada(3);
        variasJogadas(15, 0);

        assertEquals(31, jogo.pontuacao());
    }

}
