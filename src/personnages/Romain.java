package personnages;

public class Romain{
	private String name;
	private int force;
	
	public Romain(String name, int force){
		this.name = name;
		this.force = force;
	}
	
	public String getName() {
		return name;
	}
	
	public void parler(String message) {
		System.out.println("le romain " + name + " : " + '"' + message + '"');
	}
	
	public void recevoirCoup(int force_du_coup) {
		force = force - force_du_coup;
		if (force <= 0){
			force = 0;
			this.parler("J'abandonne");
		}
		else {
			this.parler("Aïe !");
		}
	}
}
