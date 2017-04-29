package genericite;

import poo.exo1.CompteBancaire;

public class TestGenericite {

	public static void main(String[] args) {

		Calcul<CompteBancaire> cl = new Calcul<>();
		cl.a = new CompteBancaire("cp1", 100);
		cl.b = new CompteBancaire("cp2", 100);
		cl.permuter();
		System.out.println(cl.a.numero + " - " + cl.b.numero);

		Calcul<String> cl2 = new Calcul<>();
		cl2.a = "toto";
		cl2.b = "titi";
		cl2.permuter();
		System.out.println(cl2.a + " - " + cl2.b);
	}
}
