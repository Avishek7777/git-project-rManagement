import Resturant.*;

public class Shop {
    public static void main(String[] arrstring) {
        Management management = new Management();
        management.placeOrder("burger", 5);
        management.placeOrder("burger", 3);
        management.placeOrder("burger", 60);
        management.placeOrder("pizza", 3);
        management.placeOrder("chicken-fried", 6);
    }
}