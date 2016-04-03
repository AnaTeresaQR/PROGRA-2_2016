package exercise3;

import java.util.TreeMap;

/**
 * Test the exercise
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class Main {

    public static void main(String[] args) {

        //Create the TreeMap
        TreeMap<String, Employee> treeMap = new TreeMap<>();

        TreeMapManager myMap = new TreeMapManager(treeMap);

        //Create employes with his values
        Employee employe1 = new Employee("807400861", "0", "Jose", "Alejandro", "Lizano", "Muñoz", 1000);
        Employee employe2 = new Employee("807400861", "1", "Esteban", "Alberto", "Ramirez", "Salazar", 1500); //Same id that employee1 (inst added)
        Employee employe3 = new Employee("502460843", "2", "Andres", "Alondo", "Solis", "Mora", 3000);
        Employee employe4 = new Employee("709650754", "3", "Laura", "Patricia", "Solis", "Espinoza", 2000);
        Employee employe5 = new Employee("309520135", "4", "Ana", "Cristina", "Lopez", "Zuñiga", 9000);
        Employee employe6 = new Employee("104320012", "5", "Tatiana", "Michelle", "Chacon", "Vargas", 4000);
        Employee employe7 = new Employee("205430853", "6", "Roberto", "Felipe", "Chaverri", "Campos", 3000);
        Employee employe8 = new Employee("808640624", "7", "Jimena", "Maria", "Arias", "Fernandez", 7000);
        Employee employe9 = new Employee("503050134", "8", "David", "Josue", "Chaverri", "Zuñiga", 7600);
        Employee employe10 = new Employee("209540643", "9", "Martha", "Maribel", "Granados", "Hidalgo", 3050);

        //Test method add
        myMap.add(employe1);
        myMap.add(employe2);
        myMap.add(employe3);
        myMap.add(employe4);
        myMap.add(employe5);
        myMap.add(employe6);
        myMap.add(employe7);
        myMap.add(employe8);
        myMap.add(employe9);
        myMap.add(employe10);

        System.out.println("MOSTRAR LA LISTA ORDENADA POR CEDULA\n" + myMap.print() + "\n");

        String idEliminate = "309520135";

        //  Method eliminate
        myMap.eliminate(idEliminate);

        //Test method eliminate
        System.out.println("MOSTRAR LA LISTA DESPUES DE ELIMINAR EL ID \"" + idEliminate + "\"\n" + myMap.print() + "\n");

        //Test method that order the list by Social Security
        System.out.println("MOSTRAR LA LISTA ORDENADA POR NUMREO DE SEGURO\n" + myMap.orderSocialSecurity() + "\n");

        //Test method that order the list by Salary
        System.out.println("MOSTRAR LA LISTA ORDENADA POR SALARIO\n" + myMap.orderSalary() + "\n");

        //Test method that order the list by Alphabetical order
        System.out.println("MOSTRAR LA LISTA ORDENADA ALFABETICAMENTE (Primer apellido -> Segundo Apellido -> Primer Nombre -> Segundo Nombre)\n" + myMap.orderAlfab() + "\n");
    }
}
