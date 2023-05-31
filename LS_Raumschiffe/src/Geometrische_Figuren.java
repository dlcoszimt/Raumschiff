import java.text.DecimalFormat;
public class Geometrische_Figuren {

	public static void main(String[] args) {
		Kreis k1 = new Kreis(4.0, "\\u001B[35m");
		Dreieck d1 = new Dreieck("\\u001B[32m", 2.0, 2.0, 3.0);
		Dreieck d2 = new Dreieck("\\u001B[34m", 1.0, 1.0, 3.0);

		System.out.println(k1);
//		System.out.println(d1);
//		System.out.println(d2);
	}
}

abstract class Figur {
	private String farbe;

	public Figur() {
	}

	public Figur(String farbe) {
		this.setFarbe(farbe);
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public abstract double umfang();

	public abstract double flaeche();

	public abstract String toString();
}

class Kreis extends Figur {
	private double radius;

	public Kreis() {
	};

	public Kreis(double radius, String farbe) {
		super(farbe);
		this.setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double umfang() {
		double u = 2 * Math.PI * this.getRadius();
		return u;
	}

	@Override
	public double flaeche() {
		double f = Math.pow(radius, 2.0f) * Math.PI;
		return f;
	}

	@Override
	public String toString() {
	  DecimalFormat df = new DecimalFormat("###.##");
	  return getFarbe() + "Kreis mit dem Radius: " + getRadius() + "\n"
	         + "Kreisumfang: " + df.format(umfang()) + "\n"
	         + "Kreisfläche: " + df.format(flaeche()) + "\u001B[0m";
	}
}

class Dreieck extends Figur {
	private double seiteA;
	private double seiteB;
	private double seiteC;

	public Dreieck() {
	};

	public Dreieck(String farbe, double seiteA, double seiteB, double seiteC) {
		super(farbe);
		this.setSeiteA(seiteA);
		this.setSeiteB(seiteB);
		this.setSeiteC(seiteC);
	}

	public double getSeiteA() {
		return seiteA;
	}

	public void setSeiteA(double seiteA) {
		this.seiteA = seiteA;
	}

	public double getSeiteB() {
		return seiteB;
	}

	public void setSeiteB(double seiteB) {
		this.seiteB = seiteB;
	}

	public double getSeiteC() {
		return seiteC;
	}

	public void setSeiteC(double seiteC) {
		this.seiteC = seiteC;
	}

	public double alpha() {
		double tmp1 = Math.pow(this.getSeiteC(), 2) + Math.pow(this.getSeiteB(), 2) - Math.pow(this.getSeiteA(), 2);
		double tmp2 = 2 * this.getSeiteB() * this.getSeiteC();
		double a = Math.acos(tmp1 / tmp2);
		return a;
	}

	public double beta() {
		double tmp1 = Math.pow(this.getSeiteA(), 2) + Math.pow(this.getSeiteC(), 2) - Math.pow(this.getSeiteB(), 2);
		double tmp2 = 2 * this.getSeiteA() * this.getSeiteC();
		double b = Math.acos(tmp1 / tmp2);
		return b;
	}

	public double gamma() {
		double tmp1 = Math.pow(this.getSeiteA(), 2) + Math.pow(this.getSeiteB(), 2) - Math.pow(this.getSeiteC(), 2);
		double tmp2 = 2 * this.getSeiteA() * this.getSeiteB();
		double g = Math.acos(tmp1 / tmp2);
		return g;
	}

	public double hoeheA() {
		double ha = this.getSeiteB() * Math.sin(this.gamma());
		return ha;
	}

	public double hoeheB() {
		double hb = this.getSeiteA() * Math.sin(this.gamma());
		return hb;
	}

	public double hoeheC() {
		double hc = this.getSeiteA() * Math.sin(this.beta());
		return hc;
	}

	public double grad(double radius) {
		double g = (radius / Math.PI) * 180;
		return g;
	}

	public boolean isDreieck() {
		return (this.seiteA < this.seiteB + this.seiteC) && (this.seiteB < this.seiteA + this.seiteC)
				&& (this.seiteC < this.seiteA + this.seiteB);
	}

	@Override
	public double umfang() {
		double u = this.getSeiteA() + this.getSeiteB() + this.getSeiteC();
		return u;
	}

	@Override
	public double flaeche() {
		double f = (this.getSeiteA() * this.getSeiteB()) / 2;
		return f;
	}

	@Override
	public String toString() {
	   DecimalFormat df = new DecimalFormat("###.##");
	   String result = getFarbe() + "Dreieck Seitenlänge A: " + getSeiteA() + " B: "
	                   + getSeiteB() + " C: " + getSeiteC() + "\n";

	   result += isDreieck()
	          ? "Dreieck Winkel Alpha: " + df.format(grad(alpha())) + "°" + " Beta: " +
	          df.format(grad(beta())) + "°" + " Gamma: " + df.format(grad(gamma())) +
	          "° \n" + "Dreieck Höhen h_a: " + df.format(hoeheA()) + " h_b: " +
	          df.format(hoeheB()) + " h_c: " + df.format(hoeheC()) + "\n" +
	          "Dreiecksumfang: " + df.format(umfang()) + "\n" + "Dreiecksfläche: " +
	          df.format(flaeche()) + "\u001B[0m"
	          :
	          "Keine gültigen Seitenlängen für ein Dreieck.";
	    return result;
	 }

}