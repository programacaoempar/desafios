package jobyDesafiosIFBA;

import br.com.programacaoempar.Exercicios5a14;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class testaExercicios5a14 {

    Exercicios5a14 exercicio;


    @BeforeEach
    public void iniciar() {
        exercicio = new Exercicios5a14();
    }


    @Test
    public void numeroInteiroSucessor() { //Exercício 5 Ler núemro inteiro e exibir sucessor
        assertEquals(6, exercicio.numeroInteiroSucessor(5)); //Comando lê apenas númetos Int e exibe o número sucessor
    }

    @Test
    public void divisaoNumeros() { //Exercício 6 Ler dois números inteiros e exibir quociente da divisao entre eles
        assertEquals(3, exercicio.resultadoDivisao(6, 2));
    }

    @Test
    public void idadeDiasData() {// Exercício 7 Idade em dias, mes e ano.
        assertEquals(" 12842.0,1070.17,35.18", exercicio.idadeDiasMesAnos(12842.0));

    }

    @Test
    public void fahrenheitCelsius() { //Exercício 8 transformar Fahrenheit em Celsius
        assertEquals("10.0 Celsius", exercicio.transformaCelsius(50));
    }

    @Test
    public void volumeOleo() { //Exercício 9 calcule e apresenta o valor do volume de uma lata de óleo (Raio, Altura)
        assertEquals(" 282.6 Volume", exercicio.calculaVolume(4, 22.5));
    }

    @Test
    public void inteiroBinario(){ // Exercício 10 inteiro para binário
        assertEquals("11110 e o Numero Binario", exercicio.decimalParaBinario(30));
    }

    @Test
    public void notaSemestral(){ // Exercício 11 Calcular a nota semestral
        assertEquals(6.75, exercicio.notaSemestral(10.0,8.0,5.0,4.0));

    }

    @Test
    public void msKmh(){ //Exercício 12 transformar m/s em km/h
    assertEquals("72.0 Km/h", exercicio.transformamsKmh(20));
    }

    @Test
    public void resistenciaEquivalentes(){ // Exercício 13 Circuito elétrico de 2 Resistências + R3 em paralelo.
        assertEquals("Req 8.57", exercicio.calcularesistenciaEquivalente(20.0, 30, 30));

    }

    @Test
    public void calculaDistancia(){ // Exercício 14 Tempo de um sinal a outro.
        assertEquals("4.55889", exercicio.distanciaVelocidade(433.0, 95.0, 10));

    }


}
