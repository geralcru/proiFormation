package poo.abstraction;

import java.util.Date;

public abstract class supportCours {
	private String titre;
	private Date dateEdition;

	public supportCours() {
	}

	public supportCours(String titre, Date dateEdition) {
		this();
		this.titre = titre;
		this.dateEdition = dateEdition;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDateEdition() {
		return dateEdition;
	}

	public void setDateEdition(Date dateEdition) {
		this.dateEdition = dateEdition;
	}

	public abstract void imprimer();

}
