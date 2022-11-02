package java8.functionalInterface2;

import java.io.Serializable;

public class Urun implements Serializable {

    private int id;
    private String adi;
    private double fiyat;

    public Urun(int id, String adi, double fiyat) {
        this.id = id;
        this.adi = adi;
        this.fiyat = fiyat;
    }

    public Urun() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object object) {
        Urun urun = (Urun) object;
        return this.id == urun.getId();
    }

    @Override
    public String toString() {
        return "ID : " + id + ", Ad : " + adi + ", Fiyat : " + fiyat;
    }

}
