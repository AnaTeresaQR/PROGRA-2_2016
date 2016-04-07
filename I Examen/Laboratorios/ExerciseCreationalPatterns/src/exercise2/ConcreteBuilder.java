package exercise2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class ConcreteBuilder implements AbstractBuilder {

    Proyect proyect;

    public ConcreteBuilder() {
        proyect = new Proyect();
    }

    @Override
    public void createNameProyect(String name) throws ProyectException {
        if (name != null && !name.equals("")) {
            proyect.setNameProyect(name);
        } else {
            throw new ProyectException("Se requiere un nombre de proyecto");
        }
    }

    @Override
    public void createBossProyect(BossProyect boss) throws ProyectException {
        if (boss != null
                && boss.getName() != null && !boss.getName().equals("")
                && boss.getLastName() != null && !boss.getLastName().equals("")
                && boss.getId() != null && !boss.getId().equals("")) {
            proyect.setBossP(boss);
        } else {
            throw new ProyectException("Se requieren datos al crear Jefe de Proyectos");
        }
    }

    @Override
    public void createTimeWeeks(int time) throws ProyectException {
        if (time >= 0) {
            proyect.setTimeWeeks(time);
        } else {
            throw new ProyectException("Se requiere tiempo en semanas de duración del proyecto");
        }
    }

    @Override
    public void createAdvanceProyect(ArrayList<Date> advanceProyect) throws ProyectException {
        if (advanceProyect != null && advanceProyect.size() >= 1) {
            proyect.setAdvanceProyect(advanceProyect);
        } else {
            throw new ProyectException("Se requieren fechas de avances de proyectos o fecha final de entrega de proyecto");
        }
    }

    @Override
    public Proyect getProyect() {
        return proyect;
    }

}
