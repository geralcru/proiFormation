package poo.agregation;

public class Adresse {

	private int nom;
	private String rue;
	private String ville;

	public Adresse() {
	}

	public Adresse(int nom, String rue, String ville) throws Exception {
		this();
		setNom(nom);
		setRue(rue);
		setVille(ville);
	}

	public int getNom() {
		return nom;
	}

	public void setNom(int nom) {
		this.nom = nom;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) throws Exception {
		if (ville.length() < 4)
			throw new Exception("ville doit être supérieur à 4 lettres! ");
		this.ville = ville;
	}

	public String afficher() {
		return nom + " " + rue + " " + ville;
	}

}
