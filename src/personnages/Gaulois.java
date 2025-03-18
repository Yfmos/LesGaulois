package personnages;

public class Gaulois {
	private String nom;
//	private int force;
	private int force;
	private int nbTrophees;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
//	private String prendreParole() {
//	return "Le gaulois " + nom + " : ";
//}
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " +
		romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
		return;
	}

	

}

