public class Home {
    private String country;
    private String residence;
    private String addresses;
    private int family;

    public Home(String country, String residence, String addresses, int family) {
        this.country = country;
        this.residence = residence;
        this.addresses = addresses;
        this.family = family;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    public String getAddresses() {
        return addresses;
    }

    public void setAddresses(String addresses) {
        this.addresses = addresses;
    }

    public int getFamily() {
        return family;
    }

    public void setFamily(int family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Home{" +
                "country='" + country + '\'' +
                ", residence='" + residence + '\'' +
                ", addresses='" + addresses + '\'' +
                ", family=" + family +
                '}';
    }
}
