package personnages;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron(0,0);
	
	public Druide(String nom, int force) {
		this.nom = nom;
		this.setForce(force);
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		
		chaudron.remplirChaudron(quantite, forcePotion);
		this.parler("J'ai concocté " + quantite + " doses de potion magique. "
		+ "Elle a une force de " + forcePotion + ".");
		
	}
	
	public void booster(Gaulois gaulois) {
		String nomGaulois = gaulois.getNom();
		if (chaudron.resterPotion()) {
			
			if (nomGaulois == "Obélix") {
				this.parler( "Non, " + nomGaulois + " Non !... Et tu le sais très bien !");
			}
			else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				this.parler("Tiens " + nomGaulois + " un peu de potion magique.");
			}
		}
		else {
			this.parler("Désolé " + nomGaulois + "il n'y a plus une seule goutte de potion.");
		}
		
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}
	
}
