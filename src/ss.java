class Name {
    String name;
    int age;
    float weight;
    Name(String n, int a, float w) {
        name = n;
        age = a;
        weight = w;
    }
}
class ss {
    public static void main(String[] args) {
        Name n1 = new Name("Neeraja", 23, 53);
        Name n2 = new Name("kyathi", 24,50);
        Name n3 = new Name("Prriya",25, 55);
        Name n4 = new Name("Salma",25, 52);

        System.out.println(n1.name + " - " + n1.age + " - " + n1.weight);
        System.out.println(n2.name + " - " + n2.age + " - " + n2.weight);
        System.out.println(n3.name + " - " + n3.age + " - " + n3.weight);
        System.out.println(n4.name + " - " + n4.age + " - " + n4.weight);


    }
}