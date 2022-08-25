package jobyDesafiosIFBA;

public class Exercícios30a40 {

    public static void main(String[] args) {

    }

    double alcool = 1.9;
    double gasolina = 2.7;
    String a;
    String g;
    double valorFinal;

    public double valorCombustivel(String combustivel, double litros) {
        if (combustivel == "a") {
            alcool = litros * alcool;
            if (litros <= 25) {
                double desconto = alcool * 0.02;
                valorFinal = alcool - desconto;
            } else if (litros > 25) {
                double desconto2 = alcool * 0.04;
                valorFinal = alcool - desconto2;
            }

        } else if (combustivel == "g") {
            gasolina = litros * gasolina;
            if (litros <= 25) {
                double desconto = gasolina * 0.03;
                valorFinal = gasolina - desconto;
            } else if (litros > 25) {
                double desconto2 = gasolina * 0.05;
                valorFinal = gasolina - desconto2;
            }

        }
        return valorFinal;
    }


    public String letraNumeroSimbolo(String caracter) {
        for (char c : caracter.toCharArray()) {
            if (Character.isDigit(c)) {
                return "numero";
            } else if (Character.isLetter(c)) {
                if (caracter == "a" || caracter == "e" || caracter == "i" || caracter == "o" || caracter == "u") {
                    return "vogal";
                } else
                    return "consoante";
            } else {
                return "simbolo";
            }
        }
        return ("" + caracter + "");
    }

    int coordenada;

    public String leCoordenada(int x, int y) {
        if (x == 0 && y == 0) {
            return "origem";
        } else if (x > 0 && y > 0) {
            return "Quadrante 1";
        } else if (x > 0 && y < 0) {
            return "Quadrante 2";
        } else if (x < 0 && y > 0) {
            return "Quadrante 3";
        } else if (x < 0 && y < 0) {
            return "Quadrante 4";
        }
        return ("" + x + y + "");
    }

    public String emprestimoliberado(double renda, double emprestimo, double parcelas) {
        double valorLiberado = renda * 10;
        double prestacaoLiberada = renda * 0.30;
        if (valorLiberado >= emprestimo && parcelas <= prestacaoLiberada) {
            return "Emprestimo Aprovado";
        } else {
            return "Emprestimo Negado";
        }
    }

    public String diasDaSemana(int dia) {
        if (dia == 1) {
            return "Domingo";
        }
        if (dia == 2) {
            return "Segunda";
        }
        if (dia == 3) {
            return "Terca";
        }
        if (dia == 4) {
            return "Quarta";
        }
        if (dia == 5) {
            return "Quinta";
        }
        if (dia == 6) {
            return "Sexta";
        }
        if (dia == 7) {
            return "Sabado";
        } else {
            return "Erro: Numero nao corresponde a um dia da semana";
        }
    }

    String classificado = "Passou em ";
    String desclassificado = "Mas nao passou em ";
    String nota, nota2, nota3, nota4, nota5;

    public String notaAluno(double I, double II, double III, double IV, double V) {
        if (I >= 70 && II >= 70 && III >= 70 && IV >= 70 && V >= 70) {
            return "A - Passou em todos os exames";
        } else if (I >= 70 && II >= 70 && III >= 70 && IV >= 70 && V <= 70) {
            return "C - Passou em I, II, III e IV, mas nao em V";
        } else if (I >= 70 && II >= 70 && III <= 70 && IV >= 70 && V <= 70) {
            return "B - Passou em I, II e IV, mas nao em III ou V";
        } else {
            return "Reprovado";
        }

//        if (I >= 70) {
//            classificado += " I, ";
//        } else {
//            desclassificado += " I, ";
//        }
//        if (II >= 70) {
//            classificado += " II, ";
//        } else {
//            desclassificado += " II, ";
//        }
//        if (III >= 70) {
//            classificado += " III, ";
//        } else {
//            desclassificado += " III, ";
//        }
//        if (IV >= 70) {
//            classificado += " IV, ";
//        } else {
//            desclassificado += " IV, ";
//        }
//        if (V >= 70) {
//            classificado += " V, ";
//        } else {
//            desclassificado += " V, ";
//        }
//        return ("" + classificado + desclassificado);

    }

    public String ciaPuverizacao(double tipo, int area) {

        if (tipo == 1) {
            tipo = tipo = 50.0;
        } else if (tipo == 2) {
            tipo = tipo = 100.0;
        } else if (tipo == 3){
            tipo = tipo = 150.0;
        }else if (tipo == 4){
            tipo = tipo = 250;
        }else if (tipo >= 5){
            return "Erro";
        }
        double valor = tipo * area;
        if (area >= 1000){
            double desconto1 = valor * 0.05;
            valor = valor - desconto1;
        }
        if (valor >= 750.0){
            double desconto2 = valor * 0.10;
            valor = valor - desconto2;
        }
        return ("" + valor);
    }

    public String anoBissexto(int ano){
        int centena = ano % 400;
        int unidade = ano % 10;
        int dezena = ano / 10;
        dezena = dezena % 10;
        dezena = dezena * 10;
        int resultado = dezena + unidade;
        resultado = resultado % 4;
        if (resultado == 0 || centena == 0){
            return "E bissexto";
        }else {
            return "Nao e bissexto";
        }

    }
}




