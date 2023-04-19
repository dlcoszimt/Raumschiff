public class Ladung {
	private String bezeichnung;
	private int menge;

	public Ladung() {
	}

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

	@Override
	public String toString() {
		String tmp = getBezeichnung() + ": " + getMenge();
		return tmp;
	}

}