package proyectComposite;

/**
 *
 * @author Ana Teresa
 */
public class Deliverable_Target implements Proyect {

    private String name;
    private String description;
    private Employee inCharge;

    public Deliverable_Target(String name, String description, Employee inCharge) {
        this.name = name;
        this.description = description;
        this.inCharge = inCharge;
    }

    @Override
    public int calculateTime() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getInCharge() {
        return inCharge;
    }

    public void setInCharge(Employee inCharge) {
        this.inCharge = inCharge;
    }

}
