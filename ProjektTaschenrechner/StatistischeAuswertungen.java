package ProjektTaschenrechner;

public class StatistischeAuswertungen {


    public static double arithMittel(double[] ArithArray){
        double arithM = 0;
        for (int i = 0; i < ArithArray.length; i++) {
            arithM += (ArithArray[i]) / ArithArray.length;
        }
        return arithM;
    }
    /////////////////////////////////////////////////////////////////////////
    public static double ermittelMax(double[] MaxArray) {
        double max = 0;
        for (int i = 0; i < MaxArray.length; i++) {
            max = Math.max(max, MaxArray[i]);
        }
        return max;
    }
    /////////////////////////////////////////////////////////////////////////
    public static double ermittelMin(double[] MinArray) {
        double min = 0;
        for (int i = 0; i < MinArray.length; i++) {
            min = Math.min(min, MinArray[i]);
        }
        return min;
    }
    /////////////////////////////////////////////////////////////////////////
    public static double varianz(double[] VarianzArray){
        double var=0;
        for(int i = 0; i<VarianzArray.length;i++){
            var+= Math.pow(VarianzArray[i]-arithMittel(VarianzArray),2);
        }
        return var* VarianzArray.length;
    }
    /////////////////////////////////////////////////////////////////////////
    public static double standardAbweichung(double[] AbweichungArray){
        double s;
        s= Math.sqrt(varianz(AbweichungArray));
        return s;
    }





}
