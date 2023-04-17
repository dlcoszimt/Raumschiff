public class Artikel {
    private String bezeichnung;
    private int artikelNr;
    private double einkaufspreis;
    private double verkaufspreis;
    private int lagerBestand;
    private int sollBestand;
    
    
    public Artikel() {}

    public Artikel(String bezeichnung, int artikelNr, double einkaufspreis, double verkaufspreis, int lagerBestand, int sollBestand) {
        this.setBezeichnung(bezeichnung);
        this.setArtikelNr(artikelNr);
        this.setEinkaufspreis(einkaufspreis);
        this.setVerkaufspreis(verkaufspreis);
        this.setLagerBestand(lagerBestand);
        this.setSollBestand(sollBestand);
    }
    
    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getArtikelNr() {
        return artikelNr;
    }

    public void setArtikelNr(int artikelNr) {
        this.artikelNr = artikelNr;
    }

    public double getEinkaufspreis() {
        return einkaufspreis;
    }

    public void setEinkaufspreis(double einkaufspreis) {
        this.einkaufspreis = einkaufspreis;
    }

    public double getVerkaufspreis() {
        return verkaufspreis;
    }

    public void setVerkaufspreis(double verkaufspreis) {
        this.verkaufspreis = verkaufspreis;
    }

    public int getLagerBestand() {
        return lagerBestand;
    }

    public void setLagerBestand(int lagerBestand) {
        this.lagerBestand = lagerBestand;
    }

    public int getSollBestand() {
        return sollBestand;
    }

    public void setSollBestand(int sollBestand) {
        this.sollBestand = sollBestand;
    }
    
    public void bestellen() {
    	double prozent = (getLagerBestand() * 100 / getSollBestand());
    	if  (prozent <= 80.0) {
    		setLagerBestand(getSollBestand());
    	}
    }
    
    public double berechneMarge() {
        double marge = (verkaufspreis - einkaufspreis) * getLagerBestand();
        return marge;
    }
}