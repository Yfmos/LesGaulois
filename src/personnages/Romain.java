package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
	}
	
	private boolean isInvariantVerified() {
        return this.force >= 0;
    }

	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		if (forceCoup > this.force ) {
			this.parler("J'abandonne !");
		}
		else {
			this.parler("Aïe");
			
		}
		this.force = force - forceCoup;
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
	}

}

