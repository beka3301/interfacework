public class Main {
    public static void main(String[] args) {
        Apartment apartment = new Apartment("Россия", "Якутск", "Бестужева-Марлинского 3", 5);
        System.out.println(apartment);
        apartment.service();
        Hostel hostel = new Hostel("Япония", "Токио", "Синдзюку", 2);
        System.out.println(hostel);
        hostel.service();
        Hotel hotel = new Hotel("Саудовская Аравия", "Дубай", "Street Barsha Heights, Теком", 3);
        System.out.println(hotel);
        hotel.service();


    }
}