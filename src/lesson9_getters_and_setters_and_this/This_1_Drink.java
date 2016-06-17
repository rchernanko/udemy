package lesson9_getters_and_setters_and_this;

public class This_1_Drink {

    private String drinkName;
    private double drinkAlcoholStrength;
    private int drinkAlcoholUnits;
    private double drinkPrice;

    public void setDrinkName(String drinkName){
        this.drinkName = drinkName;
    }

    public String getDrinkName(){
        return drinkName;
    }

    public void setDrinkAlcoholStrength(double drinkAlcoholStrength){
        this.drinkAlcoholStrength = drinkAlcoholStrength;
    }

    public double getDrinkAlcoholStrength(){
        return drinkAlcoholStrength;
    }

    public void setDrinkAlcoholUnits(int drinkAlcoholUnits){
        this.drinkAlcoholUnits = drinkAlcoholUnits;
    }

    public int getDrinkAlcoholUnits(){
        return drinkAlcoholUnits;
    }

    public void setDrinkPrice(double drinkPrice){
        this.drinkPrice = drinkPrice;
    }

    public double getDrinkPrice(){
        return drinkPrice;
    }
}
