package personnages;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois chef;
	private Gaulois[] tableauVillage;
	
	
	public Village(String nom, Gaulois chef, int NB_VILLAGEOIS_MAX) {
		this.nom = nom;
		this.chef = chef;
		tableauVillage = new Gaulois[NB_VILLAGEOIS_MAX];
		tableauVillage[nbVillageois] = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getChef() {
		return chef.getNom();
	}
	
	public int getNbVillageois() {
		return nbVillageois;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		nbVillageois = nbVillageois + 1;
		tableauVillage[nbVillageois] = gaulois;
		
		
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois<0) {
			return null;
		}
		else if (numVillageois>nbVillageois) {
			return null;
		}
		return tableauVillage[numVillageois];	
	}
	
	public void afficherVillage() {
		System.out.println("Dans le village " + getNom() + " du chef " + getChef() + " vivent les légendaires gaulois :");
		int nb = 1;
		while (trouverVillageois(nb)!= null) {
			System.out.println("- " + trouverVillageois(nb).getNom());
			nb = nb + 1;
		}
	}
	
	public static void main(String[] args) {
		Gaulois abraracoucix = new Gaulois("Abraracourcix",6);
		Village village = new Village("Village des Irréductibles",abraracoucix,30);
		Gaulois asterix = new Gaulois("Astérix",8);
		village.ajouterVillageois(asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillage();

		
	}
}
