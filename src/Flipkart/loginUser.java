package Flipkart;

import java.util.Scanner;

class LoginUser {
    public void loginUser(Scanner scan, String registeredEmail, String registeredPassword) {
        System.out.println("                       Login Form");
        System.out.println("                       __________");

        boolean isValid = false;
        do {
            System.out.println("Enter Email address");
            String email = scan.nextLine();
            System.out.println("Enter password");
            String password = scan.nextLine();

            if (email.equals(registeredEmail) && password.equals(registeredPassword)) {
                isValid = true;
                System.out.println("Login successfully completed. Click enter to continue");
            } else {
                System.err.println("Error: Invalid email or password. Please re-enter.");
            }
        } while (!isValid);
    }
}