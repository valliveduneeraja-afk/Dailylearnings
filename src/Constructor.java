class StudentConstructor {
    String name;
    int age;
    int RollNo;
    StudentConstructor(String s,int a, int r){
        name = s;
        age = a;
        RollNo = r;
    }
}

class Constructor {
    public static void main(String[] args) {
        StudentConstructor s1 = new StudentConstructor("Neeraja", 23, 100);
        StudentConstructor s2 = new StudentConstructor("Kyathi", 24, 101);
        StudentConstructor s3 = new StudentConstructor("Salma", 25, 102);
        StudentConstructor s4 = new StudentConstructor("Priya", 26, 103);

        ///Setting values separately - tedious!
        ///s1.name = "Neeraja";
        ///s1.age = 22;

        ///s2.name = "Priya";
        ///s2.age = 21;

        ///s3.name = "Rahul";
        ///s3.age = 23;

        System.out.println(s1.name + " - " + s1.age + " - " + s1.RollNo);
        System.out.println(s2.name + " - " + s2.age + " - " + s2.RollNo);
        System.out.println(s3.name + " - " + s3.age + " - " + s3.RollNo);
        System.out.println(s4.name + " - " + s3.age + " - " + s4.RollNo);
    }
}
