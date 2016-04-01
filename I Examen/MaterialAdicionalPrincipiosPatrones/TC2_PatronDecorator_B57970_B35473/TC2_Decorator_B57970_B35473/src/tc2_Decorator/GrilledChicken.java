package tc2_Decorator;

/**
 * Class that handles a concrete dish decorating
 *
 * @author Ana Teresa
 * @author Frida
 */
public class GrilledChicken extends Dish_Decorator {

    private final String description = " + Pollo a la plancha ";
    private final int price = 500;

    public GrilledChicken(Component_Restaurant restaurant) {
        super(restaurant);
    }

    /**
     * Method adds description of a dish decorated
     *
     * @return the description decorated
     */
    @Override
    public String getDecription() {
        return super.getRestaurant().getDecription() + description;
    }

    /**
     * A method that adds extra price of a dish decoration
     *
     * @return the extra price for decoration
     */
    @Override
    public int getPrice() {
        return super.getRestaurant().getPrice() + price;
    }
}
