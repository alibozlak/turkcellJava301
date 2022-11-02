package collections.set.treeSet;

class City implements Comparable<City> {
    private String plakaNo;
    private String name;

    public City() {
    }

    public City(String plakaNo, String name) {
        this.plakaNo = plakaNo;
        this.name = name;
    }

    public String getPlakaNo() {
        return plakaNo;
    }

    public void setPlakaNo(String plakaNo) {
        this.plakaNo = plakaNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Plaka Kodu : " + plakaNo + ", İsim : " + name;
    }

    @Override
    public int compareTo(City o) {
        return this.name.compareTo(o.getName());
    }

}
