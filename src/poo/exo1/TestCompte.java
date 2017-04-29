package poo.exo1;

import java.util.Scanner;



public class TestCompte {

	private static Scanner scanner;

	public static void main(String[] args) {
		// NomcelaClasse nomObjet = new Constructeur(....);
		CompteBancaire cb1 = new CompteBancaire("XY", 500);
		/*
		 * variable choix faire afficher cb1 afficher le ménu : 1-dépot
		 * 2-retrait 3-quitter demander le choix de l'utilisateur si choix =1,
		 * saisir le montant et effectuer un depot tant que choix =!3
		 */
		int choix = 0;
		do {
			System.out.println(cb1.affiche());
			System.out.println("1-depot , 2-retrait, 3-quitter");
			System.out.println("votre choix ? ");
			scanner = new Scanner(System.in);
			choix = scanner.nextInt();
			double montant = 0;
			if (choix == 1 || choix == 2) {
				System.out.print("Montant ? ");
				montant = scanner.nextDouble();
			}

			try {
				if (choix == 1) {
					cb1.depot(montant);
				} else if (choix == 2) {
					cb1.retrait(montant);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (choix != 3);
		
	} // end main
}// end class
