public class Hotel extends Home implements Payments {

    public Hotel(String country, String residence, String addresses, int family) {
        super(country, residence, addresses, family);
    }

    @Override
    public void service() {
        System.out.println("US$117 дирхам за ночь ");

    }

    @Override
    public String toString() {
        return "Hotel{}"+super.toString();
    }
}
