package ma.ensak.dao;

import ma.ensak.beans.Emprunt;

public interface IEmpruntDao {

	Emprunt []Lister();
	void ajouter(Emprunt e);
	void modifier(Emprunt e);
	void supprimer(Emprunt e);

}
