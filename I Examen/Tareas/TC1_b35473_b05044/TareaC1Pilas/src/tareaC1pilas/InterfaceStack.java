package tareaC1pilas;

/**
 *
 * @author
 */
public interface InterfaceStack {

    public void push(int data);

    public int pop() throws StackException;

    public int top() throws StackException;

    public boolean isEmpty();

    public int size();
}
