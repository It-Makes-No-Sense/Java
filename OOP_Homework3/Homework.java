package OOP_Homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        Random r = new Random();
        List<Employee> db = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            db.add(new Employee("Имя" + i,
                    r.nextInt(100, 1000),
                    r.nextInt(65),
                    "Департамент №" + r.nextInt(5)));
        }
        System.out.println(db + "\n");


        db.sort(new EmployeeAgeComparator());
        System.out.println(db + "\n");

        db.sort(new EmployeeSalaryComparator());
        System.out.println(db + "\n");

        Collections.sort(db);
        System.out.println(db + "\n");

    }
}

