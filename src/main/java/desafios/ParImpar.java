package desafios;

public class ParImpar {

    public String classifica(int numero) {
        String resultado = "";
        if (numero % 2 == 0) {
            resultado = "É Par";
        } else if (numero % 2 == 1) {
            resultado = "É Impar";
        }
        return resultado;
    }
}