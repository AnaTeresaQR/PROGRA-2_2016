package tc2_Decorator;

/**
 * Class that handles a concrete dish decorating
 *
 * @author Ana Teresa
 * @author Frida
 */
public class Beans extends Dish_Decorator {

    private final String description = " + Frijoles ";
    private final int price = 200;

    public Beans(Component_Restaurant restaurant) {
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
