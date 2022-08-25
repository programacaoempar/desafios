package jobyDesafiosIFBA;


public class Banco {

    public static void main(String[] args) {

    }

    double um = 1;
    double dois = 2;
    double cinco = 5;
    double dez = 10;
    double vinte = 20;
    double cinquenta = 50;
    double cem = 100;
    double qtNotasCem, qtNotasCinquenta, qtNotasVinte, qtNotasDez, qtNotasCinco, qtNotasDois, qtNotasUm;
    double saldo, saldo2, saldo3, saldo4, saldo5, saldo6, saldo7, valorSacado;


    public String contaNotas(double valor) {
        valorSacado = valor;
        for (int qtCem = 0; qtCem < 1000; qtCem++) {
            qtNotasCem = qtCem;
            if (valor >= cem) {
                qtNotasCem = qtNotasCem + 1;
                valor = valor - cem;
                saldo = valor;
                if (saldo < cem) {
                    break;
                }
            } else break;

        }
        for (int qtCinquenta = 0; qtCinquenta < 1000; qtCinquenta++) {
            qtNotasCinquenta = qtCinquenta;
            if (valor >= cinquenta && valor > 0) {
                qtNotasCinquenta = qtNotasCinquenta + 1;
                valor = valor - cinquenta;
                saldo2 = valor;
                if (saldo2 < cinquenta) {
                    break;
                }
            } else break;
        }
        for (int qtVinte = 0; qtVinte < 1000; qtVinte++) {
            qtNotasVinte = qtVinte;
            if (valor >= vinte && valor > 0) {
                qtNotasVinte = qtNotasVinte + 1;
                valor = valor - vinte;
                saldo3 = valor;
                if (saldo3 < vinte) {
                    break;
                }
            } else break;
        }
        for (int qtDez = 0; qtDez < 1000; qtDez++) {
            qtNotasDez = qtDez;
            if (valor >= dez && valor > 0) {
                qtNotasDez = qtNotasDez + 1;
                valor = valor - dez;
                saldo4 = valor;
                if (saldo4 < dez) {
                    break;
                }
            } else break;
        }
        for (int qtCinco = 0; qtCinco < 1000; qtCinco++) {
            qtNotasCinco = qtCinco;
            if (valor >= cinco && valor > 0) {
                qtNotasCinco = qtNotasCinco + 1;
                valor = valor - cinco;
                saldo5 = valor;
                if (saldo5 < cinco) {
                    break;
                }
            } else break;
        }
        for (int qtDois = 0; qtDois < 1000; qtDois++) {
            qtNotasDois = qtDois;
            if (valor >= dois && valor > 0) {
                qtNotasDois = qtNotasDois + 1;
                valor = valor - dois;
                saldo6 = valor;
                if (saldo6 < dois) {
                    break;
                }
            } else break;
        }
        for (int qtUm = 0; qtUm < 1000; qtUm++) {
            qtNotasUm = qtUm;
            if (valor >= um && valor > 0) {
                qtNotasUm = qtNotasUm + 1;
                valor = valor - um;
                saldo7 = valor;
                if (saldo7 < um) {
                    break;
                }
            } else break;

        }
        return (" Notas " + qtNotasCem + " de cem, " + qtNotasCinquenta +
                " de cinquenta, " + qtNotasVinte + " de vinte, " + qtNotasDez +
                " de dez, " + qtNotasCinco + " de cinco, " + qtNotasDois + " de dois, " + qtNotasUm + " de um, " + " O valor sacado e de " + valorSacado);
    }


}




