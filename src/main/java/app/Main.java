package app;

import app.department.*;
import app.employee.EmployeeController;
import app.employee.EmployeeDao;
import app.util.*;

import static spark.Spark.*;
import static spark.debug.DebugScreen.*;

public class Main {

    public static DepartmentDao departmentDao;
    public static EmployeeDao employeeDao;

    public static void main(String[] args){
        departmentDao = new DepartmentDao();
        employeeDao = new EmployeeDao();

        staticFiles.location("/public");
        staticFiles.expireTime(600L);
        enableDebugScreen();

        get(Path.Web.DEPARTMENTS, DepartmentController.fetchAllDepartments);
        get(Path.Web.DEPARTMENT_SHOW, DepartmentController.fetchOneDepartment);
        get(Path.Web.EMPLOYEES, EmployeeController.fetchAllEmployees);
    }
}
