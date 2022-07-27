package Sizes;
import Ingredients.*;
public class abstract Small {
    Ingredients items[] = new Ingredients[5];

// add ingredient
    public void addIngredient(Ingredient item){
        for(int i = 0; if i < items.length; i++){
            if(items[i] == null){
                items[i] = item;
            }
        }
    }
    public void storageDeduc(){
        
    }
}