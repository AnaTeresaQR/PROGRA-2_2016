package exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Ana Teresa
 */
public class MatrixManagerCopiable implements Cloneable {

    private final List<List<Employee>> matrix;

    public MatrixManagerCopiable() {
        matrix = new ArrayList<>();
    }

    public boolean addElement(int row, Employee emp) {
        if (matrix.size() == row) {
            matrix.add(new ArrayList<>());
            matrix.get(row).add(emp);
            return true;
        }
        if (isRowExits(row)) {
            matrix.get(row).add(emp);
            return true;
        } else {
            throw new Error("No es posible insertar en la fila especificada");
        }
    }

    public Employee getElement(int row, int column) {
        if (isRowExits(row) && isColumnExits(row, column)) {
            return matrix.get(row).get(column);
        } else {
            throw new Error("No es posible devolver el empleado en la posición especificada");
        }
    }

    public boolean copyRow(int row) {
        List<Employee> original = matrix.get(row);
        List<Employee> copiableRow = (List<Employee>) copy(row);
        for (Employee emp : original) {
            copiableRow.add((Employee) emp.copy());
        }
        return matrix.add(copiableRow);
    }

    public String print() {

        StringBuilder sb = new StringBuilder();

        for (List<Employee> m : matrix) {
            sb.append("\n*   ");
            for (Employee e : m) {

                if (e != null) {
                    sb.append(e.toString());
                    sb.append(" -- ");
                }
            }
        }

        return sb.toString();
    }

    private boolean isRowExits(int row) {
        try {
            return matrix.get(row) != null && row >= 0;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    private boolean isColumnExits(int row, int column) {
        try {
            return isRowExits(row)
                    && matrix.get(row).get(column) != null
                    && column >= 0;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    public Object copy(int row) {
        if (isRowExits(row)) {
            List<Employee> rowList = new ArrayList<>(matrix.get(row).size());
            return rowList;
        }
        throw new Error("No es posible que la fila de Empleados sea copiada");
    }
}
