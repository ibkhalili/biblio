
package ma.ensak.dao;

import java.sql.SQLException;
import java.util.List;

import ma.ensak.beans.Livre;

public interface ILivreDao {

	List<Livre> Lister() throws SQLException;
	void ajouter(Livre l);
	void modifier(Livre l);
	void supprimer(Livre l);

}
