package procedural;

public class MesFonctions {

	public static int somme(int a, int b) {
		return a + b;
	}

	public static void afficher(double[] tab) {
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + "\t");
		}
		System.out.println();
	}

	public static double moyenne(double[] tab) {
		double s = 0;
		for (double d : tab) {
			s += d;
		}
		return s / tab.length;
	}

	public static double arrondir(double nombre, int nbDecimales) {
		String ch = String.valueOf(nombre);
		ch = ch.substring(0, ch.indexOf(".") + nbDecimales + 1);
		return Double.parseDouble(ch);
	}
	// plusieurs methodes peuvent avoir les memes nom mais differents paramètres

	public static int somme(int a, int b, int c) {
		return a + b + c;
	}

	public static int product(int... t) {
		int p = 1;
		for (int x : t)
			p = p * x;
		return p;
	}
	/*
	 * MesFonctions.product(2,3); MesFonctions.product(2,3,45);
	 * MesFonctions.product(tab);
	 */

	public static double retrait(double montant, double solde) throws Exception {
		if (montant <= solde)
			return solde - montant;
		else {
			throw new Exception("Erreur; solde insuffisant!");
		}
	}
}
