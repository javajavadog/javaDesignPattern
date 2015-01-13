package builder;

public class FoodPackage1Builder extends FoodBuilder {

    @Override
    public String buildMainFood() {
        return "Big Hamberge";
    }

    @Override
    public String buildDrink() {
        return "ice cream";
    }

}
