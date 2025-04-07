//Write your answer here
public class Trio {
    private Sandwich sandwich;
    private Salad Salad;
    private Drink drink;

    public Trio(Sandwitch sandwich,Salad salad,Drink drink) {
        Sandwich = sandwich;
        Salad = salad;
        Drink = drink;
    }

    public double getPrice(){
        double priceSand = sandwich.getPrice();
        double priceSald = salad.getPrice();
        double priceDrin = drink.getPrice();
    }


    Public String getName() {
        return sandwich.getname()+ "/" + salad.getname()+ "/" + drink.getname()+ "/" + "Trio"; 
    }


}