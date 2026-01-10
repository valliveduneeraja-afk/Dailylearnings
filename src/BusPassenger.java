class Passenger {
    String name;
    String num;
    String boarding;
    String destination;
}
public class BusPassenger {
    public static void main(String[] args) {
        Passenger b1 = new Passenger();
        b1.name = "Neeraja";
        b1.num = "9642817254";
        b1.boarding = "Tirupati";
        b1.destination = "Kammam";
        Passenger b2 = new Passenger();
        b2.name = "Shalu";
        b2.num = "6302851077";
        b2.boarding = "Hyderabad";
        b2.destination = "Ongole";
        System.out.println(b1.name);
        System.out.println(b1.num);
        System.out.println(b1.boarding);
        System.out.println(b1.destination);
        System.out.println(b2.name);
        System.out.println(b2.num);
        System.out.println(b2.boarding);
        System.out.println(b2.destination);


    }
}