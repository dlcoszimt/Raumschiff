import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.*;

public class Raumschiff {
	private int photonentorpedoAnzahl;
	private int energieversorgungInProzent;
	private int schildeInProzent;
	private int huelleInProzent;
	private int lebenserhaltungssystemInProzent;
	private int androidenAnzahl;
	private String schiffsname;
	private static List<String> broadcastKommunikation = new ArrayList<String>();
	private List<Ladung> ladungsverzeichnis = new ArrayList<Ladung>();

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
		if (energieversorgungInProzent > 100) {
			this.energieversorgungInProzent = 100;
		} else {
			this.energieversorgungInProzent = energieversorgungInProzent;
		}
	}

	public int getSchildeInProzent() {
		return schildeInProzent;
	}

	public void setSchildeInProzent(int schildeInProzent) {
		if (schildeInProzent > 100) {
			this.schildeInProzent = 100;
		} else {
			this.schildeInProzent = schildeInProzent;
		}
	}

	public int getLebenserhaltungssystemInProzent() {
		return lebenserhaltungssystemInProzent;
	}

	public void setLebenserhaltungssystemInProzent(int lebenserhaltungssystemInProzent) {
		if (lebenserhaltungssystemInProzent > 100) {
			this.lebenserhaltungssystemInProzent = 100;
		} else {
			this.lebenserhaltungssystemInProzent = lebenserhaltungssystemInProzent;
		}
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

	public List<String> getBroadcastKommunikation() {
		return broadcastKommunikation;
	}

	public void addBroadcastKommunikation(String message) {
		Raumschiff.broadcastKommunikation.add(message);
	}

	public void ladungsverzeichnisAusgeben() {
		for (int i = 0; i < ladungsverzeichnis.size(); i++) {
			System.out.println(ladungsverzeichnis.get(i));
		}
	}

	public void ladungsAufraeumen() {
		for (int i = 0; i < ladungsverzeichnis.size(); i++) {
			Ladung tmp = this.ladungsverzeichnis.get(i);
			if (tmp.getMenge() == 0) {
				ladungsverzeichnis.remove(i);
			}
		}
	}

	public void addLadungsverzeichnis(String ladungsbezeichnung, int ladungsmenge) {
		this.ladungsverzeichnis.add(new Ladung(ladungsbezeichnung, ladungsmenge));
	}

	public void zustandRaumschiff() {
		String tmp = "Schiffsname: %s%n Schild bei: %d%%%n Hülle bei: %d%%%n Energieversorgung bei: %d%%%n Lebenserhaltungssystem bei: %d%%%n";
		System.out.printf(tmp, this.getSchiffsname(), this.getSchildeInProzent(), this.getHuelleInProzent(),
				this.getEnergieversorgungInProzent(), this.getLebenserhaltungssystemInProzent());
	}

	public int getHuelleInProzent() {
		return huelleInProzent;
	}

	public void setHuelleInProzent(int huelleInProzent) {
		if (huelleInProzent > 100) {
			this.huelleInProzent = 100;
		} else {
			this.huelleInProzent = huelleInProzent;
		}
	}

	@SuppressWarnings("unused")
	public boolean existiertRaumschiff(Raumschiff zielRaumschiff) {
		if (true) {
			return true;
		} else {
			return false;
		}
	}

	public void treffer(Raumschiff schiff) {
		System.out.println(this.getSchiffsname() + " wurde getroffen!");
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
				addBroadcastKommunikation("Photonentorpedo abgeschossen");
				this.setPhotonentorpedoAnzahl(this.getPhotonentorpedoAnzahl() - 1);
				zielRaumschiff.treffer(zielRaumschiff);
			} else {
				addBroadcastKommunikation("-=*Click*=-");
			}
		}
	}

	public void photonentorpedoLaden(int nachladenMenge) {
		boolean tmp = false;
		for (int i = 0; i < this.ladungsverzeichnis.size(); i++) {
			if (this.ladungsverzeichnis.get(i).getBezeichnung() == "Photonentorpedo") {
				Ladung Photo = this.ladungsverzeichnis.get(i);
				if (Photo.getMenge() < nachladenMenge) {
					this.setPhotonentorpedoAnzahl(Photo.getMenge());
					Photo.setMenge(0);
				} else {
					this.setPhotonentorpedoAnzahl(nachladenMenge);
					Photo.setMenge(Photo.getMenge() - nachladenMenge);
					System.out.println("[" + nachladenMenge + "] Photonentorpedo(s) eingesetzt");
				}
				tmp = true;
				break;
			}
		}
		if (tmp) {
			addBroadcastKommunikation("-=*Click*=-");
			System.out.println("Keine Photonentorpedos gefunden!");
		}
	}

	public void phaserkanoneSchiessen() {
		if (this.getEnergieversorgungInProzent() < 50) {
			addBroadcastKommunikation("-=*Click*=-");
		} else {
			this.setEnergieversorgungInProzent(this.getEnergieversorgungInProzent() - 50);
			System.out.println("Phaserkanone abgeschossen");
		}
	}

	@Override
	public String toString() {
		String tmp = "Name: %s%n Lebenserhaltungssystem bei %d%%%n Energieversorgung bei %d%%%n Hülle bei %d%%%n Schilde bei %d%%%n Photonentorpedo anzahl: %d%n Androiden anzahl: %d%n Ladung:%n";
		for (int i = 0; i < this.ladungsverzeichnis.size(); i++) {
			Ladung lad = this.ladungsverzeichnis.get(i);
			tmp = tmp + "  " + lad.getBezeichnung() + ": " + lad.getMenge() + "\n";
		}
		return String.format(tmp, this.getSchiffsname(), this.getLebenserhaltungssystemInProzent(),
				this.getEnergieversorgungInProzent(), this.getHuelleInProzent(), this.getSchildeInProzent(),
				this.getPhotonentorpedoAnzahl(), this.getAndroidenAnzahl());
	}

	public void reperaturAndroiden(int androiden, boolean huelle, boolean schilde, boolean energieversorgung) {
		int x = 0;
		int rand = new Random().nextInt(101);
		if (androiden > this.getAndroidenAnzahl()) {
			androiden = this.getAndroidenAnzahl();
		}
		if (huelle) {
			x++;
		}
		if (schilde) {
			x++;
		}
		if (energieversorgung) {
			x++;
		}
		int repatiert = (rand * androiden) / x;
		if (huelle) {
			this.setHuelleInProzent(this.getHuelleInProzent() + repatiert);
		}
		if (schilde) {
			this.setSchildeInProzent(this.getSchildeInProzent() + repatiert);
		}
		if (energieversorgung) {
			this.setEnergieversorgungInProzent(this.getEnergieversorgungInProzent() + repatiert);
		}

	}

}