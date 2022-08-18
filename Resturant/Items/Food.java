package Resturant.Items;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class Food {
    private final String fName;
    private int fQuantity;
    private double fPrice;

    public Food(String fName, int fQuantity, double fPrice){
        this.fName = fName;
        this.fQuantity = fQuantity;
        this.fPrice = fPrice;
    }

    public String getFName(){return fName;}
    public int getQuan(){return fQuantity;}
    public double getPrice(){return fPrice;}

    public void order(int amount){fQuantity -= amount;}
    public void foodINFO(){
        System.out.println(fName + " " + fQuantity + " " + fPrice);
    }
    public void writeFood(BufferedWriter writer){
        try{
            writer.write((fName + "," + String.valueOf(fQuantity) + "," + String.valueOf(fPrice) + "\r\n"));
            //writer.write(String.valueOf(fQuantity));
            //writer.write(String.valueOf(fPrice));
            //writer.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
// public class Food {
//     private final String fName;
//     private int foodQuan;
//     private int foodPrice;

//     public Food(String string, int n, int n2) {
//         this.fName = string;
//         this.foodQuan = n;
//         this.foodPrice = n2;
//     }

//     public String getFName() {
//         return this.fName;
//     }

//     public int getQuan() {
//         return this.foodQuan;
//     }

//     public int getPrice() {
//         return this.foodPrice;
//     }

//     public void order(int n) {
//         this.foodQuan -= n;
//     }
// }