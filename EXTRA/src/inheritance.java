class A {
    public void run1() {
        System.out.println("1");
    }
}

class B {
    public void run2() {
        System.out.println("2");
    }
}

class C extends B {
    public void run3() {
        System.out.println("3");
    }
}

class D extends C {
    public void run4() {
        System.out.println("4");
    }
}

public class inheritance {
    public static void main(String[] args) {
        C c = new C();
        c.run3();
        c.run2();
        System.out.println("====================");
        D d = new D();
        d.run4();
        d.run3();
        d.run2();
    }
}
