package app;

import app.department.*;
import app.employee.*;
import app.util.*;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.util.HashMap;
import java.util.List;

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

        //get(Path.Web.INDEX, ); //TODO

        get(Path.Web.DEPARTMENTS, DepartmentController.index);
        get(Path.Web.DEPARTMENT_CREATE, DepartmentController.create);
        get(Path.Web.DEPARTMENT_SHOW, DepartmentController.show);
        get(Path.Web.DEPARTMENT_EDIT, DepartmentController.edit);
        get(Path.Web.DEPARTMENT_UPDATE, DepartmentController.update);
        post(Path.Web.DEPARTMENTS, DepartmentController.store);

        get(Path.Web.EMPLOYEES, EmployeeController.index);
        get(Path.Web.EMPLOYEE_CREATE, EmployeeController.create);
        get(Path.Web.EMPLOYEE_SHOW, EmployeeController.show);
        get(Path.Web.EMPLOYEE_EDIT, EmployeeController.edit);
        get(Path.Web.EMPLOYEE_UPDATE, EmployeeController.update);
        post(Path.Web.EMPLOYEES, EmployeeController.store);

    }
}
