import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Raumschiff {
	private int photonentorpedoAnzahl;
	private int energieversorgungInProzent;
	private int schildeInProzent;
	private int huelleInProzent;
	private int lebenserhaltungssystemInProzent;
	private int androidenAnzahl;
	private int maximaleLadungsMenge;
	private String schiffsname;
	private List<String> broadcastKommunikation = new ArrayList<String>();
	private List<Ladung> ladungsverzeichnis = new ArrayList<Ladung>();
	private List<String> logBuch = new ArrayList<String>();

	public Raumschiff() {
	};

	public Raumschiff(String schiffsname, int lebenserhaltungssystemInProzent, int energieversorgungInProzent,
			int huelleInProzent, int schildeInProzent, int photonentorpedoAnzahl, int androidenAnzahl) {
		this.setAndroidenAnzahl(androidenAnzahl);
		this.setEnergieversorgungInProzent(energieversorgungInProzent);
		this.setLebenserhaltungssystemInProzent(lebenserhaltungssystemInProzent);
		this.setPhotonentorpedoAnzahl(photonentorpedoAnzahl);
		this.setSchiffsname(schiffsname);
		this.setSchildeInProzent(schildeInProzent);
		this.setHuelleInProzent(huelleInProzent);
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

	public void addBroadcastKommunikation(String message) {
		this.broadcastKommunikation.add(message);
	}

	public void ladungsverzeichnisAusgeben() {
		for (int i = 0; i < ladungsverzeichnis.size(); i++) {
			System.out.println(ladungsverzeichnis.get(i));
		}
	}

	public void addLadungsverzeichnis(String ladungsbezeichnung, int ladungsmenge) {
		this.ladungsverzeichnis.add(new Ladung(ladungsbezeichnung, ladungsmenge));
	}

	public void zustandRaumschiff() {
		String tmp = "Schiffsname: %s%nSchild bei: %d%%%nHülle bei: %d%%%nEnergieversorgung bei: %d%%%nlebenserhaltungssystem bei: %d%%%n";
		System.out.printf(tmp, this.getSchiffsname(), this.getSchildeInProzent(), this.getHuelleInProzent(),
				this.getEnergieversorgungInProzent(), this.getLebenserhaltungssystemInProzent());
	}

	public int getHuelleInProzent() {
		return huelleInProzent;
	}

	public void setHuelleInProzent(int huelleInProzent) {
		this.huelleInProzent = huelleInProzent;
	}

	@SuppressWarnings("unused")
	public boolean existiertRaumschiff(Raumschiff zielRaumschiff) {
		if (true) {
			return true;
		} else {
			return false;
		}
	}

	public void treffer() {
		int rand = new Random().nextInt(10);
		if (rand % 2 == 1) {
			System.out.println(this.getSchiffsname() + " wurde getroffen!");
			this.trefferschaden();
		}
	}

	private void trefferschaden() {
		this.setSchildeInProzent(this.getSchildeInProzent() - 50);
		if (this.getSchildeInProzent() <= 0) {
			this.setHuelleInProzent(this.getHuelleInProzent() - 50);
			if (this.getHuelleInProzent() <= 0) {
				this.setEnergieversorgungInProzent(0);
			} else {
				this.setEnergieversorgungInProzent(this.getEnergieversorgungInProzent() - 50);
				System.out.println(this.getSchiffsname() + ": Lebenserhaltungssysteme wurden vernichtet!");
			}
		}
	}

	public void photonentorpedoSchiessen(Raumschiff zielRaumschiff) {
		if (this.existiertRaumschiff(zielRaumschiff)) {
			if (this.getPhotonentorpedoAnzahl() > 0) {
				this.setPhotonentorpedoAnzahl(this.getPhotonentorpedoAnzahl() - 1);
				zielRaumschiff.treffer();
			} else {
				System.out.println("-=*Click*=-");
				this.addLogBuch("Keine Photonentorpedos mehr");
			}
		}
	}

	public void phaserkanoneSchiessen() {
		if (this.getEnergieversorgungInProzent() < 50) {
			System.out.println("-=*Click*=-");
		} else {
			this.setEnergieversorgungInProzent(this.getEnergieversorgungInProzent() - 50);
			System.out.println("Phaserkanone abgeschossen");
		}
	}

	public List<String> getLogBuch() {
		return logBuch;
	}

	public void addLogBuch(String Eintrag) {
		this.logBuch.add(Eintrag);
	}

}