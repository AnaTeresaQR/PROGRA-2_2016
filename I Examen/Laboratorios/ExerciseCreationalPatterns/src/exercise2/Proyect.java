package exercise2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class Proyect {

    private String nameProyect;
    private BossProyect bossP;
    private int timeWeeks;
    private ArrayList<Date> advanceProyect;

    public Proyect() {
    }

    public Proyect(String nameProyect, BossProyect bossP, int timeWeeks, ArrayList<Date> advanceProyect) {
        this.nameProyect = nameProyect;
        this.bossP = bossP;
        this.timeWeeks = timeWeeks;
        this.advanceProyect = advanceProyect;
    }

    public boolean add(Date dateList) {
        return advanceProyect.add(dateList);
    }

    public String getNameProyect() {
        return nameProyect;
    }

    public void setNameProyect(String nameProyect) {
        this.nameProyect = nameProyect;
    }

    public BossProyect getBossP() {
        return bossP;
    }

    public void setBossP(BossProyect bossP) {
        this.bossP = bossP;
    }

    public int getTimeWeeks() {
        return timeWeeks;
    }

    public void setTimeWeeks(int timeWeeks) {
        this.timeWeeks = timeWeeks;
    }

    public ArrayList<Date> getAdvanceProyect() {
        return advanceProyect;
    }

    public void setAdvanceProyect(ArrayList<Date> advanceProyect) {
        this.advanceProyect = advanceProyect;
    }

    private String dateList() {
        String text = "";
        if (advanceProyect.size() == 1) {
            return text += "Fecha de entrega final: " + advanceProyect.get(0).toLocaleString();
        } else {
            text += "Fechas de avances de proyectos:  ";
            for (Date advanceProyect1 : advanceProyect) {
                text += "\n" + advanceProyect1.toLocaleString();
            }
        }
        return text;
    }

    @Override
    public String toString() {
        return "\nProyect{" + "nameProyect: " + nameProyect + ", bossP: " + bossP + "\nProyect timeWeeks: " + timeWeeks + "\nadvanceProyect: " + dateList() + '}';
    }

}
