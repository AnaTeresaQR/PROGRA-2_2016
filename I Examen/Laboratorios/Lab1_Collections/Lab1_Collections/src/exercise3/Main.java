package exercise3;

import java.util.TreeMap;

/**
 *
 * @author Ana Teresa
 * @author Alejandro
 */
public class Main {

    public static void main(String[] args) {

        TreeMap<String, Employee> treeMap = new TreeMap<>();

        TreeMapManager myMap = new TreeMapManager(treeMap);

        Employee employe1 = new Employee("807400861", 1, "Jose", "Alejandro", "Lizano", "Muñoz", 1000);
        Employee employe2 = new Employee("807400861", 2, "Esteban", "Alberto", "Ramirez", "Salazar", 1500);
        Employee employe3 = new Employee("502460843", 3, "Andres", "Alondo", "Solis", "Mora", 3000);
        Employee employe4 = new Employee("709650754", 4, "Laura", "Patricia", "Solis", "Espinoza", 2000);
        Employee employe5 = new Employee("309520135", 5, "Ana", "Cristina", "Lopez", "Zuñiga", 9000);
        Employee employe6 = new Employee("104320012", 6, "Tatiana", "Michelle", "Chacon", "Vargas", 4000);
        Employee employe7 = new Employee("205430853", 7, "David", "Felipe", "Mendez", "Mora", 3000);
        Employee employe8 = new Employee("808640624", 8, "Jimena", "Maria", "Arias", "Fernandez", 7000);
        Employee employe9 = new Employee("503050134", 9, "Roberto", "Josue", "Chaverri", "Campos", 7600);
        Employee employe10 = new Employee("209540643", 10, "Martha", "Maribel", "Granados", "Hidalgo", 3050);

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

        myMap.eliminate("309520135");

        System.out.println("MOSTRAR LA LISTA DESPUES DE ELIMINAR A \"ALEJANDRO\"\n" + myMap.print() + "\n");

        System.out.println("MOSTRAR LA LISTA ORDENADA POR NUMREO DE SEGURO\n" + myMap.orderSocialSecurity() + "\n");

        System.out.println("MOSTRAR LA LISTA ORDENADA POR SALARIO\n" + myMap.orderSalary() + "\n");

        System.out.println("MOSTRAR LA LISTA ORDENADA ALFABETICAMENTE\n" + myMap.orderAlfab() + "\n");
    }
}
