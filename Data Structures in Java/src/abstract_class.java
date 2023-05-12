abstract class ABC {
    int value;
    abstract int do_something();
}

class add extends ABC {
    int do_something() {
        return value + 42;
    }
}

public class abstract_class {
    public static void main(String[] args) {
        add x = new add();
        x.value = 10;
        System.out.println(x.do_something());
    }
}
