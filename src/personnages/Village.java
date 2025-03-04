package personnages;

public class Village {
	private String nom;
	private int nbVillageois;
	private Gaulois[] villageois;
	
	
	public Village(String nom, final int nbVillagemax) {
		this.nom = nom;
		this.nbVillageois = 0;
		villageois = new Gaulois [nbVillagemax];
		
	}
	public String getNom() {
		return nom;
	}
	public void ajouterVillageois(Gaulois Gaulois) {
		villageois[nbVillageois] = Gaulois;
		nbVillageois++;
	}
	public Gaulois trouverVillageois(int numVillageois) {
		if (villageois[numVillageois-1]!=null) {
			return villageois[numVillageois-1];
		} else {
			System.out.println("Il n’y a pas autant d’habitants dans notre village !");
			return villageois[numVillageois-1];
		}
	}
	public static void main(String[] args) {
		
	}
	

}
