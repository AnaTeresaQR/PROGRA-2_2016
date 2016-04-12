package tc2_Decorator;

/**
 * Class in charge of testing the functionality
 *
 * @author Ana Teresa
 * @author Frida
 */
public class Main {

    public static void main(String[] args) {

        //  basic component without decorations 
        Component_Restaurant dish1 = new Dish();
        System.out.println("\nCasado1\n" + dish1.getDecription() + "\nPrecio = " + dish1.getPrice());

        // component decorated
        Component_Restaurant dish2 = new Dish();
        dish2 = new Beans(dish2);
        dish2 = new Plantain(dish2);
        dish2 = new Plantain(dish2);
        dish2 = new GrilledChicken(dish2);
        dish2 = new Salad(dish2);

        System.out.println("\nCasado 2\n" + dish2.getDecription() + "\nPrecio = " + dish2.getPrice());

    }

}
