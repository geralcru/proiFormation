package pooo.agregation.forte;

import java.util.Scanner;

public class exoQcm {

	private static Scanner scanner;

	public static void main(String[] args) {
		Questionnaire qcmJava = Questionnaire.genererExemple();

		System.out.println(qcmJava.getSujet());

		int score = 0;
		for (Question qu : qcmJava.getListeQestion()) {
			System.out.println(qu.getEnonce());
			int i = 1;
			for (Reponse rep : qu.getListeReponses()) {
				System.out.println(i + " - " + rep.getTexte());
				i++;
			}
			int choix = 0;
			do {
				try {
					System.out.println("votre choix ? ");
					scanner = new Scanner(System.in);
					choix = scanner.nextInt();
				} catch (Exception e) {
				} 
			} while (choix<1 || choix>qu.getListeReponses().size());
			
			if (qu.getListeReponses().get(choix - 1).isCorrecte())
				score++;
		}
		System.out.println("votre score = " + score);
	}
}
