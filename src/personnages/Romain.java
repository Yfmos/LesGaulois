package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;
	
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
	
	public void sEquiper(Equipement equipement) {
		if (nbEquipement == 2) {
			System.out.println("Le soldat " + getNom() + " est déjà bien protégé !");
		}
		else {
			if (nbEquipement==0) {
				System.out.println("Le soldat " + getNom() + " s'équipe avec un " + equipement.toString() + ".");
				equipements[0] = equipement;
				nbEquipement ++;
			}
			else {
				if (equipement == equipements[0]) {
					System.out.println("Le soldat " + getNom() + " possède déjà un " + equipement.toString() + ".");
				}
				else {
					System.out.println("Le soldat " + getNom() + " s'équipe avec un " + equipement.toString() + ".");
					equipements[1] = equipement;
					nbEquipement ++;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);

	}

}

