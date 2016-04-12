package proyectComposite;

/**
 * Clase prueba para demostrar patrón composite
 *
 * @author Ana Teresa
 */
public class Main {
    
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Ana", "Quesada", "207410170");
        Deliverable_Target e1 = new Deliverable_Target("Entregable1", "este es el entregable1", emp1);
        
        Employee emp2 = new Employee("Teresa", "Quesada", "207440378");
        Deliverable_Target e2 = new Deliverable_Target("Entregable2", "entregable numero2", emp2);
        
        Deliverable_Target e3 = new Deliverable_Target("Entregable3", "entregable numero3", emp1);
        Deliverable_Target e4 = new Deliverable_Target("Entregable4", "entregable numero4", emp2);
        
        Task t1 = new Task("Tarea1", "tarea numero1", 10, emp1);
        Task t2 = new Task("Tarea2", "tarea numero2", 15, emp1);
        
        Task t3 = new Task("Tarea3", "tarea numero3", 5, emp1);
        Task t4 = new Task("Tarea4", "tarea numero4", 6, emp2);
        Task t5 = new Task("Tarea5", "tarea numero5", 20, emp2);
        Task t6 = new Task("Tarea6", "tarea numero6", 30, emp2);

        // las tareas se componen de entregables y de tareas (Patrón Composite)
        t1.addProyect(e1);
        t1.addProyect(e2);
        
        t1.addProyect(t3);
        t1.addProyect(t4);
        t1.addProyect(t5);
        
        t2.addProyect(t6);
        t2.addProyect(e3);
        t2.addProyect(e4);
        
        System.out.println("Tiempo calculado de tarea 1: " + t1.calculateTime());
        System.out.println("Tiempo calculado de tarea 2: " + t2.calculateTime());
        
        t1.addProyect(t2);
        
        System.out.println("total tiempo tarea 1 y tarea 2 compuestas: " + t1.calculateTime());
        
    }
    
}
