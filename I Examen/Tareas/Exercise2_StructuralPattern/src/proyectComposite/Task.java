package proyectComposite;

import java.util.ArrayList;

/**
 *
 * @author Ana Teresa
 */
public class Task implements Proyect {

    private String nameTask;
    private String description;
    private int timeRequired;
    private Employee inCharge;
    private ArrayList<Proyect> elements = new ArrayList<>(); // lista para guardar proyectos

    public Task(String nameTask, String description, int timeRequired, Employee inCharge) {
        this.nameTask = nameTask;
        this.description = description;
        this.timeRequired = timeRequired;
        this.inCharge = inCharge;
    }

    // agregar proyecto a la lista de proyectos
    public void addProyect(Proyect element) {
        elements.add(element);
    }

    // eliminar un proyecto de la lista de proyectos
    public void removeProyect(Proyect element) {
        elements.remove(element);
    }

    // método que calcula el tiempo requerido por proyecto en horas
    @Override
    public int calculateTime() {
        int tiempo = this.timeRequired;
        for (Proyect element : elements) {
            tiempo += element.calculateTime();
        }
        return tiempo;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTimeRequired() {
        return timeRequired;
    }

    public void setTimeRequired(int timeRequired) {
        this.timeRequired = timeRequired;
    }

    public Employee getInCharge() {
        return inCharge;
    }

    public void setInCharge(Employee inCharge) {
        this.inCharge = inCharge;
    }

}
