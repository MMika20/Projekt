package ProjektTaschenrechner;

import java.util.Scanner;

public class BefehleEinlesen {

    private Befehlswoerter befehle;  // hält die gültigen Befehlswörter
    private Scanner leser;         // Lieferant für eingegebene Befehle
    /**
     * Erzeuge einen Parser, der Befehle von der Konsole einliest.
     */
    public BefehleEinlesen()
    {
        befehle = new Befehlswoerter();
        leser = new Scanner(System.in);
    }

    /**
     * @return Den nächsten Befehl des Benutzers.
     */
    public Befehl liefereBefehl()
    {
        String eingabezeile;   // für die gesamte Eingabezeile
        String wort1 = null;

        System.out.print("\n> ");     // Eingabeaufforderung
        eingabezeile = leser.nextLine();

        // Finde bis zu zwei Wörter in der Zeile
        Scanner zerleger = new Scanner(eingabezeile);
        if(zerleger.hasNext()) {
            wort1 = zerleger.next();     // erstes Wort lesen
        }

        // Jetzt prüfen, ob der Befehl bekannt ist. Wenn ja, erzeugen
        // wir das passende Befehl-Objekt. Wenn nicht, erzeugen wir
        // einen unbekannten Befehl mit 'null'.
        return  new Befehl(wort1);
    }

    public String getAlleBefehle() {
        return befehle.getAlleGueltigenBefehl();
    }
}
