package app.employee;

import com.google.common.collect.*;
import java.util.*;

public class EmployeeDao {
    private final List<Employee> employees = ImmutableList.of(
            new Employee(1, "Иванов Иван Иванович", new Date(54646464), 1),
            new Employee(1, "Петров Петр Петрович", new Date(925626546), 2),
            new Employee(1, "Сидоров Сидор Сидорович", new Date(287651663), 3),
            new Employee(1, "Егоров Егор Егорович", new Date(8351245), 3)
    );

    public Iterable<Employee> getEmployees(){
        return employees;
    }

    public Employee getEmployeetById(int id){
        return employees.get(new Random().nextInt(employees.size()));
    }
}
