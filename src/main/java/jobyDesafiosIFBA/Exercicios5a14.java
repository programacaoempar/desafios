package jobyDesafiosIFBA;

public class Exercicios5a14 {

    public static void main(String[] args) {
    }

    int sucessor = 0;

    public int numeroInteiroSucessor(int inteiro) {
        inteiro = inteiro;
        sucessor = inteiro + 1;
        return sucessor;
    }

    public int resultadoDivisao(int numero1, int numero2) {
        numero1 = numero1;
        numero2 = numero2;
        int quociente = numero1 / numero2;
        return quociente;
    }

    public String idadeDiasMesAnos(double idadeDias) {
        idadeDias = idadeDias;
        double idadeMes = idadeDias / 12.0;
        double idadeAnos = idadeDias / 365.0;

        return (" " + idadeDias + "," + Utilitario.arredondaNumero(idadeMes) + "," + Utilitario.arredondaNumero(idadeAnos));

    }

    public String transformaCelsius(double fahrenheit) {
        fahrenheit = fahrenheit - 32;
        double celsius = fahrenheit / 1.8;

        return ("" + celsius + " Celsius");
    }

    public String calculaVolume(double raio, double altura) {
        double volume = raio * altura * 3.14;

        return (" " + Utilitario.arredondaNumero(volume) + " Volume");
    }


    public String decimalParaBinario(int n) {
        //if (n <= 32)
        String binary = Integer.toBinaryString(n);
        if (n <= 32) {
            return ("" + binary + " e o Numero Binario");

        } else {
            return " Numero inteiro acima do permitido";
        }

    }
    public double notaSemestral(double prova1bim1, double prova2bim1, double prova1bim2, double prova2bim2) {
        double bim1 = prova1bim1 + prova2bim1;
        double bim2 = prova1bim2 + prova2bim2;
        double resultado = bim1 + bim2;
        double resultado2 = resultado / 4;

        return resultado2;
    }

    public String transformamsKmh(double ms) {
        double kmh = ms * 3.6;
        return ("" + kmh + " Km/h");
    }

    public String calcularesistenciaEquivalente(double r1, double r2, double r3) {
        r1 = 1 / r1;
        r2 = 1 / r2;
        r3 = 1 / r3;
        double rq = r1 + r2 + r3;
        double resultado = 1 / rq;

        return ("Req " + Utilitario.arredondaNumero(resultado) + "");

    }

    public String distanciaVelocidade(double distancia, double velocidade, double tempoAceleracao) {
        tempoAceleracao = tempoAceleracao * 0.0001;
        double tempo = distancia / velocidade + tempoAceleracao;
        double hora = tempo;
        double minutos = tempo;
        double segundos = tempo;
        return ("" + Utilitario.arredondaTempo(tempo) + "");
    }
}
