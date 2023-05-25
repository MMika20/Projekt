package ProjektTaschenrechner;

public class Befehl {

    private String befehlswort;

    public Befehl(String erstesWort){
        befehlswort = erstesWort;
    }

    public String gibBefehlswort() {
        return befehlswort;
    }

    public boolean istUnbekannt() {
        return (befehlswort == null);
    }
}
