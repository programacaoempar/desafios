package desafios;
import java.util.Arrays;

public class SomaNumerosMenores {

    public int somaMenores(int[] numeros){

        Arrays.sort(numeros);//organiza o array em ordem crescente

        int NumeroMenor = numeros[0];
        int SegundoMenor = numeros[1];
        int resposta = NumeroMenor + SegundoMenor;

        return resposta;
    }

}
