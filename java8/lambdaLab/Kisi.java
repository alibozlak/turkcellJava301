package java8.lambdaLab;

import java.io.Serializable;
import java.time.LocalDate;

public class Kisi implements Serializable {

    public enum Cinsiyet {
        ERKEK, KADIN
    }

    private String isim;
    private LocalDate dogumTarihi;
    private String emailAdresi;
    private Cinsiyet cinsiyet;

    public Kisi(String isim, LocalDate dogumTarihi, String emailAdresi, Cinsiyet cinsiyet) {
        this.isim = isim;
        this.dogumTarihi = dogumTarihi;
        this.emailAdresi = emailAdresi;
        this.cinsiyet = cinsiyet;
    }

    public Kisi() {
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(LocalDate dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getEmailAdresi() {
        return emailAdresi;
    }

    public void setEmailAdresi(String emailAdresi) {
        this.emailAdresi = emailAdresi;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getYas() {
        return LocalDate.now().getYear() - this.getDogumTarihi().getYear();
    }

    @Override
    public int hashCode() {
        return this.emailAdresi.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        Kisi kisi = (Kisi) object;
        return this.emailAdresi.equals(kisi.getEmailAdresi());
    }

    @Override
    public String toString() {
        return "İsim : " + isim + ", Doğum Tarihi : " + dogumTarihi + ", Email : " + emailAdresi + 
        ", Cinsiyet : " + cinsiyet;
    }

}
