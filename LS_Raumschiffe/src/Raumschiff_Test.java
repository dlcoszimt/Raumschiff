public class Raumschiff_Test {

	public static void main(String[] args) {
		Raumschiff Pika = new Raumschiff(4, 100, 100, 100, 2, "Pika-Pika");
		Pika.setLebenserhaltungssystemInProzent(50);
		Pika.setEnergieversorgungInProzent(10);
		Pika.addLadungsverzeichnis("Stühle", 3);
		Pika.addLadungsverzeichnis("Sklaven", 17);
		System.out.println(Pika.getLebenserhaltungssystemInProzent());
		System.out.println(Pika.getEnergieversorgungInProzent());
		System.out.println(Pika.getLadungsverzeichnis());
	}

}
