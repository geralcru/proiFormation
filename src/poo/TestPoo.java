package poo;

import java.io.IOException;
import java.util.Vector;

import poo.Ecran.Etat;
import poo.exo1.CompteBancaire;

public class TestPoo {

	public static void main(String[] args) {
		// Instanciation
		// NomClasse nomObjet = new Constructeur (...);
		Ecran e1 = new Ecran();
		e1.modele = "Dell";
		e1.prix = 120;
		e1.allumerEteindre();

		Ecran e2 = new Ecran("HP XY", 150);
		e2.etat = Etat.NEUF;

		System.out.println("nbEcrans = " + Ecran.nbEcrans);

		

		// Collections = structures dynamiques (taille variable).
		// package java.util
		// collection générique <T> = collection typée

		// liste vide de CompteB
		Vector<CompteBancaire> listeComptes = new Vector<CompteBancaire>();
		listeComptes.add(new CompteBancaire("BYYY", 100));
		listeComptes.add(new CompteBancaire("AAA", 100));

		System.out.println(listeComptes.get(1).numero);

		// Parcours avec for
		for (int i = 0; i < listeComptes.size(); i++) {
			System.out.println(listeComptes.get(i).affiche());
		}
		// Parcours avec un foreach
		for (CompteBancaire c : listeComptes) {
			System.out.println(c.affiche());
		}

		try {
			CompteBancaire.exportCsv("compte.csv", listeComptes);
			System.out.println("export ok ! ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Vector<CompteBancaire> liste = CompteBancaire.importCsv("comptes.csv");
			System.out.println("line imported ! ");
			for (CompteBancaire compteB : liste) {
				System.out.println(compteB.affiche());

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
