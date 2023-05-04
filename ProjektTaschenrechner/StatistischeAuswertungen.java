package ProjektTaschenrechner;

import java.util.Arrays;

public class StatistischeAuswertungen {


    /////////////////////////////////////////////////////////////////////////   Maximum Ermitteln
    public static double ermittelMax(double[] MaxArray) {
        double max = 0;
        for (int i = 0; i < MaxArray.length; i++) {
            max = Math.max(max, MaxArray[i]);
        }
        return max;
    }
    /////////////////////////////////////////////////////////////////////////   Minimum Ermitteln
    public static double ermittelMin(double[] MinArray) {
        double min = 0;
        for (int i = 0; i < MinArray.length; i++) {
            min = Math.min(min, MinArray[i]);
        }
        return min;
    }
    /////////////////////////////////////////////////////////////////////////   Spannweite
    public static double spannweite(double[] SpannweiteArray) {
        return ermittelMax(SpannweiteArray) - ermittelMin(SpannweiteArray);
    }
    /////////////////////////////////////////////////////////////////////////   Maximale Abweichung
    public static double maximaleAbweichung(double[] maxAbwArray) {
        double maxAbweichung = 0.0;
        for (int i = 1; i < maxAbwArray.length; i++) {
            double abweichung = Math.abs(maxAbwArray[i] - maxAbwArray[i-1]);
            if (abweichung > maxAbweichung) {
                maxAbweichung = abweichung;
            }
        }
        return maxAbweichung;
    }
    /////////////////////////////////////////////////////////////////////////   Minimale Abweichung
    public static double minimaleAbweichung(double[] minAbwArray) {
        double minAbweichung = 0.0;
        for (int i = 1; i < minAbwArray.length; i++) {
            double abweichung = Math.abs(minAbwArray[i] - minAbwArray[i-1]);
            if (abweichung < minAbweichung) {
                minAbweichung = abweichung;
            }
        }
        return minAbweichung;
    }
    /////////////////////////////////////////////////////////////////////////   Arithmetisches Mittel
    public static double arithMittel(double[] ArithArray){
        double arithM = 0;
        for (int i = 0; i < ArithArray.length; i++) {
            arithM += (ArithArray[i]) / ArithArray.length;
        }
        return arithM;
    }
    /////////////////////////////////////////////////////////////////////////   Geometrisches Mittel

    /////////////////////////////////////////////////////////////////////////   Median
    public static double median(double[] medianArray) {
        Arrays.sort(medianArray);                   // Sortiert den Array
        int mittelwert = medianArray.length / 2;    // Hälfte von Array
        if (medianArray.length % 2 == 0) {          // schaut ob gerade oder ungerade ist anhand von Modulo
            return (medianArray[mittelwert - 1] + medianArray[mittelwert]) / 2.0;   // falls ein gerader Array, zusammen rechnen und durch 2 teilen
        } else {
            return medianArray[mittelwert];         // ungerader Array Mittelwert
        }
    }
    /////////////////////////////////////////////////////////////////////////   Modalwert
    static int modal(int[] modalArray) {
        int count = 1;
        int x = 0;
        int mod = 0;
        for (int j = 1; j < modalArray.length; j++) {
            count=0;
            for (int i = 1; i < modalArray.length; i++) {
                if (modalArray[x] == modalArray[i]) {
                    count += 1;
                    System.out.println(count);
                }
                if (mod < count) {
                    mod = count;
                }
            }
            modalArray[x] = modalArray[x + 1];
        }
        return mod;
    }
    /////////////////////////////////////////////////////////////////////////   Varianz
    public static double varianz(double[] VarianzArray){
        double var=0;
        for(int i = 0; i<VarianzArray.length;i++){
            var+= Math.pow(VarianzArray[i]-arithMittel(VarianzArray),2);
        }
        return var* VarianzArray.length;
    }
    /////////////////////////////////////////////////////////////////////////   Standardabweichung
    public static double standardAbweichung(double[] AbweichungArray){
        double s;
        s= Math.sqrt(varianz(AbweichungArray));
        return s;
    }
    /////////////////////////////////////////////////////////////////////////


}
