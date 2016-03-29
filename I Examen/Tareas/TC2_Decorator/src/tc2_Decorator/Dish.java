package tc2_Decorator;

/**
 * Class with the attributes of a dish and basic implementation of a dish
 * undecorated
 *
 * @author Ana Teresa
 * @author Frida
 */
public class Dish implements Component_Restaurant {

    private final String description = "Plato simple, arroz "; // first description of all dishes
    private final int price = 500; // initial price of all dishes

    public Dish() {
    }

    @Override
    public String getDecription() {
        return description;
    }

    @Override
    public int getPrice() {
        return price;
    }

}
