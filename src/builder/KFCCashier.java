package builder;

public class KFCCashier {
    public static void main(String[] args) {
        FoodBuilder builder = new FoodPackage1Builder();
        System.out.println("now you have food: " + builder.buildMainFood() + " drink: " + builder.buildDrink());
    }
}
