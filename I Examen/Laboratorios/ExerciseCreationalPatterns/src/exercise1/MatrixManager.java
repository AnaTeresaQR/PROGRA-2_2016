/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Ana Teresa
 */
public class MatrixManager {

    private final List<List<Employee>> matrix;

    public MatrixManager() {
        matrix = new ArrayList<>();
    }

    public boolean add_RowColumn(int row, int column, Employee employee) {

        // Verificar valores negativos
        if (row < 0 || column < 0) {
            return false;
        }

        // We need to know first if the row already exits
        if (isRowExits(row)) {
            // We need to know first if the column already exits
            if (isColumnExits(row, column)) {

                // Verificar si ya hay alguien allí
                if (isNull(row, column)) {
                    // Finally we add the employee
                    matrix.get(row).add(column, employee);
                    return true;
                }else{
                    return false;
                }

            } else {
                // We need to add columns
                addNewColumn(row);
                // Lets try it again
                return add_RowColumn(row, column, employee);
            }
        } else {
            addNewRow();
            // Lets try it again
            return add_RowColumn(row, column, employee);
        }
    }
    
    public boolean add_EndRow(Employee employee){
        Random random = new Random();
        int row = random.nextInt(matrix.size());
        return add_RowColumn(row, matrix.get(row).size(), employee);
    }
    
    public boolean copyRow(int row){
        List<Employee> copiedRow = new ArrayList<>();
        List<Employee> originalRow = matrix.get(row);
        
        for(Employee e : originalRow){
            if (e != null) {
                Employee temp = (Employee)e.copy();
                temp.setName(temp.getName() + Math.random() * 10);
                copiedRow.add(temp);
            }else{
                copiedRow.add(null);
            }
        }
        
        matrix.add(copiedRow);
        return true;
        
    }

    public String print() {

        StringBuilder sb = new StringBuilder();

        for (List<Employee> m : matrix) {
            for (Employee e : m) {

                if (e != null) {
                    sb.append(e.toString());
                    sb.append(" -- ");
                }else{
                    sb.append(" null ");
                }

            }
            sb.append("\n*\n");
        }

        return sb.toString();
    }

    private boolean isRowExits(int row) {
        try {
            matrix.get(row);
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    private boolean isColumnExits(int row, int column) {
        try {
            matrix.get(row).get(column);
            return true;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }

    private void addNewRow() {
        List<Employee> newRow = new ArrayList<>();
        matrix.add(newRow);
    }

    private void addNewColumn(int row) {
        Employee e = null;
        matrix.get(row).add(e);
    }

    private boolean isNull(int row, int column) {
        return matrix.get(row).get(column) == null;
    }

}
