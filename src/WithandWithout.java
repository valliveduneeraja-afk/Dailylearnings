class withoutretun {
    void Adding(int a, int b){
        System.out.println(a+b);
    }
}
class witharguement1 {
    public static void main(String[] args) {
        withoutretun w = new withoutretun();
        w.Adding(95,52);
    }
}