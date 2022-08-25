package jobyDesafiosIFBA;

public class FutebolAmericano {

    public static void main(String[] args) {

    }

    double passesTentadosGeral, passes, jardas, touch, inter, resultado;


    public double passesCompletados(double passesCompletados, double jardasPassadas, double touchdowsPontos,double passesInterceptados, double passesTentados) {
        passes = passesCompletados / passesTentados;
        passes = passes - 0.3;
        passes = passes / 0.2;
        if (passes > 2.375) {
            passes = 2.375;
        }
        if (passes < 0) {
            passes = 0;
        }
        double passesTotal = passes;
        passesTentadosGeral = passesTentados;


        jardas = jardasPassadas / passesTentadosGeral;
        jardas = jardas - 3;
        jardas = jardas / 4;
        if (jardas > 2.375) {
            jardas = 2.375;
        }
        if (jardas < 0) {
            jardas = 0;
        }
        double jardasTotal = jardas;


        touch = touchdowsPontos / passesTentadosGeral;
        touch = touch / 4;
        if (touch > 2.375) {
            touch = 2.375;
        }
        if (touch < 0) {
            touch = 0;
        }
        double touchTotal = touch;


        inter = passesInterceptados / passesTentadosGeral;
        inter = inter - 0.095;
        inter = inter / 0.04;
        if (inter > 2.375) {
            inter = 2.375;
        }
        if (inter < 0) {
            inter = 0;
        }
        double interTotal = inter;

        resultado = passesTotal + jardasTotal + touchTotal + interTotal;
        resultado = resultado * 100;
        resultado = resultado / 6;

        return Utilitario.arredondaNumero(resultado);

    }


}
