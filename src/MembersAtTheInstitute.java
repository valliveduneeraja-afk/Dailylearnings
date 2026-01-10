import java.lang.reflect.Member;

class Members {
    String name;
    String from;
}
public class MembersAtTheInstitute {
    public static void main(String[] args) {
        Members m1 = new Members();
        m1.name = "kyathi";
        m1.from = "Kattamanchi";
        Members m2 = new Members();
        m2.name = "Neeraja";
        m2.from = "Telephone Colony";
        Members m3 = new Members();
        m3.name = "Priya";
        m3.from = "Kajoor";
        Members m4 = new Members();
        m4.name = "Salma";
        m4.from = "Mittoor";
        System.out.println(m1.name);
        System.out.println(m1.from);
        System.out.println(m2.name);
        System.out.println(m2.from);
        System.out.println(m3.name);
        System.out.println(m3.from);
        System.out.println(m4.name);
        System.out.println(m4.from);
    }
}
