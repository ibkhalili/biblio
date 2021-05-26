package ma.ensak.beans;

import java.util.Date;

public class Emprunt {

	private Number numero_livre;
	private String cin_etudiant;
	private Date date;

	public Emprunt(Number numero_livre, String cin_etudiant, Date date) {
		super();
		this.numero_livre = numero_livre;
		this.cin_etudiant = cin_etudiant;
		this.date = date;
	}

	public Number getNumero_livre() {
		return numero_livre;
	}
	public String getCin_etudiant() {
		return cin_etudiant;
	}
	public Date getDate() {
		return date;
	}
	public void setNumero_livre(Number numero_livre) {
		this.numero_livre = numero_livre;
	}
	public void setCin_etudiant(String cin_etudiant) {
		this.cin_etudiant = cin_etudiant;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
