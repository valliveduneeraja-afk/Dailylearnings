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




class without {
    void adding(int a, int b) {
        System.out.println(a+b);
    }
}
class with1 {
    public static void main(String[] args) {
        without w = new without();
        w.adding(85,12);
    }
}