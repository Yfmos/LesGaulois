package test_fonctionnel;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	
	public static void main(String[] args){
		Gaulois asterix = new Gaulois ("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 16);
		asterix.parler("Bonjour Obélix");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		Romain minus = new Romain ("Minus", 6);
		System.out.println("Dans la forêt Astérix et Obélix tombent nez à nez sur le romain Minus.");
		int i=1;
		while (i <= 3) {
			asterix.frapper(minus);
			i=i+1;
		}
		Romain brutus = new Romain ("Brutus", 14);
		Druide panoramix = new Druide("Panoramix",2);
		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		int x=1;
		while (x <= 3) {
			asterix.frapper(brutus);
			x=x+1;
		}
		
	}
}

