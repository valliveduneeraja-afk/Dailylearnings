class withreturn {
    int Adding(int a, int b){
        return a+b;
    }
}
class witharguement {
    public static void main (String[] args) {
        withreturn w = new withreturn();
        int add = w.Adding(45,85);
        System.out.println(add);
    }
}


class with {
    int addition(int a, int b) {
        return a+b;
    }
}
class withA{
    public static void main(String[] args) {
        with w =  new with();
        int add = w.addition(89,54);
        System.out.println(add);
    }
}
