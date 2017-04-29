package poo.heritage;

public class TestHeritage {
	public static void main(String[] args) {

		CompteEparge ce1 = new CompteEparge();
		ce1.numero = "DDD ";
		ce1.solde = 2510;
		ce1.setTaux(0.005);
		try {
			ce1.depot(150);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(ce1.affiche());

		FenPrincipal fe = new FenPrincipal();
		fe.setVisible(true);
	}

}
