package boliche;

public class Jogo {

    private int[] jogadas = new int[21];
    private int jogadaAtual = 0;

    public void jogada(int qtdPinusDerrubados) {
        jogadas[jogadaAtual++] = qtdPinusDerrubados;
    }

    public int pontuacao() {
        int pontuacao = 0;
        int i = 0;
        for (int rodadas = 0; rodadas < 10; rodadas++) {
            if(jogadas[i] + jogadas[i+1] == 10) { //spare
                pontuacao += 10 + jogadas[i+2];
                i += 2;
            } else {
                pontuacao += jogadas[i] + jogadas[i+1];
                i += 2;
            }
        }
        return pontuacao;
    }
}
