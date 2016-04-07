/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class Employee implements Cloneable{

    private String name;
    private String lastName;
    private String id;

    public Employee() {
    }

    public Employee(String name, String lastName, String id) {
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
        return "Employee{" + "name=" + name + ", lastName=" + lastName + ", id=" + id + '}';
    }
    
    public Object copy(){
        return new Employee(name, lastName, id);
    }

}
