package proyectComposite;

/**
 *
 * @author Ana Teresa
 */
public class Employee {

    private String name;
    private String lastName;
    private String schedule;

    public Employee(String name, String lastName, String schedule) {
        this.name = name;
        this.lastName = lastName;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Empleado{ " + "nombre: " + name + ", apellido: " + lastName + ", cedula: " + schedule + '}';
    }

}
