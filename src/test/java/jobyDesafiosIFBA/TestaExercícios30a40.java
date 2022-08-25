package jobyDesafiosIFBA;

import br.com.programacaoempar.Exercícios30a40;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestaExercícios30a40 {

    Exercícios30a40 exercicio3;

    @BeforeEach
    public void inicializar() {
        exercicio3 = new Exercícios30a40();
    }

    @Test
    public void calculaCombustivel(){ //Exercício 30 Calcula o total abastecido de acordo com o tipo de combustivel e desconto.
    assertEquals(46.55,exercicio3.valorCombustivel("a",25));
    }

    @Test
    public void numeroLetraSimbolo(){ //  Exercício 32 Escreva um caracter e diga se ele é vogal, consoante, número ou símbolo
        assertEquals("simbolo",exercicio3.letraNumeroSimbolo("#"));
    }

    @Test
    public void coordenadas(){ //  Exercício 33  determine qual o quadrante ao qual pertence o ponto
        assertEquals("origem",exercicio3.leCoordenada(0,0));
    }

    @Test
    public void emprestimo(){ //Exercício 34 Escrever programa que libera empréstimos de acordo com critérios.
        assertEquals("Emprestimo Aprovado", exercicio3.emprestimoliberado(2500.0,25000.0,750.0));
    }

    @Test
    public void diasSemana(){ // Exercício 35 Números de 1 a 7 imprime dias da semana
        assertEquals("Segunda",exercicio3.diasDaSemana(2));
    }

    @Test
    public void notasEscolares(){ //Exercício 36 - Imprimir a classificação de nota de acordo com os critérios
        assertEquals("Reprovado",exercicio3.notaAluno(50,70,90,90,60));
    }

    @Test
    public void puverizacao(){ //Exercício 37 - Imprimir valor da Empresa de Pulverização de acordo com critérios
        assertEquals("213750.0",exercicio3.ciaPuverizacao(4,1000));
    }

    @Test
    public void anoBissexto(){ //Exercício 38 - Calcula ano bissexto.
        assertEquals("E bissexto",exercicio3.anoBissexto(2800));
    }
}
