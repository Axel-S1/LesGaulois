package personnages;

public class Gaulois extends Personnage{
	private float boostPotion = 0;
	public Gaulois(String nom, int force){
		super(nom, force);
	}
	
	@Override
	public String donnerAuteur() {
		return "Gaulois";
	}
	
	@Override
	public void frapper(Personnage personnage) {
		int forceDuCoup = (int)(getForce()*boostPotion);
		System.out.println("Le " + donnerAuteur() + " " + getNom() + " donne un grand coup de force " + forceDuCoup + " au " + personnage.donnerAuteur() + " " + personnage.getNom());
		personnage.recevoirCoup(forceDuCoup);
		boostPotion -= 0.5;
	}
	
	protected void boirePotion(int forcePotion) {
		boostPotion = forcePotion;
	}
}