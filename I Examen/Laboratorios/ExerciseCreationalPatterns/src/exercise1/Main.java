package exercise1;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {
        MatrixManager m = new MatrixManager();
        m.add_RowColumn(0, 2, new Employee("ATJM", "IntheNight", "123"));
        m.add_RowColumn(1, 1, new Employee("Juan", "Arias", "123"));

        m.add_EndRow(new Employee("TERE", "Quesada", "123"));
        m.copyRow(1);
        System.out.println(m.print());

    }

}
