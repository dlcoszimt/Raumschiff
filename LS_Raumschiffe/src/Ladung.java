public abstract class Ladung {
	protected String bezeichnung;
	protected int menge;

	/**
	 * Zur Initialisierung der Ladung
	 */

	public Ladung() {
	}

	/**
	 * Zur sofortigen deklaration der Ladung
	 * 
	 * @param bezeichnung
	 * @param menge
	 */

	public Ladung(String bezeichnung, int menge) {
		this.setBezeichnung(bezeichnung);
		this.setMenge(menge);
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public int getMenge() {
		return menge;
	}

	public void setMenge(int menge) {
		this.menge = menge;
	}

	/**
	 * Gibt die Ladung mit Bezeichnung und Menge wieder
	 * 
	 */
	@Override
	public abstract String toString();

//	@Override
//	public  String toString() {
//		String tmp = getBezeichnung() + ": " + getMenge();
//		return tmp;
//	}

}