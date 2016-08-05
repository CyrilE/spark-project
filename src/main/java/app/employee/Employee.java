package app.employee;

import app.department.Department;
import org.sql2o.*;
import scala.util.parsing.combinator.testing.Str;

import java.util.*;
import static app.util.dbDao.sql2o;

public class Employee {
    int id;
    String fullname;
    String birthday;
    int department_id;

    public Employee(){}

    public Employee(int id, String fullname, String birthday, int department_id){
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

    public String getBirthday() {
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

    public List<Employee> fetchAllEmployees(){
        String query = "SELECT id, fullname, birthday, department_id FROM employees";

        try(Connection con = sql2o.open()) {
            return con.createQuery(query).executeAndFetch(Employee.class);
        }
    }

    public void updateEmployee(int id, String fullname, String birthday, int department_id){
        String query = "UPDATE employees SET fullname = :fullname, birthday = :birthday, department_id = :department_id WHERE id = :id";

        try(Connection con = sql2o.open()){
            con.createQuery(query)
                    .addParameter("fullname", fullname)
                    .addParameter("id", id)
                    .addParameter("birthday", birthday)
                    .addParameter("department_id", department_id)
                    .executeUpdate();
        }
    }

    public void storeEmployee(String fullname, String birthday, int department_id){
        String query = "INSERT INTO departments(fullname, birthday, department_id) VALUES (:fullname, :birthday, :department_id)";

        try(Connection con = sql2o.open()){
            con.createQuery(query)
                    .addParameter("fullname", fullname)
                    .addParameter("birthday", birthday)
                    .addParameter("department_id", department_id)
                    .executeUpdate();
        }
    }
}
