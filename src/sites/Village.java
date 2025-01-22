package sites;
import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] listeDeGaulois = new Gaulois[5];
	private int nombreDeGaulois = 1;
	private int maxGaulois = 5;
	
	public Village(Gaulois gaulois){
		chef = gaulois;
		listeDeGaulois[0] = chef;
		System.out.println("Le " + chef.donnerAuteur() + " " + chef.getNom() + " : « Je suis un grand guerrier et je vais créer mon village »");
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois villageois) {
		if (nombreDeGaulois >= maxGaulois) {
			System.out.println("Le gaulois " + chef.getNom() + " : « Désolé " + villageois.getNom() + " mon village est déjà bien rempli. »");
		}else {
			listeDeGaulois[nombreDeGaulois] = villageois;
			nombreDeGaulois++;
			System.out.println("Le gaulois " + chef.getNom() + " :  « Bienvenue "+  villageois.getNom() + " ! »");
		}
		
	}
	
	public void afficherVillage() {
		
		if (nombreDeGaulois <= 1) {
			System.out.println("Le village de "+ chef.getNom() +" n'est pas habité");
		}else {		
			System.out.println("Le village de "+ chef.getNom() +" est habité par :");
			for(int i = 1; i < nombreDeGaulois; i++) {
				System.out.println(" - " + listeDeGaulois[i].getNom());
			}
		}
	}
	
	public void changerChef(Gaulois nouveauChef) {
		chef = nouveauChef;
		listeDeGaulois[0] = chef;
		boolean isFind = false;
		
		for (int i = 1; i < nombreDeGaulois-1; i++) {
			if (listeDeGaulois[i].equals(nouveauChef)) isFind = true;
			
			if (isFind)listeDeGaulois[i] = listeDeGaulois[i+1];
		}
		nombreDeGaulois--;
		listeDeGaulois[nombreDeGaulois] = null;
	}
	
}
