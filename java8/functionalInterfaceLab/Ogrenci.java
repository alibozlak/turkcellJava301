package java8.functionalInterfaceLab;

import java.io.Serializable;

class Ogrenci implements Serializable {
    private int id;
    private String ad;
    private int notOrtalamasi;

    public Ogrenci() {
    }

    public Ogrenci(int id, String ad, int notOrtalamasi) {
        this.id = id;
        this.ad = ad;
        this.notOrtalamasi = notOrtalamasi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getNotOrtalamasi() {
        return notOrtalamasi;
    }

    public void setNotOrtalamasi(int notOrtalamasi) {
        this.notOrtalamasi = notOrtalamasi;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override 
    public boolean equals(Object object) {
        Ogrenci ogrenci = (Ogrenci) object;
        return this.getId() == ogrenci.getId();
    }

    @Override
    public String toString() {
        return "ID : " + id + ", Ad : " + ad + ", Not ortalaması : " + notOrtalamasi;
    }

}
