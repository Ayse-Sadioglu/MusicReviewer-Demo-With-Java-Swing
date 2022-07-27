package Model;

import java.io.Serializable;

public class Kullanici implements Serializable {
    String nickname;
    String kullanici_ismi;
    String kullanici_soyismi;
    String mail_adresi;
    String sifre;

    public Kullanici(String nickname, String isim, String soyisim, String mail, String sifre) {
        this.nickname = nickname;
        kullanici_ismi = isim;
        kullanici_soyismi = soyisim;
        mail_adresi = mail;
        this.sifre = sifre;
    }

    public String getNickname() {
        return nickname;
    }

    public String getKullaniciIsmi() {
        return kullanici_ismi;
    }

    public String getKullaniciSoyismi() {
        return kullanici_soyismi;
    }

    public String getMailAdresi() {
        return mail_adresi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setNickname(String n) {
        nickname = n;
    }

    public void getKullaniciIsmi(String i) {
        kullanici_ismi = i;
    }

    public void getKullaniciSoyismi(String s) {
        kullanici_soyismi = s;
    }

    public void getMailAdresi(String m) {
        mail_adresi = m;
    }

    public void getSifre(String s) {
        sifre = s;
    }

    public String toString() {
        return nickname + " " + kullanici_ismi + " " + kullanici_soyismi + " " + mail_adresi + " " + sifre;
    }
}
