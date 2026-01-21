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