package Resturant.Items;

public class Food {
    private final String fName;
    private int foodQuan;
    private int foodPrice;

    public Food(String string, int n, int n2) {
        this.fName = string;
        this.foodQuan = n;
        this.foodPrice = n2;
    }

    public String getFName() {
        return this.fName;
    }

    public int getQuan() {
        return this.foodQuan;
    }

    public int getPrice() {
        return this.foodPrice;
    }

    public void order(int n) {
        this.foodQuan -= n;
    }
}