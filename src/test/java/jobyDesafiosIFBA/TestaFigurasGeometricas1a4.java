package jobyDesafiosIFBA;

import br.com.programacaoempar.FigurasGeometricas1a4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestaFigurasGeometricas1a4 {

    FigurasGeometricas1a4 exerciciosFiguras;


    @BeforeEach
    public void iniciar() {
        exerciciosFiguras = new FigurasGeometricas1a4();
    }

    @Test
    public void retanguloArea() { //Exercício 1 da Liste de Lógica de Programação
        assertEquals(25, exerciciosFiguras.areaRetangulo(5, 5));
    }

    @Test
    public void retanguloPerimetro() { //Exercício 1 da Liste de Lógica de Programação
        assertEquals(20, exerciciosFiguras.perimetroRetangulo(5, 5));
    }

    @Test
    public void quadradoArea() { //Exercício 2 da Liste de Lógica de Programação
        assertEquals(25, exerciciosFiguras.areaQuadrado(5, 5));
    }

    @Test
    public void quadradoPerimetro() { //Exercício 2 da Liste de Lógica de Programação
        assertEquals(16, exerciciosFiguras.perimetroQuadrado(4));
    }

    @Test
    public void circunferenciaArea() { //Exercício 3 da Liste de Lógica de Programação
        assertEquals(28.26, exerciciosFiguras.areaCircunferencia(3.0));
    }

    @Test
    public void circunferenciaPerimetro() { //Exercício 3 da Liste de Lógica de Programação
        assertEquals(25.12, exerciciosFiguras.perimetroCircunferencia(4));
    }

    @Test
    public void perimetroTriangulo() { //Exercício 4 da Liste de Lógica de Programação
        assertEquals(30.0, exerciciosFiguras.perimetroTriangulo(10.0, 10.0, 10.0));
    }

}
