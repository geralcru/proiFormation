package poo.agregation;

public class TestAgregation {
	public static void main(String[] args) {

		Client cl1 = new Client();
		cl1.setNom("toto");
		try {
			cl1.setAdr(new Adresse(1, "rue pipi", "Paris"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Client cl3 = new Client();
		cl1.setNom("TOTO ");
		try {
			cl1.setAdr(new Adresse(1, "rue de la paix", "PARIS"));
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		System.out.println(cl1.afficher());

		Client cl2 = new Client();
		try {
			cl2.setNom("DIDI");

		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		System.out.println(cl2.afficher());

		Adresse a1 = new Adresse();
		try {
			a1.setRue("rue de la fué");
			a1 = new Adresse(1, " rue de montparnasse", "PARIS");
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		System.out.println(cl3.afficher());

		Client cl6 = new Client();
		cl6.setNom("Mathilde ");
		cl6.setAdr(a1);
		System.out.println(cl6.afficher());

		Client cl5 = new Client();
		cl5.setNom("Jacques");
		cl5.setAdr(new Adresse());
		cl5.getAdr().setNom(1);
		cl5.getAdr().setRue("rue de la paix");
		try {
			cl5.getAdr().setVille("Lyon");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(cl5.afficher());
		}
	}
}
