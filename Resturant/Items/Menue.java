package Resturant.Items;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;


public class Menue {
    private ArrayList<Food> menue = new ArrayList<Food>();
    private double totalSold = 0;

    public Menue(){
        initMenue();
    }
    private void initMenue(){
        try{
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(".//data//menueItems.txt"));
            while((line = reader.readLine()) != null){
                String[] res = line.split("[,]", 0);
                menue.add(new Food(res[0],Integer.parseInt(res[1]),Double.parseDouble(res[2])));                
            }
            reader.close();
        }catch(Exception e){e.printStackTrace();}
    }
    private void saveMenue(){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(".//data//menueItems.txt"));
            for(int i = 0; i < menue.size(); i++){
                menue.get(i).writeFood(writer);
            }
            writer.close();
        }catch(Exception e){e.printStackTrace();}
    }
    private void financesWrite(Food f, int ammount){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(".//data//finances.txt", true));
            writer.write((ammount + " " + f.getFName() + "'s" + " sold worth " + ammount*f.getPrice() + "\r\n"));
            totalSold += (ammount*f.getPrice());
            writer.close();
        }catch(Exception e){e.printStackTrace();}
    }
    public int getListLength() {
        return menue.size();
    }
    public void buy(String fName, int n) {
        for (int i = 0; i < menue.size(); ++i) {
            if (fName.equals(menue.get(i).getFName()) && menue.get(i).getQuan() > n){
                menue.get(i).order(n);
                financesWrite(menue.get(i), n);
                saveMenue();
                System.out.println("order placed");
                return;
            }
        }
        System.out.println("order not available");
    }
    public double getSales(){return totalSold;}
    // public void buy(String fName, int n) {
    //     for (int i = 0; i < menue.size(); ++i) {
    //         if (menue.get(i).getFName() != fName || menue.get(i).getQuan() < n) continue;
    //         menue.get(i).order(n);
    //         saveMenue();
    //         System.out.println("Your " + n + " " + fName + " will be ready in a moment");
    //         break;
    //     }
    //     System.out.println("not available");
    // }  
    public void seeFoods(){
        for(int i = 0; i < menue.size(); i++){
            menue.get(i).foodINFO();
        }
    }  
}