
public class Transportgut extends Ladung {

	private float laenge;
	private float breite;
	private float hoehe;

	public Transportgut() {
	}

	public Transportgut(String bezeichnung, int menge, float hoehe, float breite, float laenge) {
		super(bezeichnung, menge);
		this.setHoehe(hoehe);
		this.setBreite(breite);
		this.setLaenge(laenge);
	}

	public float getHoehe() {
		return hoehe;
	}

	public void setHoehe(float hoehe) {
		this.hoehe = hoehe;
	}

	public float getBreite() {
		return breite;
	}

	public void setBreite(float breite) {
		this.breite = breite;
	}

	public float getLaenge() {
		return laenge;
	}

	public void setLaenge(float laenge) {
		this.laenge = laenge;
	}

	@Override
	public String toString() {
		return "Transportgut (" + "bezeichnung=\"" + this.bezeichnung + '\"' + ", menge=" + this.menge + ", laenge="
				+ this.laenge + ", breite=" + this.breite + ", hoehe=" + this.hoehe + ')';
	}

}
