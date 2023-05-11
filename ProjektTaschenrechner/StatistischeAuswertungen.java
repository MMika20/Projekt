package ProjektTaschenrechner;

import java.util.Arrays;
import java.util.HashMap;

public class StatistischeAuswertungen {

    /** ////////////////////////////////////////////////////////////////////////   Maximum Ermitteln **/
    public static double ermittelMax(double[] MaxArray) {
        double max = 0;     // Deklaration des maximalen Wertes
        for (int i = 0; i < MaxArray.length; i++) { // Formelbedingung
            max = Math.max(max, MaxArray[i]);   // Rechnung
        }
        return max; // Rückgabe des maximalen Wertes
    }
    /** ////////////////////////////////////////////////////////////////////////   Minimum Ermitteln **/
    public static double ermittelMin(double[] MinArray) {
        double min = 0; // Deklaration des minimalen Wertes
        for (int i = 0; i < MinArray.length; i++) { // Formelbedingung
            min = Math.min(min, MinArray[i]);   // Rechnung
        }
        return min; // Rückgabe des minimalen Wertes
    }
    /** ////////////////////////////////////////////////////////////////////////   Spannweite **/
    public static double spannweite(double[] SpannweiteArray) {
        return ermittelMax(SpannweiteArray) - ermittelMin(SpannweiteArray); // Größte Zahl - die kleine Zahl
    }
    /** ////////////////////////////////////////////////////////////////////////   Maximale Abweichung **/
    public static double maximaleAbweichung(double[] maxAbwArray) {
        double maxAbweichung = 0.0; // Deklaration der maximalen Abweichung
        for (int i = 1; i < maxAbwArray.length; i++) {  // Formelbedingung
            double abweichung = Math.abs(maxAbwArray[i] - maxAbwArray[i-1]);    // Rechnung (Betrag)
            if (abweichung > maxAbweichung) {   // wenn abweichung größer als maximale Abweichung
                maxAbweichung = abweichung;     // maxAbweichung die neue abweichung
            }
        }
        return maxAbweichung;   // Rückgabe der maximalen Abweichung
    }
    /** ////////////////////////////////////////////////////////////////////////   Minimale Abweichung **/
    public static double minimaleAbweichung(double[] minAbwArray) {
        double minAbweichung = 0.0; // Deklaration der minimalen Abweichung
        for (int i = 1; i < minAbwArray.length; i++) {  // Formelbedingung
            double abweichung = Math.abs(minAbwArray[i] - minAbwArray[i-1]);    // Rechnung (Betrag)
            if (abweichung < minAbweichung) {   // wenn abweichung kleiner als maximale Abweichung
                minAbweichung = abweichung;     // dann minAbweichung die neue abweichung
            }
        }
        return minAbweichung;   // Rückgabe der minimalen Abweichung
    }
    /** ////////////////////////////////////////////////////////////////////////   Arithmetisches Mittel **/
    public static double arithMittel(double[] ArithArray){
        double arithM = 0;                                  // Deklarieren des Arithmetischen Mittel
        for (int i = 0; i < ArithArray.length; i++) {       // Schleifen-Funktion
            arithM += (ArithArray[i]) / ArithArray.length;  // Rechnung für das Arithemtische Mittel
        }
        return arithM;                                      // Rückgabe des Ergebniss
    }
    /** ////////////////////////////////////////////////////////////////////////   Geometrisches Mittel **/
    public static double geoMittel(double[] geoArray) {
        double zahl = 1.0;              // Deklaration + Initialisierung
        for (double wert : geoArray) {  // Durchlaufen der werte
            zahl *= wert;               // Multipliziert alle werte aus dem Array
        }
        double geoLösung = Math.pow(zahl, 1.0 / geoArray.length);   // Rechnung zahl^1/arraylänge

        return geoLösung;   // Rückgabe der Lösung
    }

    /** ////////////////////////////////////////////////////////////////////////   Median **/
    public static double median(double[] medianArray) {
        Arrays.sort(medianArray);                   // Sortiert den Array
        int mittelwert = medianArray.length / 2;    // Hälfte von Array
        if (medianArray.length % 2 == 0) {          // schaut ob gerade oder ungerade ist anhand von Modulo
            return (medianArray[mittelwert - 1] + medianArray[mittelwert]) / 2.0;   // falls ein gerader Array, zusammen rechnen und durch 2 teilen
        } else {
            return medianArray[mittelwert];         // ungerader Array Mittelwert
        }
    }
    /** ////////////////////////////////////////////////////////////////////////   Modalwert **/
    public static double modalwert(double[] modalwertArray) {
        HashMap<Double, Integer> werteZaehler = new HashMap<>();    // Erstellen der Hashmap
        int maxZahl = 0;                            // Initialisierung des maximalen Zähler
        double modalwert = Double.NaN;              // und des Modalwerts selbst
        for (double wert : modalwertArray) {        // Durchlaufen der Werte
            int zaehler = werteZaehler.getOrDefault(wert, 0) + 1;   // Erhöht den Wert um 1
            werteZaehler.put(wert, zaehler);                                  // in der HashMap

            if (zaehler > maxZahl) {  // Zähler größer als die maximale Anzahl
                maxZahl = zaehler;    // dann aktualisiert maxAnzahl die zahl von zaehler
                modalwert = wert;     // dann aktualisiert mode die zahl von wert
            }
        }
        return modalwert;             // Rückgabe des Modalwerts
    }
    /** ////////////////////////////////////////////////////////////////////////   Varianz **/
    public static double varianz(double[] VarianzArray){
        double var=0;   // Deklaration der Varianz
        for(int i = 0; i<VarianzArray.length;i++){  // Formelbedingung
            var+= Math.pow(VarianzArray[i]-arithMittel(VarianzArray),2);    // Rechnung
        }
        return var* VarianzArray.length;    // Rückgabe der Varianz * die länge des Arrays
    }
    /** ////////////////////////////////////////////////////////////////////////   Standardabweichung **/
    public static double standardAbweichung(double[] AbweichungArray){
        double stndrdAbwei;   // Deklaration der standard Abweichung
        stndrdAbwei= Math.sqrt(varianz(AbweichungArray)); // Rechnung
        return stndrdAbwei;   // Rückgabe der standard Abweichung
    }
}