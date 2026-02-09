class Thisclass {
    String name;
    String name1;
    void setName(String name,String name1) {
      this.name = name;
      this.name1 = name1;
      System.out.println(name);
    }
}
class Message {
    public static void main(String[] args){
        Thisclass obj = new Thisclass();
        obj.setName("Message", "Execution");
        System.out.println(obj.name + " - " + obj.name1);
    }
}
