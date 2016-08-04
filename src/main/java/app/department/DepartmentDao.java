package app.department;

import com.google.common.collect.*;
import java.util.*;

public class DepartmentDao {
    private final List<Department> departments = ImmutableList.of(
        new Department(1, "Отдел кадров"),
        new Department(2, "Бухгалтерия"),
        new Department(3, "Дирекция")
    );

    public Iterable<Department> getDepartments(){
        return departments;
    }

    public Department getDepartmentById(int id){
        return departments.get(new Random().nextInt(departments.size()));
    }
}
