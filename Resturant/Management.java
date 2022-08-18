package Resturant;

import Resturant.Items.*;

public class Management {
    private Menue myMenue = new Menue();

    public void placeOrder(String fName, int n) {
        myMenue.buy(fName, n);
    }
    public void checkMenue(){
        myMenue.seeFoods();
    }
}