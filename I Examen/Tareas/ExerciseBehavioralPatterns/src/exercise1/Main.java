package exercise1;

import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {
        NewsPaper np = new NewsPaper();

        User user = new User("Tere", "Quesada", 20, "ana.quesada@ucrso.info", "", Suscriptions.EMAIL);
        User user2 = new User("Zulay", "Ramírez", 30, "", "89767552", Suscriptions.SMS);

        np.add(user);
        np.add(user2);
        ConcreteNew cn1 = new ConcreteNew("Gatitos mueren", new Date(29, 6, 2016));
        ConcreteNew cn2 = new ConcreteNew("Lluvias extremas", new Date(9, 9, 2016));
        System.out.println("" + np.setNews(cn1));
        System.out.println("" + np.setNews(cn2));

        User user3 = new User("Juan", "Arias", 20, "juanmiguel.arias@ucrso.info", "84590688", Suscriptions.BOTH);
        np.add(user3);

        ConcreteNew cn3 = new ConcreteNew("Sin agua en la zona de Tibás", new Date(15, 4, 2016));
        ConcreteNew cn4 = new ConcreteNew("Robos en pulperías", new Date(17, 7, 2016));

        System.out.println("" + np.setNews(cn3));
        System.out.println("" + np.setNews(cn4));

        user.setEmail("zulaymayela@gmail.com");
        user2.setSuscriptionType(Suscriptions.BOTH);

        np.remove(user.getEmail());
        np.remove(user3.getEmail());

        ConcreteNew cn5 = new ConcreteNew("Día feriado incrementa accidentes", new Date(8, 8, 2016));
        ConcreteNew cn6 = new ConcreteNew("Aumento de impuestos", new Date(14, 5, 2016));
    }
}
