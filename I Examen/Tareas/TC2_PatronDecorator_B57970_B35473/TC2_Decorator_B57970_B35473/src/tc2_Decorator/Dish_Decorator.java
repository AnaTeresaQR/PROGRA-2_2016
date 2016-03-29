package tc2_Decorator;

/**
 * Class which is responsible for modifying and returning a component, receives
 * it in the constructor, you receive the specific component
 *
 * @author Ana Teresa
 * @author Frida
 */
public abstract class Dish_Decorator implements Component_Restaurant {

    private Component_Restaurant restaurant; // Reference to the interface with the basic methods

    public Dish_Decorator(Component_Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Component_Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Component_Restaurant restaurant) {
        this.restaurant = restaurant;
    }

}
