class Practicingwith {
    String mrgMsg(String name){
        return name;
    }
}
class withreturnvalue {
    public static void main(String[] args) {
        Practicingwith p = new Practicingwith();
        String msg = p.mrgMsg("Good Morning");
        System.out.println(msg);
    }
}