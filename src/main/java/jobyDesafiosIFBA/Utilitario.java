package jobyDesafiosIFBA;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utilitario {

    public static final int NEW_SCALE = 1;
    public static final int NEW_SCALE2 = 2;
    public static final int NEW_SCALE3 = 3;
    public static final int NEW_SCALE1 = 1;
    public static final int NEW_SCALE5 = 5;

    public static double arredondaDia(double numero) {
        return new BigDecimal(numero).setScale(NEW_SCALE, RoundingMode.HALF_UP).doubleValue();
    }
    public static double arredondaNumero(double numero) {
        return new BigDecimal(numero).setScale(NEW_SCALE2, RoundingMode.HALF_UP).doubleValue();
    }

    public static int arredonda1Numeros(int numero){
        return new BigDecimal(numero).setScale(NEW_SCALE1, RoundingMode.HALF_UP).intValue();
    }

    public static double arredonda3Casas(double numero) {
        return new BigDecimal(numero).setScale(NEW_SCALE3, RoundingMode.HALF_UP).doubleValue();
    }


    public static double arredondaTempo(double numero) {
        return new BigDecimal(numero).setScale(NEW_SCALE5, RoundingMode.HALF_UP).doubleValue();
    }

}
