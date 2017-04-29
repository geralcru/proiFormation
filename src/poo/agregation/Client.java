package poo.agregation;

public class Client {
	private String nom;
	private Adresse adr;

	public Client() {

	}

	public Client(String nom, Adresse adr) {
		this();
		this.nom = nom;
		this.adr = adr;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdr() {
		return adr;
	}

	public void setAdr(Adresse adr) {
		this.adr = adr;
	}

	public String afficher() {
		return nom + "" + ((adr != null) ? adr.afficher() : "");
	}

}
