package tareaC1pilas;

/**
 *
 * @author
 */
public class TestStack {

    public static void main(String[] args) {

        try {
            ManagerStack ms = new ManagerStack();

            System.out.println("¿vacía? " + ms.isEmpty());// verifica pila vacía

            // se agregan elementos
            ms.push(3);
            ms.push(7);
            ms.push(1);
            ms.push(5);
            ms.push(2);

            // se imprime y se verifican cima y tamaño luego de añadir elementos a la pila
            System.out.println("" + ms.print());
            System.out.println("Cima " + ms.top() + " tamaño: " + ms.size());

            // se elimina el primer elemento
            System.out.println("Se elimina: " + ms.pop());

            // se verifican cima y tamaño después de eliminar
            System.out.println("Cima " + ms.top() + " tamaño: " + ms.size());
            System.out.println("" + ms.print());

            // se eliminan más elementos
            System.out.println("Se elimina:" + ms.pop());
            System.out.println("Se elimina: " + ms.pop());

            // se verifican cima y tamaño después de eliminar
            System.out.println("" + ms.print());
            System.out.println("Cima " + ms.top() + " tamaño: " + ms.size());

            // se eliminan los últimos elementos para causar una excepción
            System.out.println("Se elimina: " + ms.pop());
            System.out.println("Se elimina: " + ms.pop());

            // se ocasiona excepción al intentar verificar datos inexistentes de la pila
            System.out.println("" + ms.print());
            System.out.println("Cima " + ms.top() + " tamaño: " + ms.size());

        } catch (StackException ex) {
            System.out.println("" + ex.getMessage());
        }

    }
}
