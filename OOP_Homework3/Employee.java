package OOP_Homework3;

public class Employee implements Comparable<Employee> {
    public String name;

    public int age;
    public int salary;
    public String department;

    public Employee(String name, int salary, int age, String department) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + salary + " " + department;
    }

    @Override
    public int compareTo(Employee o) {
        return department.compareTo(o.department);
    }
}

