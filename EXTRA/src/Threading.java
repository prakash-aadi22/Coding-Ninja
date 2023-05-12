class A1 extends Thread {
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println("\tFrom Thread A: i = " + i);
        }
        System.out.println("Exit From A");
    }

    public void runA() {
        for (int i = 10; i < 16; i++) {
            System.out.println("\tFrom Thread A: i = " + i);
        }
        System.out.println("Exit From A");
    }
}

class B1 extends Thread {
    public void run() {
        for (int i = 20; i < 26; i++) {
            System.out.println("\tFrom Thread B: i = " + i);
        }
        System.out.println("Exit From B");
    }

    public void runB() {
        for (int i = 30; i < 36; i++) {
            System.out.println("\tFrom Thread B: i = " + i);
        }
        System.out.println("Exit From B");
    }
}

class C1 extends Thread {
    public void run() {
        for (int i = 40; i < 46; i++) {
            System.out.println("\tFrom Thread C: i = " + i);
        }
        System.out.println("Exit From C");
    }

    public void runC() {
        for (int i = 50; i < 56; i++) {
            System.out.println("\tFrom Thread C: i = " + i);
        }
        System.out.println("Exit From C");
    }
}

public class Threading {
    public static void main(String[] args) {
//        new A1().run();
//        new B1().run();
//        new C1().run();
        new A1().start(); // 1 - 6
        new B1().start(); // 21 - 26
        new C1().start(); // 41 - 46
        System.out.println("==================================");
        new A1().runA(); // 11 - 16
        new B1().runB(); // 31 - 36
        new C1().runC(); // 51 - 56
    }
}
