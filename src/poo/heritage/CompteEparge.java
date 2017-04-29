package poo.heritage;

import poo.exo1.CompteBancaire;

public class CompteEparge extends CompteBancaire {

	private double taux;

	public CompteEparge() {
		super();
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	

	public CompteEparge(String numero, double solde, double taux) {
		super(numero, solde);
		this.taux = taux;
	}

	@Override
	public void depot(double montant) throws Exception {
		super.depot(montant);
		solde +=  10;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompteEparge [taux=").append(taux).append(", numero=").append(numero).append(", solde=")
				.append(solde).append("]");
		return builder.toString();
	}





}
