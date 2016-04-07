package exercise2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class Director {

    public Proyect createProyect(AbstractBuilder builder, String nameProyect, BossProyect boss, int timeWeeks, ArrayList<Date> datList) throws ProyectException {

        if (builder == null) {
            builder = new ConcreteBuilder();
        }
        builder.createNameProyect(nameProyect);
        builder.createBossProyect(boss);
        builder.createTimeWeeks(timeWeeks);
        builder.createAdvanceProyect(datList);

        return builder.getProyect();
    }

}
