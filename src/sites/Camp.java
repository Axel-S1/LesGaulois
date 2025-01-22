package sites;

import personnages.Gaulois;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] listeDeSoldat = new Soldat[80];
	private int nombreDeSoldat = 1;
	private int maxSoldat = 4;
	
	public Camp(Soldat soldat){
		commandant = soldat;
		System.out.println("Le " + commandant.donnerAuteur() + " " + commandant.getNom() + " : « Je suis en charge de créer un nouveau camp romain. »");
	}
	
	public Soldat getCommandant() {
		return commandant;
	}
	
	public void ajouterSoldat(Soldat soldat) {
		if (nombreDeSoldat >= maxSoldat) {
			System.out.println("Le romain " + commandant.getNom() + " : « Désolé "+ soldat.getNom() +" notre camp est complet ! ».");
		}else {
			listeDeSoldat[nombreDeSoldat] = soldat;
			nombreDeSoldat++;
			System.out.println("Le romain " + soldat.getNom() + "  : « Je mets mon épée au service de Rome dans le camp dirigé par "+ commandant.getNom() +" ».");
		}
		
	}
	
	public void afficherCamp() {
		
		if (nombreDeSoldat <= 1) {
			System.out.println("Le camp dirigé par "+ commandant.getNom() +" ne contient pas de soldats.");
		}else {
			System.out.println("Le camp dirigé par "+ commandant.getNom() +" contient les soldats :");
			for(int i = 1; i < nombreDeSoldat; i++) {
				System.out.println(" - " + listeDeSoldat[i].getNom());
			}
		}	
	}
	
	public void changerCommandant(Soldat nouveauCommandant) {
		if (nouveauCommandant.getGrade().equalsIgnoreCase("centurion")) {
			commandant = nouveauCommandant;
			listeDeSoldat[0] = commandant;
			boolean isFind = false;
			
			for (int i = 1; i < nombreDeSoldat-1; i++) {
				if (listeDeSoldat[i].equals(commandant)) isFind = true;
				
				if (isFind)listeDeSoldat[i] = listeDeSoldat[i+1];
			}
			nombreDeSoldat--;
			listeDeSoldat[nombreDeSoldat] = null;
		}
		
	}
	
}
