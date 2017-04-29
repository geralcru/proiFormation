package poo.encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {

		Utilisateur u1 = new Utilisateur();
		u1.setNom("Gerardo");
		try {
			u1.setEmail("dg@adneom.com");
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		try {
			u1.setMotDePasse("AAqqqqq");
			String nom = u1.getNom();
			System.out.println("le nom est " + nom);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Utilisateur u2 = new Utilisateur("Celine", "celine@toto.com", "duduew");
			String mail = u2.getEmail();
			System.out.println("le mail est = " + mail);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
