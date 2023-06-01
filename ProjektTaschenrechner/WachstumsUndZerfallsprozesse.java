package ProjektTaschenrechner;

import java.io.IOException;

public class WachstumsUndZerfallsprozesse {
    /** ////////////////////////////////////////////////////////////////////////    Wachstum **/
    public static double Wachstum(double wert, double wachstumsRate, double zeit){
        return wert * Math.exp(wachstumsRate * zeit);
    }


    /** ////////////////////////////////////////////////////////////////////////    Zerfall **/
    public static double Zerfall(double wert, double zerfallsRate, double zeit){
        return wert * Math.exp(-zerfallsRate * zeit);
    }

    /** ////////////////////////////////////////////////////////////////////////    Rechnung **/
    public static double wachsWert() throws IOException {
        System.out.println();
        System.out.print("Geben sie ihren Standardwert ein: ");
        while (true) {
            try {
                double x = Double.parseDouble(Eingabe.readString().trim().replace(",", "."));
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Keine Dezimalzahl! Bitte erneut versuchen: ");
            }
        }
    }

    public static double wachsRate() throws IOException {
        System.out.print("Geben sie nun ihren Wachstumswert ein: ");
        while (true) {
            try {
                double x = Double.parseDouble(Eingabe.readString().trim().replace(",", "."));
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Keine Dezimalzahl! Bitte erneut versuchen: ");
            }
        }
    }

    public static double zeitraum() throws IOException {
        System.out.print("Geben sie nun den Zeitraum ein: ");
        while (true) {
            try {
                double x = Double.parseDouble(Eingabe.readString().trim().replace(",", "."));
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Keine Dezimalzahl! Bitte erneut versuchen: ");
            }
        }
    }
}
