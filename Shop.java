import Resturant.*;
import java.util.Scanner;

public class Shop {
    public static void main(String[] arrstring) {
        Scanner scan = new Scanner(System.in);
        Management management = new Management();
        String name;
        int quantity;

        System.out.println("Welcome to the shop heres the menue:");
        management.checkMenue();
        System.out.println("What would you like to order?");
        name = scan.nextLine();
        System.out.println("enter the quantity");
        quantity = scan.nextInt();
        management.placeOrder(name, quantity);
    }
}