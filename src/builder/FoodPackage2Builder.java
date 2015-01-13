package builder;

public class FoodPackage2Builder extends FoodBuilder {

    @Override
    public String buildMainFood() {
        return "apple pie";
    }

    @Override
    public String buildDrink() {
        return "coca cola";
    }

}
