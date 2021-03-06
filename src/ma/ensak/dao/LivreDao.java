package ma.ensak.dao;

import java.sql.Connection;
import java.sql.Date;
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

	public void ajouter(Livre l) throws SQLException {
		// TODO Auto-generated method stub
	
	 String query = "insert into livre(titre, date_apparition, numero_edition, stock) VALUES (?, ?, ?, ?)";
	 PreparedStatement ps = con.prepareStatement(query);
	 ps.setString(1, l.getTitre());
	 ps.setDate(2, new Date(l.getDate_apparition().getTime()));
	 ps.setString(3, l.getNumero_edition());
	 ps.setInt(4, l.getStock().intValue());
	 ps.executeUpdate(); // maybe we want to check the return value
		
	}
	@Override
	public void modifier(Livre l) throws SQLException {
		// TODO Auto-generated method stub
		String query = "update livre set titre=?, date_apparition=?, numero_edition=?, stock=? where numero=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, l.getTitre());
		ps.setDate(2, new Date(l.getDate_apparition().getTime()));
		ps.setString(3, l.getNumero_edition());
		ps.setInt(4, l.getStock().intValue());
		ps.setInt(5, l.getNumero().intValue());
		ps.executeUpdate();
		
	}

	@Override
	public void supprimer(Number numero) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from livre where numero=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, numero.intValue());
		ps.executeUpdate();
		
	}

}
