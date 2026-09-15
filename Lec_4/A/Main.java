import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        nameGen nGen = new nameGen();
        System.out.println("Enter the name: ");
        String n = scan.next();
        nGen.nameGen(n);
    }
}
