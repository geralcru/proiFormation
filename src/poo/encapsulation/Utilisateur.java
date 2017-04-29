package poo.encapsulation;

import java.util.regex.Pattern;

public class Utilisateur {

	private String nom;
	private String email;
	private String motDePasse;

	public Utilisateur() {
	}

	public Utilisateur(String nom, String email, String motDePasse) throws Exception {
		this();
		setNom(nom);
		setEmail(email);
		setMotDePasse(motDePasse);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws Exception {
		// Expression régulière = chaine définissant un format
		// \d{2}-\d{2}, [A-Za-Z], \w, [0..9]
		String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		if (Pattern.matches(regex, email))
			this.email = email;
		else
			throw new Exception("Email invalide");
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) throws Exception {
		if (motDePasse.length() < 6)
			throw new Exception(" Mot de passe doit être super ou égal à 6 chiffres!!");
		this.motDePasse = motDePasse;
	}

}
