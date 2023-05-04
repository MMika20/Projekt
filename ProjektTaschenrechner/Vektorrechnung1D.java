package ProjektTaschenrechner;

import java.io.IOException;

public class Vektorrechnung1D {

    /////////////////////////////////////////////////////////////////////////   MultiplikationMitEinerZahl
    public static double[] MultiplikationMitEinerZahl(double array1d[],double verdopplungsWert) throws IOException {
        double[] ergebnis = new double[array1d.length];
        for(int i=0;i<array1d.length;i++){
            ergebnis[i] = array1d[i]*verdopplungsWert;
        }
        return ergebnis;
    }
}
