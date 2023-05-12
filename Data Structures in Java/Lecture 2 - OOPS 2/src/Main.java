//class Vehicle {
//    void print_V() {
//        System.out.print("Vehicle class ");
//    }
//}
//
//class Car extends Vehicle {
//    void print_C() {
//        System.out.print("Car class ");
//    }
//}

//class Vehicle {
//    String color;
//    private int id;
//}

//class Vehicle {
//    private Vehicle() {
//        System.out.println("constructor of Vehicle");
//    }
//}

//class Vehicle {
//    void print() {
//        System.out.print("Vehicle class");
//    }
//}
//
//class Car extends Vehicle {
//    void print() {
//        System.out.print("Car class");
//    }
//}

//class Vehicle {
//    String colour;
//    private int number;
//}
//
//class Car extends Vehicle {
//    public static void main(String[] args) {
//        Vehicle v = new Vehicle();
//        v.colour = "black";
//        v.number = 8486;
//        System.out.println(v.number + " " + v.colour);
//    }
//}

//class Vehicle {
//    String colour;
//    private int number;
//
//    void set(int number) {
//        number = number;
//    }
//
//    int get() {
//        return number;
//    }
//}
//
//class Car extends Vehicle {
//    public static void main(String[] args) {
//        Vehicle v = new Vehicle();
//        v.colour = "white";
//        v.set(1010);
//        System.out.println(v.colour + " " + v.get());
//    }
//}

//class Vehicle {
//    int maxSpeed = 120;
//}
//
//class Car extends Vehicle {
//    int maxSpeed = 180;
//
//    void display() {
//        System.out.println(super.maxSpeed);
//    }
//}

//class Person {
//    void fun() {
//        System.out.print("person class");
//    }
//}
//
//class Student extends Person {
//    void fun() {
//        System.out.print("student class");
//    }
//
//    void display() {
//        fun();
//        super.fun();
//    }
//}

//class Vehicle {
//    public void Print() {
//        System.out.print("Vehicle's Print() ");
//    }
//}
//
//class FourWheelers extends Vehicle {
//    public void Print() {
//        System.out.print("FourWheelers's Print() ");
//    }
//}
//
//class Car extends FourWheelers {
//    public void Print() {
//        super.Print();
//        System.out.print("Car's Print()");
//    }
//}

//class Vehicle {
//    int seats;
//    int speed;
//
//    public Vehicle(int seats, int speed) {
//        System.out.print("Vehicle ");
//        this.seats = seats;
//        this.speed = speed;
//    }
//}
//
//class Car extends Vehicle {
//    int id;
//
//    Car() {
//        System.out.print("Car ");
//    }
//}

//class Car {
//    private int seats;
//    private int speed;
//
//    public Car() {
//        System.out.print("This Is Car ");
//    }
//}
//
//class Audi extends Car {
//    Audi() {
//        System.out.print("This Is Audi ");
//        super();
//    }
//}

//class Car {
//    private int seats;
//    private int speed;
//
//    public Car(int seats, int speed) {
//        this.seats = seats;
//        this.speed = speed;
//        System.out.print("This Is Car ");
//    }
//}
//
//class Audi extends Car {
//    Audi(int x, int y) {
//        super(x, y);
//        System.out.print("This Is Para Audi ");
//    }
//
//    void Audi() {
//        System.out.print("This Is Def Audi");
//    }
//}

//class Vehicle {
//    String colour;
//    private int number;
//
//    void print() {
//        System.out.println("vehicle");
//    }
//}
//
//class Car extends Vehicle {
//    void print() {
//        System.out.println("car");
//    }
//}
//
//class Honda extends Car {
//    void print() {
//        System.out.println("Honda");
//    }
//}

//class Vehicle {
//    void print() {
//        System.out.print("Vehicle class");
//    }
//}
//
//class Car extends Vehicle {
//    void print() {
//        System.out.print("Car class ");
//    }
//}

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        Car obj1 = new Car();
//        obj1.print_C();
//        obj1.print_V();

//        Vehicle v = new Vehicle();
//        v.color = "white";
//        v.id = 101;
//        System.out.println(v.color + " " + v.id);

//        Vehicle v = new Vehicle();

//        Car obj1 = new Car();
//        obj1.print();
//        Vehicle obj2 = new Vehicle();
//        obj2.print();

//        Car c = new Car();
//        c.display();

//        Student s = new Student();
//        s.display();

//        Car c = new Car();
//        c.Print();

//        Car c = new Car();

//        Audi a = new Audi();

//        Audi a = new Audi(5, 7);
//        a.Audi();

//        Car c = new Honda();
//        c.print();

//        Vehicle obj1 = new Car();
//        obj1.print();
//        Vehicle obj2 = new Vehicle();
//        obj2.print();
    }
}
