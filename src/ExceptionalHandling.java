class ExceptionalHandling {
    public static void main(String[] args) {
        int a = 15;
        int b = 0;
        try {
            int c = a / b;
        }
        catch(Exception f) {
            System.out.println("Infinite number");
        }
    }
}
