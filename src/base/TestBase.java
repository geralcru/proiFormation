package base; //déclaration du package

import java.util.Scanner;

public class TestBase {
	/*
	 * ceci est une méthide principale qui répresente le point de lancement
	 */

	private static Scanner scanner;

	public static void main(String[] args) {

		// appel de la fonction println de l'objet out se trouvant
		// dans la class system
		System.out.println("Manipulation de variables");


	
		boolean erreur = false;
		double nb;
		do {
			System.out.print(" saisir un nombre");
			scanner = new Scanner(System.in);
			String saisie = scanner.nextLine();
			nb = 0;
			try {
				nb = Double.parseDouble(saisie);
				System.out.println("vous avez saisie;" + nb);
				erreur = false;
			} catch (NumberFormatException e) {
				System.out.println("Error; saisie incorrect");
				erreur = true;
			}
		} while (erreur);
		// transtypage
		int v = 45;
		double w = v; // type inf==>type sup (convertion implicit)
		w = 4.5;
		v = (int) w; // cast; pour forcer la convertion (nouvtype)

		/*
		 * operateurs: - arith ; +,-,*,/,% (module = reste de la division
		 * entiere -Inc / dec : ++ / -- - Comb : +=, -=, *=, /= - Comparaison :
		 * == , != (different), <,>, <=, >= - Logiques ; && (et), || (ou),
		 */

		// conditions
		// if / else
		// switch

		if (nb == 0)
			System.out.println(" chiffre est zero");
		else if (nb > 0)
			System.out.println("chiffre positif");
		else
			System.out.println("chiffre négatif");

		switch ((int) nb) {
		case 5:
			System.out.println("case 5");
			break;
		case 45:
		case 48:
			System.out.println(" cas 45 ou 48");

		default:
			System.out.println("autre cas");
			break;
		}
		String type = (nb > 0) ? "positif" : (nb == 0 ? "null" : "négatif");
		System.out.println("type :" + type);

		/*
		 * boucles:
		 *  for: connaissance du nombre d'intération for
		 * for (foreach):parcours complet de tableaux ou de collections while: do
		 * while; boucle conditionelle do while; boucle conditionelle executée
		 * au moins une fois
		 */
		
		/*tabelau a 1 dimension
		 * type [] nom = new type [taille];
		 * index à partir de 0, accès = nomTableau[indice]
		 * taille : nomTableau.length
		 * 
		 */
		int[] t = new int[3];
		t[0] = 24;
		t[1] = 4;
		t[2] = 2;
		int[] tab = { 24, 6, 78 };
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + "\t");
		}
		System.out.print("parcours à forEach______");
		for (int unEltDuTableau : tab) {
			System.out.print(unEltDuTableau +"\t");
		}
		System.out.println();
	}
}
