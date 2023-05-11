package ProjektTaschenrechner;

public class Vektorrechnung1D {

    /** ////////////////////////////////////////////////////////////////////////   1dMultiplikationMitEinerZahl **/
    public static double[] multiplikationMitEinerZahl1D(double[] array1d, double verdopplungsWert) {
        double[] ergebnis = new double[array1d.length];

        for (int i = 0; i < array1d.length; i++) {
            ergebnis[i] = array1d[i] * verdopplungsWert;
        }
        return ergebnis;
    }

    /** ////////////////////////////////////////////////////////////////////////   1dAdditionZweierVektoren **/
    public static double[] additionZweierVektoren1D(double[] x, double[] y) {
        double[] ergebnis = new double[x.length];

        for (int i = 0; i < x.length; i++) {     // Elemet i von Array x und Element i von Array y addieren und in Array z an der Stelle i speichern
            ergebnis[i] = x[i] + y[i];
        }
        return ergebnis;
    }

    /** ////////////////////////////////////////////////////////////////////////   1dMultiplikationZweierVektoren **/
    public static double[] multiplikationZweierVektoren1D(double[] x, double[] y) {
        double[] ergebnis = new double[x.length];

        for (int i = 0; i < x.length; i++) {     // Elemet i von Array x und Element i von Array y Multiplizieren und in Array z an der Stelle i speichern
            ergebnis[i] = x[i] * y[i];
        }
        return ergebnis;
    }
}
