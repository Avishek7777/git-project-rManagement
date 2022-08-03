package Resturant.Items;


public class Menue {
    private Food[] items = new Food[5];

    public Menue() {
        this.items[0] = new Food("chicken-grill", 90, 130);
        this.items[1] = new Food("burger", 70, 170);
        this.items[2] = new Food("pizza", 40, 260);
        this.items[3] = new Food("chicken-fried", 120, 90);
        this.items[4] = new Food("fries", 200, 50);
    }

    public int getListLength() {
        return this.items.length;
    }

    public Boolean cAvilable(String fName, int n) {
        for (int i = 0; i < this.items.length; ++i) {
            if (this.items[i].getFName() != fName || this.items[i].getQuan() < n) continue;
            return true;
        }
        return false;
    }

    public void buy(String fName, int n) {
        for (int i = 0; i < this.items.length; ++i) {
            if (this.items[i].getFName() != fName || this.items[i].getQuan() < n) continue;
            this.items[i].order(n);
            System.out.println("Your " + n + " " + fName + " will be ready in a moment");
        }
    }
}