package jobyDesafiosIFBA;

public class Exercicios15a29 {

    public static void main(String[] args) {

    }

    public int calculaAlturaPredio(int sombraPredio, int sombraHomem, int alturaHomem) {
        int a = alturaHomem * sombraPredio;
        int x = a / sombraHomem;

        return x;
    }

    public String inverterNumeros(int numeros) {
        if (numeros < 1000) {
            int terceiroDigito = numeros % 10; //Resto da divisão 123 / 10 = 3º Digito;
            int segundoDigito = numeros / 10; //Resultado da divisão / 10 o resto = 2º Digito;
            int segundoDigito2 = segundoDigito % 10;
            int primeiroDigito = segundoDigito / 10;

            return ("" + terceiroDigito + "" + segundoDigito2 + "" + primeiroDigito + "");
        } else {

            return "Por favor digite apenas 3 numeros";


        }
    }

    public String trocaVariavel(int x, int y) { // x = 5 e y = 2
        x = x + y; // x = 7
        y = x - y; // y = 5
        x = x - y;


        return ("x = " + x + ", " + "y = " + y + "");
    }


    public String calcularRaizPrimeiroGrau(int x, int a, int x2, int b) {
        int x3 = 0; // ax + b = c // ax = c - b // 5x + 1 = -9
        int x4 = 0;
        x3 = x3 + x; // 5x
        x4 = x4 + x2; //3x
        x4 = x4 * -1; //-3x
        x3 = x3 + x4;
        a = a * -1;
        b = b + a; // 5x = -9 - 1
        x3 = b / x3; // -10 / 5

        return ("x = " + x3 + "");
    }

    public String divideValorTres(double valor) {
        double Entrada = valor / 3;
        int parcela2 = (int) Math.round(Entrada);
        int parcela3 = (int) Math.round(Entrada);
        //divide = valor - parcela2 - parcela3;
        if (parcela2 > Entrada) {
            parcela2 = parcela2 - 1;
        }
        if (parcela3 > Entrada) {
            parcela3 = parcela3 - 1;
        }
        Entrada = valor - parcela2 - parcela3;

        return ("" + Entrada + " Entrada " + parcela2 + " Primeira Parcela " + parcela3 + " Segunda Parcela ");
    }


    public String imprimePositivoNegativo(int numero) {
        if (numero > 0) {
            return "e positivo";
        }
        if (numero < 0) {
            return "e negativo";
        }
        return ("" + numero + "");
    }

    public int moduloNumero(int numero) {
        if (numero > 0) {
            numero = numero * 1;
        } else if (numero < 0) {
            numero = numero * -1;
        }
        return numero;
    }

    int resto1;

    public String retornaPar(int numero) {
        resto1 = numero % 2;
        if (resto1 == 0) {
            return " e par ";
        } else if (resto1 != 0) {
            return " e impar ";
        }
        return ("" + resto1 + "");

    }

    int numero;

    public int maiorEntreTresNumeros(int numero1, int numero2, int numero3) {
        if (numero1 > numero2 && numero1 > numero3) {
            numero = numero + numero1;
        } else if (numero2 > numero1 && numero2 > numero3) {
            numero = numero + numero2;
        } else if (numero3 > numero1 && numero3 > numero2) {
            numero = numero + numero3;
        }
        return numero;
    }

    public int somaMaioresNumeros(int numero1, int numero2, int numero3) {
        if (numero1 < numero2 && numero1 < numero3) {
            numero1 = 0;
        } else
            numero1 = numero1;

        if (numero2 < numero1 && numero2 < numero3) {
            numero2 = 0;
        } else
            numero2 = numero2;
        if (numero3 < numero1 && numero3 < numero2) {
            numero3 = 0;
        } else
            numero3 = numero3;
        return numero1 + numero2 + numero3;
    }

    double peso1 = 5;
    double peso2 = 2.5;
    double resultado;
    double pesoFinal;

    public double calculaPonderada(double nota1, double nota2, double nota3) {
        nota1 = nota1 * peso1;
        nota2 = nota2 * peso2;
        nota3 = nota3 * peso2;
        resultado = nota1 + nota2 + nota3;
        pesoFinal = peso1 + peso2 + peso2;
        resultado = resultado / pesoFinal;
        return resultado;
    }

    public String vogalouConsoante(String letra) {
        if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
            return "Vogal";
        } else
            return "Consoante";
    }

    double inss = 0.11;
    double teto = 334.29;

    public double descontoPrevidencia(double salario) {
        double desconto = salario * inss; //coloquei variavel e não valor para caso queira mudar o valor seja possivel acrescentar na variavel
        if (desconto > teto) {
            desconto = teto;
        }
        return desconto;
    }


}

