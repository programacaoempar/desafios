package jobyDesafiosIFBA;

import br.com.programacaoempar.Exercicios15a29;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestaExercicios15a29 {

    Exercicios15a29 exercicios2;


    @BeforeEach
    public void iniciar() {
        exercicios2 = new Exercicios15a29();
    }

    @Test
    public void alturaPredio() { //Exercício 15 Calcula tamanho do prédio
        assertEquals(20, exercicios2.calculaAlturaPredio(40, 4, 2));
    }

    @Test
    public void inverteNumero() { //Exercício 16 Inverte números até 3 dígitos
        assertEquals("894", exercicios2.inverterNumeros(498));
    }

    @Test
    public void permuteVariaveis() { //Exercício 18 Permute o valor de duas variáveis inteiras.
        assertEquals("x = 4, y = 8", exercicios2.trocaVariavel(8, 4));
    }

    @Test
    public void calculaRaiz() { //Exercício 19 raiz de uma equação do primeiro grau
        assertEquals("x = -2", exercicios2.calcularRaizPrimeiroGrau(5, 1, 0, -9));
    }

    @Test
    public void divideParcelas() { //Exercício 20 forneça o valor da entrada e das duas prestações
        assertEquals("103.75 Entrada 101 Primeira Parcela 101 Segunda Parcela ", exercicios2.divideValorTres(305.75));
    }

    @Test
    public void positivoNegativo() { //Exercício 21 Imprime se é positio ou negativo
        assertEquals("e negativo", exercicios2.imprimePositivoNegativo(-5));
    }

    @Test
    public void moduloNumero() { // Exercício 22 Número exibe módulo
        assertEquals(3, exercicios2.moduloNumero(-3));
    }

    @Test
    public void lePar() { // Exercício 23 Indicar se é par ou impar
        assertEquals(" e impar ", exercicios2.retornaPar(15));
    }

    @Test
    public void escolheMaior() { //Exercício 24 Lê três números e imprime o maior.
        assertEquals(7, exercicios2.maiorEntreTresNumeros(5, 7, 3));
    }

    @Test
    public void somaMaiores() { //Exercício 26  lei 3 valores e escreva a soma dos 2 maiores.
        assertEquals(22, exercicios2.somaMaioresNumeros(10, 12, 8));
    }

    @Test
    public void mediaPonderada() { //Exercício 27 Calcula média ponderada entre 3 números
        assertEquals(107.5, exercicios2.calculaPonderada(120.0, 110.0, 80.0));
    }

    @Test
    public void vogalConsoante() { //Exercício 28 Recebe letra e diz se é vogal ou consoante
        assertEquals("Consoante", exercicios2.vogalouConsoante("z"));
    }

    @Test
    public void descontaPrevidencia() { //Exercício 29 Descontar 11% de Previdencia de Salario com teto de 334,29 de desconto
        assertEquals(334.29, exercicios2.descontoPrevidencia(10000.0));
    }

}
