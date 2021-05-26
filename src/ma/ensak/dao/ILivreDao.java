package ma.ensak.dao;

import ma.ensak.beans.Livre;

public interface ILivreDao {

	Livre []Lister();
	void ajouter(Livre l);
	void modifier(Livre l);
	void supprimer(Livre l);

}
