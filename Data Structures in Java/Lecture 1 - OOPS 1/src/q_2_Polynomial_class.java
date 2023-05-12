import java.util.Scanner;

class Polynomial {

    int[] coefficient = new int[100];
    public void setCoefficient(int degree, int coeff) {
        coefficient[degree] += coeff;

    }

    // Prints all the terms(only terms with non-zero coefficients are to be printed) in increasing order of degree.
    public void print() {
        for (int i = 0; i < coefficient.length; i++) {
            if (coefficient[i] != 0) {
                System.out.print(coefficient[i] + "x" + i + " ");
            }
        }
    }

    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p) {
        for (int i = 0; i < this.coefficient.length; i++) {
            for (int j = 0; j < p.coefficient.length; j++) {
                if (i == j && (this.coefficient[i] != 0 || p.coefficient[j] != 0)) {
                    this.coefficient[i] += p.coefficient[j];
                }
            }
        }
        return this;
    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p) {
        for (int i = 0; i < this.coefficient.length; i++) {
            for (int j = 0; j < p.coefficient.length; j++) {
                if (i == j && (this.coefficient[i] != 0 || p.coefficient[j] != 0)) {
                    this.coefficient[i] -= p.coefficient[j];
                }
            }
        }
        return this;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p) {
        Polynomial a = new Polynomial();
        for (int i = 0; i < this.coefficient.length / 2; i++) {
            for (int j = 0; j < p.coefficient.length / 2; j++) {
                a.coefficient[(i + j)] += this.coefficient[i] * p.coefficient[j];
            }
        }
        return a;
    }
}

public class q_2_Polynomial_class {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] degree1 = new int[n];
        for (int i = 0; i < n; i++) {
            degree1[i] = sc.nextInt();
        }
        int[] coeff1 = new int[n];
        for (int i = 0; i < n; i++) {
            coeff1[i] = sc.nextInt();
        }

        Polynomial first = new Polynomial();
        for (int i = 0; i < n; i++) {
            first.setCoefficient(degree1[i], coeff1[i]);
        }
        n = sc.nextInt();
        int[] degree2 = new int[n];
        for (int i = 0; i < n; i++) {
            degree2[i] = sc.nextInt();
        }
        int[] coeff2 = new int[n];
        for (int i = 0; i < n; i++) {
            coeff2[i] = sc.nextInt();
        }

        Polynomial second = new Polynomial();
        for (int i = 0; i < n; i++) {
            second.setCoefficient(degree2[i], coeff2[i]);
        }
        int choice = sc.nextInt();
        Polynomial result;
        switch (choice) {
            // Add
            case 1 -> {
                result = first.add(second);
                result.print();
            }
            // Subtract
            case 2 -> {
                result = first.subtract(second);
                result.print();
            }
            // Multiply
            case 3 -> {
                result = first.multiply(second);
                result.print();
            }
        }

    }

}
