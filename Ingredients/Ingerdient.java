package Ingredients;
public class Ingredient {
    private final String inName;
    private double inQuantity;
    private double priceOfEachUnit;

    
    public Ingredient(String inName, double inQuantity, double priceOfEachUnit){
        this.inName = inName;
        if(inQuantity > 0){
            this.inQuantity = inQuantity;
        }
        if(priceOfEachUnit > 0){
            this.priceOfEachUnit = priceOfEachUnit;
        }
    }

//unit price
    public void updatePrice(double priceOfEachUnit){
        if(priceOfEachUnit > 0){
            this.priceOfEachUnit = priceOfEachUnit;
        }
    }
    public double getUnitPrice(){
        return priceOfEachUnit;
    }
//ingredeant name
    public void setInName(String inName){
        if(this.inName == null){
            this.inName = inName;
        }
    }
    public String getInName(){
        return inName;
    }
//ingredeant quantity
    public void addQuan(double amount){
        if(amount > 0){
            this.inQuantity += amount;
        }
    }
    public void deductQuan(double amount){
        inQuantity -= amount;
    }
    public double getQuan(){
        return inQuantity;
    }

}