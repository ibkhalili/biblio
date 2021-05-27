package ma.ensak.view;

import java.sql.SQLException;

import ma.ensak.beans.Etudiant;
import ma.ensak.dao.EtudiantDao;

public class Menu {

	public static void main(String[] args) {
		try {
			menu1();
			menu2();
			menu3();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static public void menu1() throws SQLException {
		System.out.println("menu 1");
		Etudiant e = new Etudiant();
		e.setCin("PB244544");
		e.setFiliere("GI");
		e.setNom("El Khalili");
		e.setPrenom("Ibrahim");
		EtudiantDao eDao = new EtudiantDao();
		eDao.modifier(e);
	}
	static public void menu2() {
		System.out.println("menu 2");
	}
	static public void menu3() {
		System.out.println("menu 3");
	}

}
