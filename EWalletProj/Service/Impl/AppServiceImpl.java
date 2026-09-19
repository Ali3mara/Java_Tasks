package Service.Impl;

import EWalletProj.Model.Account;
import EWalletProj.Service.AppService;
import EWalletProj.Service.*;

import java.util.Scanner;

public class AppServiceImpl implements AppService {

    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("=== EmaraWallet ===");
            System.out.println("1. Sign Up");
            System.out.println("2. Log In");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    //Sign Up
                    System.out.println("Sign Up selected.");
                    System.out.println("=== Sign Up ===");

                    System.out.print("Full Name: ");
                    String fullName = scanner.nextLine();

                    System.out.print("Username: ");
                    String userName = scanner.nextLine();

                    System.out.print("Password: ");
                    String password = scanner.nextLine();

                    System.out.print("Phone Number: ");
                    String phoneNumber = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = Integer.parseInt(scanner.nextLine());

                    Account account = new Account(fullName, userName, password, phoneNumber, age);

                    break;
                case 2:
                    // Log In logic goes here
                    System.out.println("Log In selected.");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }

        scanner.close();
    }
}