package test_fonctionnel;
import personnages.Gaulois;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class Mytest {
	public static void main(String[] args) {
		Soldat minus = new Soldat("Minus", 6, "centurion");
		minus.mettreEquipement();
	}
}
