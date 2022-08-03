package Resturant;

import Resturant.Items.*;

public class Management {
    private Menue myMenue = new Menue();

    public void placeOrder(String fName, int n) {
        for (int i = 0; i < this.myMenue.getListLength(); ++i) {
            if (!this.myMenue.cAvilable(fName, n).booleanValue()) continue;
            this.myMenue.buy(fName, n);
            return;
        }
    }
}