package personnages;
import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois{
	
	private Random random;
	private int forcePotion = 1;
	private int doseRestante = 0;
	
	public Druide(String nom, int force) {
		super(nom,force);
		try {     
			random = SecureRandom.getInstanceStrong(); 
		} catch (Exception e) {
			e.printStackTrace(); }
	}
	
	public void fairepotion(int nombreDeDose) {
		forcePotion = random.nextInt(5)+2;
		doseRestante = nombreDeDose;
		System.out.println("Le gaulois " + getNom() + " : � J'ai concoct� " + nombreDeDose + " doses de potion magique. Elle a une force de " + forcePotion + ". �");
	}
	
	public void donnerPotion(Gaulois gaulois){
		if (doseRestante > 0) {
			if (gaulois.getNom().equals("Ob�lix")) {
				System.out.println("Le gaulois " + getNom() + " : � Non, Ob�lix Non !... Et tu le sais tr�s bien ! �");
			}else {
				gaulois.boirePotion(forcePotion);
				doseRestante--;
				System.out.println("Le gaulois " + getNom() + " : � Tiens " + gaulois.getNom() + " un peu de potion magique. �.");
			}
			}else {
			System.out.println("Le gaulois " + getNom() + " : � D�sol� " + gaulois.getNom() + " il n'y a plus une seule goutte de potion. �");
		}
		
	}
}
