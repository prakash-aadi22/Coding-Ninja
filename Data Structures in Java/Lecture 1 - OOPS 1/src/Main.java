// class Car {
//    int year;
//    String company_name;
//}

//class Student {
//    int roll_no;
//    String name;
//}

//class Car {
//    String color;
//    double price;
//}

//class Student {
//    private int roll_no;
//    String name;
//}

//class Employee {
//    String name;
//    private int emp_id;
//
//    public void set_id(int id) {
//        if (id > 0)
//            emp_id = id;
//        else
//            System.out.println("Invalid id");
//    }
//
//    public int get_id() {
//        return emp_id;
//    }
//}

//class Shape {
//    int height;
//    int width;
//}

//class Shape {
//    private int height;
//    private int width;
//}

//class Ninja {
//    Ninja(String name) {
//        System.out.println("Constructor one " + name);
//    }
//
//    Ninja(String name, int age) {
//        System.out.println("Constructor two " + name + " " + age);
//    }
//
//    Ninja(long id) {
//        System.out.println("Constructor three " + id);
//    }
//}

//class Box {
//    int width;
//    int height;
//    int length;
//
//    void volume() {
//        System.out.println(length * width * height);
//    }
//}

//class Student {
//    String name;
//    int rollNo;
//
//    Student(int num) {
//        rollNo = num;
//    }
//
//    public void print() {
//        System.out.print(name + " " + rollNo + " ");
//    }
//}

//class Student {
//    String name;
//    int rollNo;
//
//    Student(int num) {
//        rollNo = num;
//    }
//
//    public void print() {
//        System.out.print(name + " " + rollNo + " ");
//    }
//}

//class Student {
//    String name;
//    int rollNo;
//
//    // Constructor 1
//    Student(int num) {
//        rollNo = num;
//        name = "abc";
//    }
//
//    // Constructor 2
//    Student(int num, String str) {
//        rollNo = num;
//        name = str;
//    }
//
//    public void print() {
//        System.out.print(name + " " + rollNo + " ");
//    }
//}

//class Car {
//    static int year;
//    String company_name;
//}

//class Test {
//    int a;
//    int b;
//
//    Test() {
//        this(10, 20);
//        System.out.print("constructor one ");
//    }
//
//    Test(int a, int b) {
//        this.a = a;
//        this.b = b;
//        System.out.print("constructor two ");
//    }
//}

//class Test {
//    static int marks;
//
//    void set_marks(int marks) {
//        this.marks = marks;               //Line 1
//    }
//}

//class Test {
//    static int a = 10;
//    static int b;
//
//    static void fun() {
//        b = a * 4;
//    }
//}

//class Test {
//    static int a = 10;
//    int b = 20;
//
//    static void fun1() {
//        a = 20;                             //Line 1
//        b = 10;                             //Line 2
//        fun2();                             //Line 3
//        System.out.print(this.b);           //Line 4
//    }
//
//    void fun2() {
//        System.out.println("from m2");
//    }
//}

//class Book {
//    final int price = 10;
//}

//class Book {
//    int price;
//    static int count;
//
//    public Book(int price) {
//        this.price = price;
//        count++;
//    }
//}

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        Car c = new Car();        //Line 1
//        year = 2018;              //Line 2
//        c.company_name = "Honda"; //Line 3

//        Student s = new Student();
//        System.out.println(s);


//        Car c = new Car();
        //Figure out the correct statement to set color of the car object referred by c to “white”
//        c.color = "white";
//        System.out.println(c);
//        System.out.println(c.color);

//        Student s = new Student();
//        s.name = "Neha";
//        System.out.println(s.name);

//        Employee e = new Employee();
//        e.set_id(10);
//        System.out.println(e.get_id());


//        Shape s = new Shape();
//        s.height = 1;
//        System.out.println(s.height);

//        Shape s = new Shape();
//        System.out.println(s.height);

//        Ninja geek3 = new Ninja("Dharmesh", 26);

//        Box b = new Box();
//        b.height = 5;
//        b.width = 4;
//        b.volume();

//        Student s = new Student(12);
//        s.print();

//        Student s = new Student();
//        s.rollNo = 15;
//        s.print();

//        Student s1 = new Student(101);
//        s1.print();
//        Student s2 = new Student(150, "xyz");
//        s2.print();

//        Car c = new Car();
//        Car.year = 2018;
//        c.company_name = "KIA";
//        Car d = new Car();
//        System.out.print(d.year);

//        Test object = new Test();

//        Test t = new Test();
//        t.set_marks(78);                //Line 2
//        System.out.print(Test.marks);   //Line 3

//        Test t = new Test();
//        t.fun();
//        System.out.print(Test.a + Test.b);

//        Test.fun1();

//        Book b = new Book();
//        b.price = 16;
//        System.out.println(b.price);

//        System.out.print(Book.count + " ");
//        Book b1 = new Book(500);
//        Book b2 = new Book(600);
//        System.out.println(Book.count);
    }
}


