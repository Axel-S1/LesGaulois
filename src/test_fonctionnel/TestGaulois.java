package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;
import personnages.Druide;

public class TestGaulois {
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		Druide panoramix = new Druide("Panoramix", 1);
		
		Gaulois asterix = new Gaulois("Asterix", 5);
		Gaulois obelix  = new Gaulois("Obélix", 15);
		Gaulois assurancetourix  = new Gaulois("Assurancetourix", 2);
		Gaulois vercingetorix  = new Gaulois("Vercingétorix", 8);
		Gaulois agecanonix  = new Gaulois("Agecanonix", 1);
		
		panoramix.fairepotion(3);
		panoramix.donnerPotion(asterix);
		panoramix.donnerPotion(obelix);
		panoramix.donnerPotion(assurancetourix);
		panoramix.donnerPotion(vercingetorix);
		panoramix.donnerPotion(agecanonix);
		
		
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU... UN GAUGAU...");
			
		while(!(asterix.estMort() || minus.estMort())){
			if(!(asterix.estMort())) asterix.frapper(minus);
			if(!(  minus.estMort())) minus.frapper(asterix);
		}
		
	}
}
