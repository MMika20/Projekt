package ProjektTaschenrechner;

import java.io.IOException;
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
        double minAbweichung = minAbwArray[0]; // Deklaration der minimalen Abweichung
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
        double geoLoesung = Math.pow(zahl, 1.0 / geoArray.length);   // Rechnung zahl^1/arraylänge

        return geoLoesung;   // Rückgabe der Lösung
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
        double modalwert = 0;                       // und des Modalwerts selbst
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
    /** ////////////////////////////////////////////////////////////////////////   1D Array **/
    public static int[] readArrayInteger() throws IOException {
        int[] zahlen;   //Deklaration
        System.out.println("Wie viele Zahlen sollen erfasst werden");   //Größe abfragen
        int groesse = Eingabe.readInteger();
        zahlen = readArrayInteger(groesse);     //Array Initialisieren
        return zahlen;
    }

    public static int[] readArrayInteger(int anzahl) throws IOException {
        int[] zahlen = new int[anzahl];     //Deklaration
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print("Bitte erfassen sie den Wert-" + (i + 1) + ": ");
            zahlen[i] = Eingabe.readInteger();
            System.out.println(" ");
        }
        return zahlen;
    }

    public static double[] readArrayDouble() throws IOException {
        double[] zahlen;    //Deklaration
        System.out.print("Wie viele Zahlen sollen erfasst werden?\n> ");   //Größe abfragen
        int groesse = Eingabe.readInteger();
        zahlen = readArrayDouble(groesse);  //Array Initialisieren
        return zahlen;
    }

    public static double[] readArrayDouble(int anzahl) throws IOException {
        System.out.println();
        double[] zahlen = new double[anzahl];   //Deklaration
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print("Bitte erfassen sie den Wert-" + (i + 1) + ": ");
            zahlen[i] = Eingabe.readDouble();
            System.out.print("");
        }
        return zahlen;
    }
}