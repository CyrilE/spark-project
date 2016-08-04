package app;

import app.department.*;
import app.employee.*;
import app.util.*;

import static spark.Spark.*;
import static spark.debug.DebugScreen.*;

public class Main {

    public static Department department;
    public static Employee employee;

    public static void main(String[] args){
        department = new Department();
        employee = new Employee();

        staticFiles.location("/public");
        staticFiles.expireTime(600L);
        enableDebugScreen();

        get(Path.Web.DEPARTMENTS, DepartmentController.index);
        get(Path.Web.DEPARTMENT_SHOW, DepartmentController.show);
        get(Path.Web.DEPARTMENT_EDIT, DepartmentController.edit);
        put(Path.Web.DEPARTMENT_SHOW, DepartmentController.update);
        get(Path.Web.EMPLOYEES, EmployeeController.fetchAllEmployees);

    }
}
