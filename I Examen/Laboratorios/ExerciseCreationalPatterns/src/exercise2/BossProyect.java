package exercise2;

/**
 *
 * @author Ana Teresa
 */
public class BossProyect {

    private String name;
    private String lastName;
    private String id;

    public BossProyect(String name, String lastName, String id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "JefeProyecto{" + "nombre: " + name + ", apellido: " + lastName + ", cedula: " + id + '}';
    }

}
