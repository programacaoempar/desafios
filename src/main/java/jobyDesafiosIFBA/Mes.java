package jobyDesafiosIFBA;

public class Mes {

    public static void main(String[] args) {

    }

    public String numMes(int numero) {
        if (numero == 1) {
            return "Janeiro";
        }
        if (numero == 2) {
            return "Fevereiro";
        }
        if (numero == 3) {
            return "Março";
        }
        if (numero == 4) {
            return "Abril";
        }
        if (numero == 5) {
            return "Maio";
        }
        if (numero == 6) {
            return "Junho";
        }
        if (numero == 7) {
            return "Julho";
        }
        if (numero == 8) {
            return "Agosto";
        }
        if (numero == 9) {
            return "Setembro";
        }
        if (numero == 10) {
            return "Outubro";
        }
        if (numero == 11) {
            return "Novembro";
        }
        if (numero == 12) {
            return "Dezembro";
        }
        if (numero > 13) {
            return "Erro";
        }
        return ("" + numero + "");
    }
}
