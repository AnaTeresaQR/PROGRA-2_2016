package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class Person {

    private String schedule;
    private String name;
    private String secondName;
    private String lastName;
    private String secondLastName;

    public Person(String schedule, String name, String secondName, String lastName, String secondLastName) {
        this.schedule = schedule;
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    @Override
    public String toString() {
        return "Person{" + "Schedule: " + schedule + " ,name: " + name + " " + secondName + ", lastName: " + lastName + " " + secondLastName + '}';
    }

}
