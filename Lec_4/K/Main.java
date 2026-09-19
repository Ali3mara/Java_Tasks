import java.util.Scanner;

public class Main {
    private int a;
    private int b;
    private int c;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Min and Max task, kindly write down 3 numbers: ");
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        System.out.println("1st number = " + A);
        System.out.println("2nd number = " + B);
        System.out.println("3rd number = " + C);

        int Min = findMin(A, B, C);
        System.out.println("The min number is: "+Min);

        int Max = findMax(A, B, C);
        System.out.println("The max number is: "+Max);
    }

    public static int findMin(int A, int B, int C) {
        if(A < B && A < C && B < C){
            return A;
        } else if (B < A && B < C && A < C) {
            return B;
        } else if (C < A && C < B && A < C) {
            return A;
        } else {
            System.out.println("Invalid input: Don't enter same number.");
            return -1;
        }
    }

    public static int findMax(int A, int B, int C) {
        if(A > B && A > C && B > C){
            return A;
        }  else if (B > A && B > C && A > C) {
            return B;
        } else if (C > A && C > B && A > C) {
            return C;
        }  else {
            System.out.println("Invalid input: Don't enter same number.");
            return -1;
        }
    }
}
