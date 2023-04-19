public class Raumschiff_Test {

	public static void main(String[] args) {
		Raumschiff klingonen = new Raumschiff("IKS Hegh'ta", 100, 100, 100, 100, 1, 2);
		klingonen.addLadungsverzeichnis("Forschungssonde", 35);
		klingonen.addLadungsverzeichnis("Photonentorpedo", 3);
		
		Raumschiff romulaner = new Raumschiff("IRW Khazara", 100, 100, 100, 100, 2, 2);
		romulaner.addLadungsverzeichnis("Rote Materie", 2);
		romulaner.addLadungsverzeichnis("Borg-Schrott", 5);
		romulaner.addLadungsverzeichnis("Plasma-Waffe", 50);
		
		Raumschiff vulkanier = new Raumschiff("IKS Hegh'ta", 100, 80, 50, 80, 0, 5);
		vulkanier.addLadungsverzeichnis("Ferengi Schneckensaft", 200);
		vulkanier.addLadungsverzeichnis("Bat'leth Klingonen Schwert", 200);

		vulkanier.zustandRaumschiff();
		vulkanier.reperaturAndroiden(50, true, false, false);
		vulkanier.zustandRaumschiff();
	}

}
