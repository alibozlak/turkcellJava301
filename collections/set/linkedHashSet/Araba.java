package collections.set.linkedHashSet;

class Araba {
    private String plaka;
    private String marka;
    private String model;

    public Araba(String plaka, String marka, String model) {
        this.plaka = plaka;
        this.marka = marka;
        this.model = model;
    }

    public Araba() {
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Plaka : " + plaka + ", Marka : " + marka + ", Model : " + model;
    }

    @Override
    public boolean equals(Object object) {
        Araba car = (Araba) object;
        return this.plaka.equals(car.getPlaka());
    }

    @Override
    public int hashCode() {
        return this.plaka.hashCode();
    }

}
