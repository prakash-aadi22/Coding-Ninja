import java.util.Scanner;

public class q_8_Tower_of_Hanoi {

    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        if (disks == 1) {
            System.out.println(source + " " + destination);
        } else if (disks == 0) {
            System.out.println();
        } else {
            towerOfHanoi(disks - 1, source, destination, auxiliary);
            System.out.println(source + " " + destination);
            towerOfHanoi(disks - 1, auxiliary, source, destination);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerOfHanoi(n, 'a', 'b', 'c');
    }

}
