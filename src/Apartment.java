public class Apartment extends Home implements Payments {

    public Apartment(String country, String residence, String addresses, int family) {
        super(country, residence, addresses, family);
    }

    @Override
    public void service() {
        System.out.println("В месяц 30тысяч");
    }

    @Override
    public String toString() {
        return "Apartment{}"+super.toString();
    }
}
