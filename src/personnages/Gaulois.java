package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public int getEffetPotion() {
		return effetPotion;
	}
	
	public int getForce() {
		return force;
	}
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	@Override
	public String toString() {
		return nom ;
	}
	
	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + nomRomain);
		int forceCoup = (force*effetPotion) / 3;
		romain.recevoirCoup(forceCoup);
		if (effetPotion!=1) {
			this.effetPotion = effetPotion-1;
		}

	}
	
	public void boirePotion(int forcePotion) {
		this.effetPotion = forcePotion;
	
	}

	public static void main(String[] args){
		Gaulois asterix = new Gaulois ("Astérix", 8);
		System.out.println(asterix);
		
	}
}