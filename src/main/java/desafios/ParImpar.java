package desafios;

public class ParImpar {
    public static void main(String[] args) {
        int numero = 48;
        String resultado = "";

        if (numero % 2 == 0) {
            resultado = "É Par";

        } else if (numero % 2 == 1) {
            resultado = "É Impar";
        }
        System.out.println(resultado);
    }

}