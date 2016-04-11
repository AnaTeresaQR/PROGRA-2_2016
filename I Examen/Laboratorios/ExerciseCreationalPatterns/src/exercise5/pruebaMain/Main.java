package exercise5.pruebaMain;

import exercise5.abstractFactory.NewspaperAdvertising_Factory;
import exercise5.concreteFactory.FactoryAdv1_2;
import exercise5.concreteProduct.AlDia.Adv_AlDia1_2;
import exercise5.concreteProduct.LaNacion.Adv_LaNacion1_2;
import exercise5.concreteProduct.LaTeja.Adv_LaTeja1_2;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {
        NewspaperAdvertising_Factory npaf1_2 = new FactoryAdv1_2(); // AbstractFactory con un método en común

        //------------------------------------------------------------------------------------------------------------------------------------------
        Adv_AlDia1_2 aad = (Adv_AlDia1_2) npaf1_2.createAlDiaNewspaper(); // se crea periódico Al Día
        aad.setAdvMessage("Compre en Palí, donde los precios son más bajos"); // se establece el msj de publicidad
        System.out.println("" + aad.getFullDescription());

        //------------------------------------------------------------------------------------------------------------------------------------------
        // Factoría Concreta con la creación de 3 periódicos con publicidad de media página
        FactoryAdv1_2 fa1_2 = new FactoryAdv1_2();
        Adv_LaNacion1_2 aln = (Adv_LaNacion1_2) fa1_2.createLaNacionNewspaper(); // se crea periódico La Nación
        aln.setAdvMessage("Cremas para el cuidado de la piel - Zermat");
        System.out.println("" + aln.getFullDescription());

        //------------------------------------------------------------------------------------------------------------------------------------------
        Adv_LaTeja1_2 alt = (Adv_LaTeja1_2) fa1_2.createLaTejaNewspaper(); // se crea periódico La Teja
        alt.setAdvMessage("Entradas partido de la sele descuentos - titicupon");
        System.out.println("" + alt.getFullDescription());

    }
}
