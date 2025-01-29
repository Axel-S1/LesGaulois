package test_fonctionnel;

import personnages.Gaulois;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix  = new Gaulois("Vercingétorix ", 8);
		Gaulois agecanonix  = new Gaulois("Agecanonix ", 1);
		Gaulois assurancetourix  = new Gaulois("Assurancetourix ", 2);
		Gaulois asterix  = new Gaulois("Astérix ", 5);
		Gaulois obelix  = new Gaulois("Obelix ", 15);
		Gaulois prolix  = new Gaulois("Prolix ", 2);
		
		
		Soldat minus = new Soldat("Minus", 6, "centurion");
		Soldat brutus  = new Soldat("Brutus ", 5, "centurion");
		Soldat milexcus = new Soldat("Milexcus", 2, "soldat");
		Soldat tulliusOctopus = new Soldat("Tullius Octopus", 2, "tesserarius");
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, "optio");
		
		Village village = new Village(vercingetorix);
		Camp camp = new Camp(minus);
		
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tulliusOctopus);
		camp.ajouterSoldat(ballondebaudrus);
		
		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);
		
		camp.afficherCamp();
		camp.changerCommandant(brutus);
		camp.afficherCamp();
		
		village.afficherVillage();
		village.changerChef(assurancetourix);
		village.afficherVillage();
		
		

		
	}
}
