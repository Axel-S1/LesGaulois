package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	
	protected Personnage(String nom, int force){
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String message) {
		System.out.println("le "+ donnerAuteur()+ " " + nom + " : " + '"' + message + '"');
	}
	
	public void frapper(Personnage personnage) {
		System.out.println("Le " + donnerAuteur() + " " + nom + " donne un grand coup au " + personnage.donnerAuteur() + " " + personnage.getNom());
		personnage.recevoirCoup(force/3);
	}
	
	public void recevoirCoup(int force_du_coup) {
		force = force - force_du_coup;
		if (force <= 0){
			force = 0;
			this.parler("J'abandonne");
		}
		else {
			this.parler("A�e !");
		}
	}

	protected abstract String donnerAuteur();
}
