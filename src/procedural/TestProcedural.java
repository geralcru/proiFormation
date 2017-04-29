package procedural;

public class TestProcedural {

	public static void main(String[] args) {
		// String s1 = "Java, c'est facile";
		// int noCarac = s1.length();
		int r1 = MesFonctions.somme(2, 4);
		System.out.println("r1 = " + r1);

		double[] t = { 25, 70, 70.6 };
		MesFonctions.afficher(t);
		double moy = MesFonctions.moyenne(t);
		// double arro = MesFonctions.arrondir(moy, 2);
		System.out.print("moyenne =");
		System.out.println(MesFonctions.arrondir(moy, 2));
		System.out.print("valeur product = ");
		System.out.println(MesFonctions.product(2, 3, 56));
		try {
			double ret = MesFonctions.retrait(500, 2000);
			System.out.println("Retrait effectué " + ret);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
