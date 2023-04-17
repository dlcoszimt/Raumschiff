public class Raumschiff {
	private int photonentorpedoAnzahl;
	private int energieversorgungInProzent;
	private int schildeInProzent;
	private int lebenserhaltungssystemInProzent;
	private int androidenAnzahl;
	private String schiffsname;
	private String[] broadcastKommunikation;
	private Ladung[] ladungsverzeichnis;
	
	public Raumschiff() {};
	
	public Raumschiff(int photonentorpedoAnzahl, int energieversorgungInProzent, int schildeInProzent, int lebenserhaltungssystemInProzent, int androidenAnzahl, String schiffsname, String[] broadcastKommunikation) {
		
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

	public String[] getBroadcastKommunikation() {
		return broadcastKommunikation;
	}

	public void setBroadcastKommunikation(String[] broadcastKommunikation) {
		this.broadcastKommunikation = broadcastKommunikation;
	}

	public Ladung[] getLadungsverzeichnis() {
		return ladungsverzeichnis;
	}

	public void setLadungsverzeichnis(Ladung[] ladungsverzeichnis) {
		this.ladungsverzeichnis = ladungsverzeichnis;
	}

	
}