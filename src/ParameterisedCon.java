///class Student1 {
///  String name;
/// int Age;
///}
///Student1 s1 = new Student1();
///s1.name = "Neeraja";
///s1.Age = 16;




///class Student1 {
/// String name;
/// int Age;
/// int Rollno;
/// Student1 (String name) {
///     this.name = name;
///  }
/// Student1 (int Age) {
///     this.Age = Age;
/// }
/// Student1 (int Rollno) {
///     this.Rollno = Rollno;
/// }
/// Student1(String name, int Age,int Rollno) {
///     this.name = name;
///     this.Age = Age;
///     this.Rollno = Rollno;
/// }
///}
///Student1 s1 = new Student1("Neeraja");
///Student1 s2 = new Student1(23);
///Student1 s3 = new Student1(100);
///Student1 s4 = new Student1("Neeraja", 23, 1001);

///System.out.println(s1.name);
///System.out.println(s1.Age);



class Parameterized {
    String name;
    int age;
    String gender;

    Parameterized(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
    class Parameterized1 {
        public static void main(String[] args) {
            Parameterized p1 = new Parameterized("Neeraja", 23, "Female");
            Parameterized p2 = new Parameterized("Kytahi", 24, "Female");
            Parameterized p3 = new Parameterized("Priya", 25, "Female");
            Parameterized p4 = new Parameterized("Salma", 24, "Female");

            System.out.println(p1.name + " " + p1.age + " " + p1.gender);
            System.out.println(p2.name + " " + p2.age + " " + p2.gender);
            System.out.println(p3.name + " " + p3.age + " " + p3.gender);
            System.out.println(p4.name + " " + p4.age + " " + p4.gender);
        }
    }







































