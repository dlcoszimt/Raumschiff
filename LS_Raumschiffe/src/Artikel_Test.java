// 2023.04.17

public class Artikel_Test {
	public static void main(String[] args) {
		Artikel fisch = new Artikel("Fischies", 581, 7.21, 12.45, 50, 80);
		Artikel reis = new Artikel("Himalayareis", 12, 1.41, 1.78, 90, 100);
		String Ausgabe = "Name: %s%nArtikel Nr: %d%nEinkaufsprreis: %.2f Euro%nVerkaufsprreis: %.2f Euro%nIstbestand: %d%nSollbestand: %d%nGewinn Marge: %.2f%n%n";
		System.out.printf(Ausgabe, fisch.getBezeichnung(), fisch.getArtikelNr(), fisch.getEinkaufspreis(),
				fisch.getVerkaufspreis(), fisch.getLagerBestand(), fisch.getSollBestand(), fisch.berechneMarge());
		fisch.bestellen();
		fisch.setBezeichnung("Frische Fische");
		System.out.printf(Ausgabe, fisch.getBezeichnung(), fisch.getArtikelNr(), fisch.getEinkaufspreis(),
				fisch.getVerkaufspreis(), fisch.getLagerBestand(), fisch.getSollBestand(), fisch.berechneMarge());
		fisch.bestellen();

		System.out.printf(Ausgabe, reis.getBezeichnung(), reis.getArtikelNr(), reis.getEinkaufspreis(),
				reis.getVerkaufspreis(), reis.getLagerBestand(), reis.getSollBestand(), reis.berechneMarge());
		reis.bestellen();
	}
}