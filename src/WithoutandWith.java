class withreturn1 {
    int Adding() {
        return 785;
    }
}
class withoutarguments {
    public static void main(String[] args){
        withreturn1 w = new withreturn1();
        int add = w.Adding();
        System.out.println(add);
    }
}
