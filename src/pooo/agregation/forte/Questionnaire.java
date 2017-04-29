package pooo.agregation.forte;

import java.util.Vector;

public class Questionnaire {

	private String sujet;
	private Vector<Question> listeQestion;

	public Questionnaire(String sujet) {
		this.sujet = sujet;
		listeQestion = new Vector<Question>();
	}

	public String getSujet() {
		return sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}

	public Vector<Question> getListeQestion() {
		return listeQestion;
	}

	public void setListeQestion(Vector<Question> listeQestion) {
		this.listeQestion = listeQestion;
	}

	public static Questionnaire genererExemple() {
		Questionnaire qcm = new Questionnaire("Java");
		Question q1 = new Question("comment appeler une methode de classe? ");
		q1.getListeReponses().add(new Reponse("NomClasse.methode", true));
		q1.getListeReponses().add(new Reponse("nomObjet.methode", false));
		qcm.getListeQestion().add(q1);
		
		Question q2 = new Question("Comment déclarer une variable ? ");
		q2.getListeReponses().add(new Reponse("nom : type", false));
		q2.getListeReponses().add(new Reponse("$nom ", false));
		q2.getListeReponses().add(new Reponse("type nom", true));
		qcm.getListeQestion().add(q2);
		return qcm;
	}

}
