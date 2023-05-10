
public class Gast extends Ladung {

	private String heimatplanet;
	private String sprache;
	private Verpflegung verpflegung;

	public Gast() {
	}

	public Gast(String bezeichnung, int menge, String heimatplanet, String sprache, Verpflegung verpflegung) {
		super(bezeichnung, menge);
		this.setHeimatplanet(heimatplanet);
		this.setSprache(sprache);
		this.setVerpflegung(verpflegung);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Gast";
	}

	public String getSprache() {
		return sprache;
	}

	public void setSprache(String sprache) {
		this.sprache = sprache;
	}

	public String getHeimatplanet() {
		return heimatplanet;
	}

	public void setHeimatplanet(String heimatplanet) {
		this.heimatplanet = heimatplanet;
	}

	public Verpflegung getVerpflegung() {
		return verpflegung;
	}

	public void setVerpflegung(Verpflegung verpflegung) {
		this.verpflegung = verpflegung;
	}
}