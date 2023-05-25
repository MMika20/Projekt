package ProjektTaschenrechner;

public class Befehlswoerter {

    // ein konstantes Array mit den gültigen Befehlswörtern

    private static final String[] gueltigeBefehle = {
            "help", "1", "2", "3", "4", "5"
    };

    public boolean istBefehl(String eingabe)
    {
        for(int i = 0; i < gueltigeBefehle.length; i++) {
            if(gueltigeBefehle[i].equals(eingabe))
                return true;
        }
        // Wenn wir hierher gelangen, wurde die Eingabe nicht
        // in den Befehlswörter gefunden.
        return false;
    }

    public String getAlleGueltigenBefehl() {
        String alleBefehle = "";
        for(int i = 0; i< gueltigeBefehle.length; i++) {
            alleBefehle += gueltigeBefehle[i] + " ";
        }
        return alleBefehle;
    }
}
