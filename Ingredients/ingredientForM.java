public class ingredeantForM extends Ingredient {
    private double reqAmountForReci;
//get req amount
    public double setReqAmount(double amount){
        reqAmountForReci = amount;
    }
    public double getReqAmount(){
        return reqAmountForReci;
    }
}