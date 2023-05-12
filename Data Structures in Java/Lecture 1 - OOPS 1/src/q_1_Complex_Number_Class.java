import java.util.Scanner;

class ComplexNumbers {
    int real, imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void plus(ComplexNumbers c2) {
        int real = this.real + c2.real;
        int imaginary = this.imaginary + c2.imaginary;
        this.real = real;
        this.imaginary = imaginary;
    }

    public void multiply(ComplexNumbers c2) {
        int real = (this.real * c2.real) - (this.imaginary * c2.imaginary);
        int imaginary = (this.real * c2.imaginary) + (this.imaginary * c2.real);
        this.real = real;
        this.imaginary = imaginary;
    }

    public void print() {
        if (this.real != 0 && this.imaginary != 0) {
            System.out.println(this.real + " + " + " i" + this.imaginary);
        } else if (this.real == 0 && this.imaginary != 0) {
            System.out.println("i" + this.imaginary);
        } else if (this.real != 0) {
            System.out.println(this.real);
        }
    }
}

public class q_1_Complex_Number_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int real1 = sc.nextInt();
        int imaginary1 = sc.nextInt();
        int real2 = sc.nextInt();
        int imaginary2 = sc.nextInt();
        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);
        int choice = sc.nextInt();
        if (choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        } else if (choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        } else {
            return;
        }
    }
}
