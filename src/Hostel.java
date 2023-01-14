public class Hostel extends Home implements Payments {

    public Hostel(String country, String residence, String addresses, int family) {
        super(country, residence, addresses, family);
    }

    @Override
    public void service() {
        System.out.println("¥101,200ейн двухместная за 4 недели ");
    }

    @Override
    public String toString() {
        return "Hostel{}"+super.toString();
    }
}
