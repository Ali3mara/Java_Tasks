import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        nameGen nGen = new nameGen();
        System.out.println("Emter the name:)");
        String n = scan.next();
        nGen.nameGen(n);
    }
}
