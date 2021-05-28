package ma.ensak.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ma.ensak.beans.Emprunt;

public class EmpruntDao implements IEmpruntDao {
	
   static Connection con = ConnexionDB.getConnection();	

	@Override
	public List<Emprunt> Lister() throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from emprunt";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        List<Emprunt> ls = new ArrayList<Emprunt>();
  
        while (rs.next()) {
        	Emprunt emp = new Emprunt();
            emp.setNumero_livre(rs.getInt("numero_livre"));
			emp.setCin_etudiant(rs.getString("cin_etudiant"));
            emp.setDate(rs.getDate("date"));
            emp.setRemis_le(rs.getDate("remis_le"));
            ls.add(emp);
        }
        return ls;
	}

	@Override
	public void ajouter(Emprunt emp) throws SQLException {
		// TODO Auto-generated method stub
		String query = "insert into emprunt(numero_livre, cin_etudiant, date) VALUES (?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, emp.getNumero_livre().intValue());
		ps.setString(2, emp.getCin_etudiant());
		ps.setDate(3, new Date(emp.getDate().getTime()));
		ps.executeUpdate(); 
		
	}

	@Override
	public void modifier(Emprunt emp) throws SQLException {
		// TODO Auto-generated method stub
		String query = "update emprunt set numero_livre=?, cin_etudiant=?, date=?, remis_le=? where numero=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, emp.getNumero_livre().intValue());
		ps.setString(2, emp.getCin_etudiant());
		ps.setDate(3, new Date(emp.getDate().getTime()));
		ps.setDate(4, new Date(emp.getRemis_le().getTime()));
		ps.setInt(5,emp.getNumero().intValue());
		ps.executeUpdate(); 
	}

	public void supprimer(Number numero) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from emprunt where numero=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, numero.intValue());
		ps.executeUpdate();
	}

}
