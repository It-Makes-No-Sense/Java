package OOP_Homework3;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {
    public int compare(Employee a,Employee b){
        return Integer.compare(a.age,b.age);
    }
}
