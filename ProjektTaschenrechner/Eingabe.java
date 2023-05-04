package ProjektTaschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eingabe {
    public static String readString() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();
        return text;
    }

    public static int readInteger() throws IOException {
        /**
         * Schleife fragt ab, ob beim "try" fehler auftreten. Wenn welche auftreten, dann werden
         * sie aufgefangen(catch) und man muss den Wert neu eingeben.
         */
        while (true) {
            try { //IO.readString ist ein String also eine Eingabe und wird in einen int Wert umgewandelt und in x gepackt
                int x = Integer.parseInt(Eingabe.readString().trim().replace(',', '.'));
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Keine Ganzzahl! Bite erneut versuchen: ");
            }
        }
    }

    public static double readDouble() throws IOException {
        while (true) {
            try {
                double x = Double.parseDouble(Eingabe.readString().trim().replace(',', '.'));
                return x;
            } catch (NumberFormatException e) {
                System.out.println("Keine Doublezahl! Bite erneut versuchen: ");
            }
        }
    }

    /**
     * Liest den Wahrheitswert von der Konsole ein
     *
     * @return den Warheitswert
     * @throws IOException
     */
    public static boolean readBoolean() throws IOException {
        while (true) {
            String x = readString();
            /**
             * !x = nicht gleich/ungleich
             * null = NICHTS
             */
            if (x != null) {
                if ((x.equalsIgnoreCase("Ja"))
                        || (x.equalsIgnoreCase("j"))
                        || (x.equalsIgnoreCase("Yes"))
                        || (x.equalsIgnoreCase("y"))) {
                    return true;
                } else if ((x.equalsIgnoreCase("Nein"))
                        || (x.equalsIgnoreCase("n"))
                        || (x.equalsIgnoreCase("No"))) {
                    return false;
                }
            }
            System.out.println("Ungültige eingabe! Bitte erneut versuchen.");
        }
    }

}
