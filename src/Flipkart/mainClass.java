package Flipkart;

import java.util.Scanner;

class mainClass{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("                 WELCOME TO FLIPKART             ");
        System.out.println("");

        String registeredEmail = "";
        String registeredPassword = "";
        String registeredAddress = "";
        String registeredFirstName = "";
        String registeredLastName = "";

        RegisterUser register = new RegisterUser();
        boolean success = false;
        while (!success) {
            success = register.registerUser(scan);
            if (!success) {
                System.err.println("Error: Password and confirm password do not match. Please try again.");
            } else {
                registeredEmail = register.getEmail();
                registeredPassword = register.getPassword();
                registeredAddress = register.getAddress();
                registeredFirstName = register.getFirstName();
                registeredLastName = register.getLastName();
                System.out.println("Your registration was successfully completed. Click enter to continue");
                scan.nextLine(); // Wait for user to press enter
            }
        }

        System.out.println("");
        System.out.println("Press enter to continue to the login form.");
        System.out.println(".........................");
        scan.nextLine();

        LoginUser login = new LoginUser();
        login.loginUser(scan, registeredEmail, registeredPassword);

        System.out.println("");
        System.out.println("☰Flipkart                                                                                                        Grocery             🛒MyCart    ");

        currentUser.setAddress(registeredAddress);
        currentUser.setFirstName(registeredFirstName);
        currentUser.setLastName(registeredLastName);

        boolean exit = false;
        while (!exit) {
            System.out.println();
            System.out.println("1. View Profile🔻            2. Browse Products🔻               3. View Wishlist🔻              4. View Shopping Cart🔻          5. Logout🔻");
            System.out.println("");
            System.out.print("Choose an option: ");

            int option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    currentUser.viewProfile();
                    break;
                case 2:
                    currentUser.browseProducts();
                    break;
                case 3:
                    currentUser.viewWishlist();
                    break;
                case 4:
                    currentUser.viewShoppingCart();
                    break;
                case 5:
                    exit = true;
                    System.out.println("                                          \u001B[32mLogout successful\u001B[0m         ");
                    break;
                default:
                    System.err.println("Invalid option. Please try again.");
                    break;
            }
        }

        scan.close();
    }
}