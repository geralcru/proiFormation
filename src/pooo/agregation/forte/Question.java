package pooo.agregation.forte;

import java.util.Vector;

public class Question {

	private String enonce;
	private Vector<Reponse> listeReponses;

	public Question(String enonce) {
		this.enonce = enonce;
		listeReponses = new Vector<>();
	}

	public String getEnonce() {
		return enonce;
	}

	public void setEnonce(String enonce) {
		this.enonce = enonce;
	}

	public Vector<Reponse> getListeReponses() {
		return listeReponses;
	}

	public void setListeReponses(Vector<Reponse> listeReponses) {
		this.listeReponses = listeReponses;
	}

}
