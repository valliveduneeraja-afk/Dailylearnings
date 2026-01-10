class Zudio {
    String Attire;
    String Type;
    String Discount;
}
public class ZudioOffers {
    public static void main (String[] args) {
        Zudio z1 = new Zudio();
        z1.Attire = "Ethinic";
        z1.Type = "Long Kurthis";
        z1.Discount = "40%";
        Zudio z2 = new Zudio();
        z2.Attire = "Western";
        z2.Type = "Crop Top";
        z2.Discount = "55%";
        Zudio z3 = new Zudio();
        z3.Attire = "IndoWestern";
        z3.Type = "Skirts";
        z3.Discount = "68%";
        System.out.println(z1.Attire);
        System.out.println(z1.Type);
        System.out.println(z1.Discount);
        System.out.println(z2.Attire);
        System.out.println(z2.Type);
        System.out.println(z2.Discount);
        System.out.println(z3.Attire);
        System.out.println(z3.Type);
        System.out.println(z3.Discount);
    }
}
