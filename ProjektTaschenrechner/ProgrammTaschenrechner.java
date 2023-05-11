package ProjektTaschenrechner;

import java.sql.Array;

public class ProgrammTaschenrechner {
    public static void main(String[] args) {

        int [] testArray = new int[6];
        testArray[0] = 1;
        testArray[1] = 2;
        testArray[2] = 3;
        testArray[3] = 4;
        testArray[4] = 5;
        testArray[5] = 6;

        double [] testArray2 = new double[6];
        testArray2[0] = 1;
        testArray2[1] = 2;
        testArray2[2] = 3;
        testArray2[3] = 4;
        testArray2[4] = 5;
        testArray2[5] = 6;

        System.out.println("Maximum: " +StatistischeAuswertungen.ermittelMax(testArray2));
        System.out.println("Minimum: " +StatistischeAuswertungen.ermittelMin(testArray2));
        System.out.println("Spannweite: "+StatistischeAuswertungen.spannweite(testArray2));
        System.out.println("Max Abweichung: "+StatistischeAuswertungen.maximaleAbweichung(testArray2));
        System.out.println("Min Abweichung: "+StatistischeAuswertungen.minimaleAbweichung(testArray2));
        System.out.println("Durchschnitt: "+StatistischeAuswertungen.arithMittel(testArray2));
        System.out.println("Geometrisches Mittel: "+StatistischeAuswertungen.geoMittel(testArray2));
        System.out.println("Median: "+StatistischeAuswertungen.median(testArray2));
        System.out.println("Modalwert: "+StatistischeAuswertungen.modalwert(testArray2));
        System.out.println("Varianz: "+StatistischeAuswertungen.varianz(testArray2));
        System.out.println("Standardabweichung: "+StatistischeAuswertungen.standardAbweichung(testArray2));

    }

}
