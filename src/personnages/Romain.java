package personnages;

public class Romain {
	private String nom;
	private int force;
	private String texte;
	private int nbEquipement = 0;
	private Equipement[] equipements = new Equipement[2];
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
//	public void recevoirCoup(int forceCoup) {
//		force -= forceCoup;
//		if (force < 1) {
//		force = 0;
//		parler("J'abandonne !");
//		} else {
//		parler("Aïe");
//		}
//	}	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		switch (force) {
		case 0:
			parler("Aïe");
			break;
		default:
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
			break;
		}
		return equipementEjecte;
	}
	private int CalculResistanceEquipement(int forceCoup) {
			texte = "Ma force est de " + this.force + ", et la force du coup est de"
					+ "" + forceCoup;
			int resistanceEquipement = 0;
			if (!(nbEquipement == 0)) {
				texte += "\nMais heureusement, grace à mon équipement sa force est"
						+ "diminué de ";
			for (int i = 0; i < nbEquipement;) {
				if ((equipements[i] != null &&
		equipements[i].equals(Equipement.BOUCLIER)) == true) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
				i++;
			}
			texte =+ resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + " s'envole sous"
				+ "la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				continue;
			} else {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}

	
}
