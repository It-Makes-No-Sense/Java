package OOP_Homework3;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

    public int compare(Employee a, Employee b) {
        if (a.salary>b.salary){
            return -1;
        } else if (a.salary<b.salary) {
            return 1;
        }
        else {
            return 0;
        }
    }

}
