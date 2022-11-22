/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author narasimhatejareddy
 */
public class Employee {
    
    private String employeeName;
    private int employeeId;
    private static int count = 1;

    public Employee() {
        employeeId = count;
        count++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public String toString() {
        return employeeName;
    }
}
