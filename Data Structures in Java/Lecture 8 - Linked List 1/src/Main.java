//import java.util.ArrayList;

// 1
//class Node<T> {
//    T data;
//    Node<T> next;
//
//    Node(T data) {
//        this.data = data;
//    }
//}

//2
//class Node<T> {
//    T data;
//    Node<T> next;
//    Node(T data) {
//        this.data = data;
//    }
//}

//3
//class Node<T> {
//    T data;
//    Node<T> next;
//
//    Node(T data) {
//        this.data = data;
//    }
//}

public class Main {

    // 1
//    public static void print(Node<Integer> head) {
//        Node<Integer> temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }

    //2
//    public static void print(Node<Integer> head) {
//        Node<Integer> temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }

    //3
//    public static void print(Node<Integer> head) {
//        Node<Integer> temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//
//    public static void increment(Node<Integer> head) {
//        Node<Integer> temp = head;
//        while (temp != null) {
//            temp.data++;
//            temp = temp.next;
//        }
//    }

    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        ArrayList<String> list = new ArrayList<String>();
//        list.add("apple");
//        list.add("banana");
//        list.add("carrot");
//        list.add(0, "mango");
//        System.out.println(list);

//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Ant");
//        list.add("Bat");
//        list.add("Car");
//        list.add("Door");
//        list.add("Euro");
//        System.out.println(list);
////        list[2] = "Bus";
////        list.add("Bus", list.indexOf("Car"));
//        list.set(2, "Bus");
////        list.set("Bus", "Car");
//        System.out.println(list);

        // 1
//        Node<Integer> node1 = new Node<Integer>(10);
//        Node<Integer> node2 = new Node<Integer>(20);
//        node2.next = node1;
//        print(node2);

        //2
//        Node<Integer> node1 = new Node<Integer>(10);
//        Node<Integer> node2 = new Node<Integer>(20);
//        Node<Integer> node3 = new Node<Integer>(30);
//        Node<Integer> node4 = new Node<Integer>(40);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        print(node2);

        //3
//        Node<Integer> node1 = new Node<Integer>(10);
//        Node<Integer> node2 = new Node<Integer>(20);
//        node1.next = node2;
//        increment(node1);
//        print(node1);
    }
}
