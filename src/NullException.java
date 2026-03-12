public class NullException {
    public static void main(String[] args) {
        String a = null;
        try {
            System.out.println(a.length());
        } catch (Exception f) {
            System.out.println("Null has so Length");
        }
    }
}
