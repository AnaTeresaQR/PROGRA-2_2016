package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        MatrixManagerCopiable mc = new MatrixManagerCopiable();
        Employee emp1 = new Employee("1", "1", "1");
        Employee emp2 = new Employee("2", "2", "2");

        mc.addElement(0, emp1);
        mc.addElement(0, emp2);

        System.out.println("" + mc.print());

        // System.out.println("" + mc.getElement(0, 1));
        mc.copyRow(0);
        mc.getElement(1, 0).setName("3");
        System.out.println("" + mc.print());
    }

}
