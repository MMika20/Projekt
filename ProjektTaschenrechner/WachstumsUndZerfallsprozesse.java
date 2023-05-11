package ProjektTaschenrechner;

public class WachstumsUndZerfallsprozesse {
    /** ////////////////////////////////////////////////////////////////////////    Wachstum **/
    public static double Wachstum(double wert, double wachstumsRate, double zeit){
        return wert * Math.exp(wachstumsRate * zeit);
    }


    /** ////////////////////////////////////////////////////////////////////////    Zerfall **/
    public static double Zerfall(double wert, double zerfallsRate, double zeit){
        return wert * Math.exp(-zerfallsRate * zeit);
    }
}
