package personnages;

public class Soldat extends Romain{
	
	private String grade;
	
	private boolean[] listeEquipement = {false, false, false};
	private enum Equipement {  CASQUE("casque", 2), PLASTRON("plastron", 3), BOUCLIER("bouclier", 3); 
		 private String chaine;
		 private int resistance;
		
		 private Equipement(String chaine, int resistance){
			 this.chaine = chaine;
			 this.resistance = resistance;
		}
		 
		 @Override  
		 public String toString() {
			 return chaine;
		 }
	}	
	
	public Soldat(String nom, int force, String grade) {
		super(nom, force);
		this.grade = grade;
	}
	
	public String getGrade() {
		return grade;
	}
	
	@Override
	public void parler(String message) {
		System.out.println("le "+ grade + " " + getNom() + " : " + '"' + message + '"');
	}
	
	public void mettreEquipement() {
		for(int i = 0; i < 3; i++) {
			if(!(listeEquipement[i])){
				listeEquipement[i] = true;
				if (i == 0) System.out.println("Le soldat "+ getNom() + " s'équipe avec un "+ Equipement.CASQUE +". ");
				else if (i == 1) System.out.println("Le soldat "+ getNom() + " s'équipe avec un "+ Equipement.PLASTRON +". ");
				else if (i == 2) System.out.println("Le soldat "+ getNom() + " s'équipe avec un "+ Equipement.BOUCLIER +". ");
	
			}
		}
	}
	
	@Override
	public void recevoirCoup(int force_du_coup) {
		
		for(int i = 0; i < 3; i++) {
			if((listeEquipement[i])){
				
			}
		}
		
		force = force - force_du_coup;
		if (force <= 0){
			force = 0;
			parler("J'abandonne");
		}
		else {
			parler("Aïe !");
		}
	}
}
