///class StudentDetail {
///  String name;
/// int Age;
/// StudentDetail(String name,int Age) {
///     this.name = name;
///     this.Age = Age;
///
/// }
/// StudentDetail(StudentDetail other) {
///     this.name = other.name;
///     this.Age = other.Age;
/// }
///}
///StudentDetail s1 = new StudentDetail("Neeraja", 23);
///StudentDetail s2 = new StudentDetail(s1);
///System.out.println(s1.name);
///System.out.println(s2.name);
///System.out.println(s1.Age);
///System.out.println(s2.Age);



class Copy {
    String name;
    int Age;
    String gender;
    Copy(String name, int Age, String gender) {
        this.name = name;
        this.Age = Age;
        this.gender = gender;
    }
    Copy(Copy copyvalue) {
        this.name = copyvalue.name ;
        this.Age = copyvalue.Age;
        this.gender = copyvalue.gender;
    }
}
class CopyCon {
    public static void main(String[] args){
        Copy c1 = new Copy("Neeraja",23,"Female");
        Copy c2 = new Copy(c1);
        System.out.println(c1.name + " " + c1.Age + " " + c1.gender);
        System.out.println(c2.name + " " + c2.Age + " " + c2.gender);
    }
}


























