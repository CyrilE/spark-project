package app.employee;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

import app.department.Department;
import app.util.*;
import spark.*;
import spark.template.freemarker.FreeMarkerEngine;

import static app.Main.department;
import static app.Main.employee;

public class EmployeeController {
    public static Route index = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("employees", employee.fetchAllEmployees());
        return new FreeMarkerEngine().render(new ModelAndView(model, Path.Template.EMPLOYEES_ALL));
    };

    public static Route show = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("employee", employee.fetchEmployeeById(Integer.parseInt(request.params(":id"))));
        Employee employee = (Employee) model.get("employee");
        model.put("department", department.fetchOneDepartment(employee.getDepartment_id()));
        return new FreeMarkerEngine().render(new ModelAndView(model, Path.Template.EMPLOYEE_SHOW));
    };

    public static Route edit = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("employee", employee.fetchEmployeeById(Integer.parseInt(request.params(":id"))));
        model.put("departments", department.fetchAllDepartments());
        return new FreeMarkerEngine().render(new ModelAndView(model, Path.Template.EMPLOYEE_EDIT));
    };

    public static Route update = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        String fullname = request.queryParams("fullname");
        String birthday = request.queryParams("birthday");
        String department_id = request.queryParams("department");
        employee.updateEmployee(Integer.parseInt(request.params(":id")), fullname, birthday, Integer.parseInt(department_id));
        response.redirect("/employees/" + request.params(":id") + "/");
        return new FreeMarkerEngine().render(new ModelAndView(model, Path.Template.EMPLOYEES_ALL));
    };

    public static Route create = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        return new FreeMarkerEngine().render(new ModelAndView(model, Path.Template.EMPLOYEE_CREATE));
    };

    public static Route store = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        String fullname = request.queryParams("fullname");
        String birthday = request.queryParams("birthday");
        String department_id = request.queryParams("department_id");

        /*SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date.parse(birthday));
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);*/

        employee.storeEmployee(fullname, birthday, Integer.parseInt(department_id));
        response.redirect("/employees/");
        return new FreeMarkerEngine().render(new ModelAndView(model, Path.Template.EMPLOYEES_ALL));
    };
}
