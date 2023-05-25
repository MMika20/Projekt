package ProjektTaschenrechner;

import java.io.IOException;

public class Menu {

    private BefehleEinlesen befehleEinlesen= new BefehleEinlesen(); //damit befehl nicht = null ist Z.91

    private void willkommensText() {
        System.out.println("Willkommen bei unserem Taschenrechner!");
        System.out.println("Erklärtext");
        System.out.println("Tippen sie help, wenn sie Hilfe brauchen");
        System.out.println(menuAuswahl());
    }

    public String menuAuswahl() {
        String text;
        text= "\n[1] Wachstums- bzw. Zerfallsprozesse";
        text+="\n[2] Lösung quadratischer Gleichungen";
        text+="\n[3] Statistische Auswertungen";
        text+="\n[4] Vektorrechnung";
        text+="\n[5] Matrizenrechnung";
        return text;
    }

    private boolean verarbeiteBefehl(Befehl befehl) throws IOException {
        boolean moechteBeenden = false;
        if (befehl.istUnbekannt()) {
            System.out.println("Ich weiß nicht, was Sie meinen...");
            return false;
        }
        String befehlswort = befehl.gibBefehlswort();
        if (befehlswort.equals("help")) {
            hilfstextAusgeben();
        } else if (befehlswort.equals("quit")) {
            moechteBeenden = beenden(befehl);
        } else if (befehlswort.equals("1")) {
            System.out.println("Wachstumsprozess");
            System.out.println("Zerfallsprozess");
        } else if (befehlswort.equals("2")) {
            System.out.println("Quadratische Gleichungen");
        } else if (befehlswort.equals("3")) {
            berechnungStat();
        } else if (befehlswort.equals("4")) {
            System.out.println("Multiplikation mit einer Zahl");
            System.out.println("Addition zweier Vektoren");
            System.out.println("Multiplikation zweier Vektoren");
        } else if (befehlswort.equals("5")) {
            System.out.println("Multiplikation mit einer Zahl");
            System.out.println("Addition zweier Vektoren");
            System.out.println("Multiplikation zweier Vektoren");
        }
        return moechteBeenden;
    }

    public void berechnungStat() throws IOException {
        System.out.println("Statistische Auswertungen");
        double[] statArr = StatistischeAuswertungen.readArrayDouble();

        System.out.println("Maximum: " +StatistischeAuswertungen.ermittelMax(statArr));
        System.out.println("Minimum: " +StatistischeAuswertungen.ermittelMin(statArr));
        System.out.println("Spannweite: "+StatistischeAuswertungen.spannweite(statArr));
        System.out.println("Max Abweichung: "+StatistischeAuswertungen.maximaleAbweichung(statArr));
        System.out.println("Min Abweichung: "+StatistischeAuswertungen.minimaleAbweichung(statArr));
        System.out.println("Durchschnitt: "+StatistischeAuswertungen.arithMittel(statArr));
        System.out.println("Geometrisches Mittel: "+StatistischeAuswertungen.geoMittel(statArr));
        System.out.println("Median: "+StatistischeAuswertungen.median(statArr));
        System.out.println("Modalwert: "+StatistischeAuswertungen.modalwert(statArr));
        System.out.println("Varianz: "+StatistischeAuswertungen.varianz(statArr));
        System.out.println("Standardabweichung: "+StatistischeAuswertungen.standardAbweichung(statArr));

    }










    public void rechnen() throws IOException {
        willkommensText();

        // Die Hauptschleife. Hier lesen wir wiederholt Befehle ein
        // und führen sie aus, bis das Spiel beendet wird.

        boolean beendet = false;
        while (!beendet) {
            Befehl befehl = befehleEinlesen.liefereBefehl();
            beendet = verarbeiteBefehl(befehl);
        }
        System.out.println("Danke für dieses Spiel! Auf Wiedersehen!");
    }

    private boolean beenden(Befehl befehl) {
       return true;
    }


    private void hilfstextAusgeben() {
        System.out.println(befehleEinlesen.getAlleBefehle());
    }
}
