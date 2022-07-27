package Controller;

import java.sql.Connection;
//import View.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Kullanici;

public class Controller {

	private static String url = "jdbc:postgresql://localhost:5432/MusicReviewerDB";
	private static String user = "postgres";
	private static String password = "1234";
	Connection connection;
	
	public Controller() {
		try {
			connection = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	System.out.println("PostgreSQL server'a baglanildi.");
	}
	
	//Kayit olma
	public Kullanici girisYap(String nickname,String password) {
		ArrayList<Kullanici> kullanicilar = kayitliKullanicilar();
		Kullanici kullanici = null;
		for(int i=0;i<kullanicilar.size();i++) {
			Kullanici k = kullanicilar.get(i);
			if(k.getNickname().equals(nickname) && k.getSifre().equals(password)) {
				kullanici = k;
				break;
			}
		}
		return kullanici;
	}
	
	public ArrayList<Kullanici> kayitliKullanicilar() {
		ArrayList<Kullanici> kayitli_kullanicilar = new ArrayList<Kullanici>();
        try {
            Statement statement = connection.createStatement();
            ResultSet kullanicilar = statement.executeQuery("SELECT * FROM KULLANICI");
            while (kullanicilar.next()) {
                String nickname;
                String kullanici_ismi;
                String kullanici_soyismi;
                String mail_adresi;
                String sifre;
                nickname = kullanicilar.getString(1);
                kullanici_ismi = kullanicilar.getString(2);
                kullanici_soyismi = kullanicilar.getString(3);
                mail_adresi = kullanicilar.getString(4);
                sifre = kullanicilar.getString(5);

                // baslangicta kayitli olan kullanicilar
                Kullanici kullanici = new Kullanici(nickname, kullanici_ismi, kullanici_soyismi, mail_adresi, sifre);
                kayitli_kullanicilar.add(kullanici);
            }
            statement.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return kayitli_kullanicilar;
	}
	
    public static void main(String[] args) {
        
    }
}
