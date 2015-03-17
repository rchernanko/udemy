public class This_2_Drinks {

    public static void main(String[] args){

        This_1_Drink drink1 = new This_1_Drink();
        This_1_Drink drink2 = new This_1_Drink();

        drink1.setDrinkName("Carling");
        drink1.setDrinkAlcoholStrength(5.1);
        drink1.setDrinkAlcoholUnits(3);
        drink1.setDrinkPrice(3.50);

        System.out.println("Drink 1 is : " + drink1.getDrinkName());
        System.out.println("It's strength is " + drink1.getDrinkAlcoholStrength());
        System.out.println(drink1.getDrinkName() + " has " + drink1.getDrinkAlcoholUnits() + " units");
        System.out.println("The average price for " + drink1.getDrinkName() + " is roughly " + drink1.getDrinkPrice());

        drink2.setDrinkName("Guinness");
        drink2.setDrinkAlcoholStrength(4.2);
        drink2.setDrinkAlcoholUnits(4);
        drink2.setDrinkPrice(3.75);

        System.out.println(drink2.getDrinkName());
        System.out.println(drink2.getDrinkAlcoholStrength());
        System.out.println(drink2.getDrinkAlcoholUnits());
        System.out.println(drink2.getDrinkPrice());

    }

}
