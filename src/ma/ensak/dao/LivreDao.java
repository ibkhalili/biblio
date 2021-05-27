package ma.ensak.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ma.ensak.beans.Livre;

public class LivreDao implements ILivreDao {

	static Connection con = ConnexionDB.getConnection();

	@Override
	public List<Livre> Lister() throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from livre";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Livre> ls = new ArrayList<Livre>();
  
        while (rs.next()) {
        	Livre l = new Livre();
            l.setNumero(rs.getInt("numero"));
			l.setStock(rs.getInt("stock"));
            l.setTitre(rs.getString("titre"));
            l.setDate_apparition(rs.getDate("date_apparition"));
            l.setNumero_edition(rs.getString("numero_edition"));
            ls.add(l);
        }
        return ls;
	}

	@Override
	public void ajouter(Livre l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifier(Livre l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimer(Livre l) {
		// TODO Auto-generated method stub
		
	}

}
