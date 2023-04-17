import java.util.ArrayList;
import java.util.List;

public class Raumschiff {
	private int photonentorpedoAnzahl;
	private int energieversorgungInProzent;
	private int schildeInProzent;
	private int lebenserhaltungssystemInProzent;
	private int androidenAnzahl;
	private int maximaleLadungsMenge;
	private String schiffsname;
	private List<String> broadcastKommunikation = new ArrayList<String>();
	private List<Ladung> ladungsverzeichnis = new ArrayList<Ladung>();

	public Raumschiff() {
	};

	public Raumschiff(int photonentorpedoAnzahl, int energieversorgungInProzent, int schildeInProzent,
			int lebenserhaltungssystemInProzent, int androidenAnzahl, String schiffsname) {
		this.setAndroidenAnzahl(androidenAnzahl);
		this.setEnergieversorgungInProzent(energieversorgungInProzent);
		this.setLebenserhaltungssystemInProzent(lebenserhaltungssystemInProzent);
		this.setPhotonentorpedoAnzahl(photonentorpedoAnzahl);
		this.setSchiffsname(schiffsname);
		this.setSchildeInProzent(schildeInProzent);
	}

	public int getPhotonentorpedoAnzahl() {
		return photonentorpedoAnzahl;
	}

	public void setPhotonentorpedoAnzahl(int photonentorpedoAnzahl) {
		this.photonentorpedoAnzahl = photonentorpedoAnzahl;
	}

	public int getEnergieversorgungInProzent() {
		return energieversorgungInProzent;
	}

	public void setEnergieversorgungInProzent(int energieversorgungInProzent) {
		this.energieversorgungInProzent = energieversorgungInProzent;
	}

	public int getSchildeInProzent() {
		return schildeInProzent;
	}

	public void setSchildeInProzent(int schildeInProzent) {
		this.schildeInProzent = schildeInProzent;
	}

	public int getLebenserhaltungssystemInProzent() {
		return lebenserhaltungssystemInProzent;
	}

	public void setLebenserhaltungssystemInProzent(int lebenserhaltungssystemInProzent) {
		this.lebenserhaltungssystemInProzent = lebenserhaltungssystemInProzent;
	}

	public int getAndroidenAnzahl() {
		return androidenAnzahl;
	}

	public void setAndroidenAnzahl(int androidenAnzahl) {
		this.androidenAnzahl = androidenAnzahl;
	}

	public String getSchiffsname() {
		return schiffsname;
	}

	public void setSchiffsname(String schiffsname) {
		this.schiffsname = schiffsname;
	}

	public int getMaximaleLadungsMenge() {
		return maximaleLadungsMenge;
	}

	public void setMaximaleLadungsMenge(int maximaleLadungsMenge) {
		this.maximaleLadungsMenge = maximaleLadungsMenge;
	}

	public List<String> getBroadcastKommunikation() {
		return broadcastKommunikation;
	}

	public void setBroadcastKommunikation(ArrayList<String> broadcastKommunikation) {
		this.broadcastKommunikation = broadcastKommunikation;
	}

	public List<Ladung> getLadungsverzeichnis() {
		return ladungsverzeichnis;
	}

	public void addLadungsverzeichnis(String ladungsbezeichnung, int ladungsmenge) {
//		Ladung tmp = new Ladung(ladungsbezeichnung, ladungsmenge);
		this.ladungsverzeichnis.add(new Ladung(ladungsbezeichnung, ladungsmenge));
	}

	
}