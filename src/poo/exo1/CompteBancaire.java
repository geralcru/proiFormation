package poo.exo1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class CompteBancaire {
	public String numero;
	public double solde;

	public CompteBancaire() {

	}

	public CompteBancaire(String numero, double solde) {
		this();
		this.numero = numero;
		this.solde = solde;
	}

	public String affiche() {
		return "Compte n° " + numero + "- Solde" + solde;
	}

	public void depot(double montant) throws Exception {
		if (montant < 0)
			throw new Exception("Monant incorrect !");
		else
			solde += montant;
	}

	public void retrait(double montant) throws Exception {
		if (montant < 0)
			throw new Exception("Monant incorrect !");
		else
			solde -= montant;
	}

	// Méthode qui exporte dans un fichier csv une liste de CompteB
	public static void exportCsv(String cheminFichier, Vector<CompteBancaire> listeC) throws IOException {
		BufferedWriter fw = new BufferedWriter(new FileWriter(cheminFichier));
		fw.write("Numéro;Solde");
		fw.newLine();
		for (CompteBancaire cb : listeC) {
			fw.write(cb.numero + ";" + cb.solde);
			fw.newLine();
		}
		fw.close();
	}

	public static Vector<CompteBancaire> importCsv(String cheminFichier) throws Exception {
		Vector<CompteBancaire> lc = new Vector<>();
		// BufferedReader
		BufferedReader rd = new BufferedReader(new FileReader(cheminFichier));
		String line = null;
		while ((line = rd.readLine()) != null) {
			if (!line.trim().isEmpty()) {
				String[] tab = line.split(";");
				try {
					lc.add(new CompteBancaire(tab[0], Double.parseDouble(tab[1])));
				} catch (Exception e) {
					System.err.println(" lines ignore !! " + line);
				}
			}
			;

		}
		// FileReader
		// méthode readLine permet de lire une ligne
		// pour découper un String par rapport au délimiteur Split

		rd.close();
		return lc;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompteBancaire other = (CompteBancaire) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

}
