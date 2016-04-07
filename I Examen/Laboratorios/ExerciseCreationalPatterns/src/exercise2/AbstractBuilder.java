package exercise2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public interface AbstractBuilder {

    public void createNameProyect(String name) throws ProyectException;

    public void createBossProyect(BossProyect boss) throws ProyectException;

    public void createTimeWeeks(int time) throws ProyectException;

    public void createAdvanceProyect(ArrayList<Date> advanceProyect) throws ProyectException;

    public Proyect getProyect();

}
