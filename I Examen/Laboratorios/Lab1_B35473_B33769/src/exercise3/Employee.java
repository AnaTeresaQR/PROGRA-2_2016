package exercise3;

/**
 * Class with the attributes of a employee and their respective get and gets
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class Employee {

    private String id;
    private String socialSecurity;
    private String firstName;
    private String secondName;
    private String lastName;
    private String secondLastName;
    private int salary;

    public Employee(String id, String number, String firstName, String secondName, String lastName, String secondLastName, int salary) {
        this.id = id;
        this.socialSecurity = number;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return " Empleado: " + " Cedula: " + id + " Numero de seguro: " + socialSecurity + " Nombre Completo: " + firstName + " " + secondName + " " + lastName + " " + secondLastName + " Salario: " + salary;
    }
}
