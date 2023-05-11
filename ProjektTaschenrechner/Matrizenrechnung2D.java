package ProjektTaschenrechner;

public class Matrizenrechnung2D {
    /** ////////////////////////////////////////////////////////////////////////   2dMultiplikationMitEinerZahl **/
    public static double[][] multiplikationMitEinerZahl2D(double[][] array2d, double verdopplungsWert) {        //Übergebener array und verdopplungswert
        double[][] ergebnis = new double[array2d.length][array2d.length];       //Array "ergebnis" Deklarieren mit der länge vom übergebenen "Array2D"
        for (int z = 0; z < array2d.length; z++) {         //Schleife für das Horizontale durchlaufen des Arrays
            for (int s = 0; s < array2d.length; s++) {      //Innere Schleife durchläuft Vertikale Werte des Arrays
                ergebnis[z][s] = array2d[z][s] * verdopplungsWert;      //Werte mit position "Z" und "S" werden mit dem gewünschten Wert Multipliziert
            }
        }
        return ergebnis;        //Ergebnis wird zurückgegeben
    }

    /** ////////////////////////////////////////////////////////////////////////   2dAdditionZweierMatrizen **/
    public static double[][] additionZweierMatrizen2d(double[][] x, double[][] y) {         //Übergebene Arrays
        double[][] ergebnis = new double[x.length][x.length];          //Array "ergebnis" Deklarieren mit der länge vom übergebenen Array "X"
        for (int z = 0; z < x.length; z++) {            //Schleife für das Horizontale durchlaufen des Arrays
            for (int s = 0; s < x.length; s++) {        //Innere Schleife durchläuft Vertikale Werte des Arrays
                ergebnis[z][s] = x[z][s] + y[z][s];     //Werte für jede einzelne Posiion werden Addiert
            }
        }
        return ergebnis;        //Ergebnis wird zurückgegeben
    }

/** ////////////////////////////////////////////////////////////////////////   2dMultiplikationZweierMatrizen **/
    public static double[][] multiplikationZweierMatrizen2D(double[][] x, double[][] y) {       //Übergebene Arrays
        double[][] ergebnis = new double[x.length][x.length];       //Array "ergebnis" Deklarieren mit der länge vom übergebenen Array "X"

        for (int z = 0; z < x.length; z++) {            //Schleife für das Horizontale durchlaufen des Arrays
            for (int s = 0; s < x.length; s++) {        //Innere Schleife durchläuft Vertikale Werte des Arrays
                ergebnis[z][s] = x[z][s] * y[z][s];     //Werte für jede einzelne Posiion werden Multipliziert
            }
        }
        return ergebnis;        //Ergebnis wird zurückgegeben
    }
}

