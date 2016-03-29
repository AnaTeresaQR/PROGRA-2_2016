package tareaC1pilas;

/**
 *
 * @author
 */
public class ManagerStack implements InterfaceStack {

    private int size;
    private Node last;

    @Override
    public void push(int data) {

        Node newNode = new Node(data);
        if (isEmpty()) {
            last = newNode;
            size++;
        } else {
            newNode.setNext(last);
            last = newNode;
            size++;
        }
    }

    @Override
    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("El elemento no se puede desapilar porque la pila está vacía");
        } else {
            int aux = last.getData();
            last = last.getNext();
            size--;
            return aux;
        }
    }

    @Override
    public int top() throws StackException {
        if (isEmpty()) {
            throw new StackException("La pila está vacía, no existe elemento en la cima");
        }
        return last.getData();
    }

    @Override
    public boolean isEmpty() {
        if (last == null) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    public String print() {
        String line = "";
        Node current = last;

        while (current != null) {
            line += current.getData() + "\n";
            current = current.getNext();
        }
        return line;
    }
}
