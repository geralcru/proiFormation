package poo.abstraction;

import java.util.Date;

public class Livre extends supportCours {

	public Livre() {

	}

	public Livre(String titre, Date dateEdition) {
		super(titre, dateEdition);

	}

	@Override
	public void imprimer() {
		System.out.println("3impression livre.....");

	}

}
