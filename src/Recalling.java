/// Creating class $ Object

/// class Recall{
///   String name;
/// int Age;
/// float marks;
///}
///class Recalling {
/// public static void main(String[] args){
///     Recall v1 = new Recall();
///     v1.name = "Neeraja";
///     v1.Age = 23;
///     v1.marks = 50;
///     Recall v2 = new Recall();
///     v2.name = "Kyathi";
///     v2.Age = 24;
///     v2.marks = 70;
///     Recall v3 = new Recall();
///     v3.name = "Priya";
///     v3.Age = 25;
///     v3.marks = 80;
///     System.out.println(v1.name + " " + v1.Age + " " + v1.marks);
///     System.out.println(v2.name + " " + v2.Age + " " + v2.marks);
///     System.out.println(v3.name + " " + v3.Age + " " + v3.marks);
        ///System.out.println(v1.name);
        ///System.out.println(v1.Age);
        ///System.out.println(v1.marks);
        ///System.out.println(v2.name);
        ///System.out.println(v2.Age);
        ///System.out.println(v2.marks);
        ///System.out.println(v3.name);
        ///System.out.println(v3.Age);
        ///System.out.println(v3.marks);
///   }
///}



///Constructors

/// class Con {
///   String name;
/// int age;
/// String Gender;
/// Con (String a,int b, String c) {
///     name = a;
///     age = b;
///     Gender = c;
/// }
///}
///class Construktors {
/// public static void main(String[] args) {
///     Con o1 = new Con("Neeraja", 23, "Female");
///     Con o2 = new Con("Kyathi", 24, "Female");
///     Con o3 = new Con("Manoj", 30, "Male");
///     Con o4 = new Con("Priya", 25, "Female");
///     Con o5 = new Con("Salma", 24, "Female");
///     System.out.println(o1.name + " " + o1.age + " " + o1.Gender);
///     System.out.println(o2.name + " " + o2.age + " " + o2.Gender);
///     System.out.println(o3.name + " " + o3.age + " " + o3.Gender);
///     System.out.println(o4.name + " " + o4.age + " " + o4.Gender);
///     System.out.println(o5.name + " " + o5.age + " " + o5.Gender);
/// }
/// }



///  Arguements and return type


/// without args and without ret

///class WithoutArgs {
///    void msg(){
///     System.out.println("Without Arguments and without return type");
/// }
///}
///class withoutret {
/// public static void main(String[] args) {
///     WithoutArgs v1 = new WithoutArgs();
///     v1.msg();
/// }
///}



///  with parameter without return type



/// class WithPar {
/// void message(String msg) {
///     System.out.println(msg);
/// }
///}
///class Withoutret {
/// public static void main(String[] args) {
///     WithPar v1 = new WithPar();
///     v1.message("With arguments and without return type");
/// }
///}



///  without parameters with return value


///class WithoutParams {
///    String message() {
///     return "Wthout parameters With return value";
/// }
///}
///class WithRet {
/// public static void main(String[] args) {
///     WithoutParams v1 = new WithoutParams();
///     String msg = v1.message();
///     System.out.println(msg);
/// }
///}



///  With parameters with return type


///class Withparams {
///   String message(String msg) {
///     return msg;
/// }
///}
///class Withret {
/// public static void main(String[] args){
///     Withparams v1 = new Withparams();
///     String a = v1.message("With parameters With return type");
///     System.out.println(a);
/// }
///}




/// Methods calling and defining



 class methad {
    public static void main(String[] args) {
        String name;
        System.out.println("Welcome to compiler");
        Adding();
        Subtraction();
    }

    public static void Adding() {
        int a = 13, b = 17;
        System.out.println(a+b);
    }
    public static void Subtraction(){
        int a = 223, b = 85;
        System.out.println(a-b);
    }
}
























