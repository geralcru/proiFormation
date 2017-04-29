package poo;

public class Ecran {

	// attributs _________________________________
	// visibilité type nonAttributs;
	public String modele;
	public double prix;
	public boolean estAllume;
	public static int nbEcrans;

	// constructeurs_______
	// visibilité NomClasse (...) {....}
	public enum Etat {
		NEUF, OCASSION;

	}

	public Etat etat;

	public Ecran() {
		etat = Etat.NEUF;
		nbEcrans++;
	}

	public Ecran(String modele, double p) {
		this();
		// this : mot clé faisant réf à l'attribut de l'objet
		this.modele = modele;
		prix = p;
	}

	public Ecran(String modele, double prix, boolean estAllume, Etat etat) {
		this(modele, prix);
		this.estAllume = estAllume;
		this.etat = etat;
	}

	// Methodes _________________________
	public void allumerEteindre() {
		estAllume = !estAllume;
	}

	public static void raz() {
		nbEcrans = 0;
	}
}
