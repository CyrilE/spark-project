package app.employee;

import org.sql2o.*;
import java.util.*;
import static app.util.dbDao.sql2o;

public class Employee {
    int id;
    String fullname;
    Date birthday;
    int department_id;

    public Employee(){}

    public Employee(int id, String fullname, Date birthday, int department_id){
        this.id = id;
        this.fullname = fullname;
        this.birthday = birthday;
        this.department_id = department_id;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public List<Employee> fetchEmployeeListByDepartmentId(int departmentId){
        String query = "SELECT id, fullname, birthday, department_id FROM employees WHERE department_id = :departmentId";

        try(Connection con = sql2o.open()){
            return con.createQuery(query)
                    .addParameter("departmentId", departmentId)
                    .executeAndFetch(Employee.class);
        }
    }

    public Employee fetchEmployeeById(int id){
        String query = "SELECT id, fullname, birthday, department_id FROM employees WHERE id = :id";

        try(Connection con = sql2o.open()) {
            return con.createQuery(query)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Employee.class);
        }
    }
}
