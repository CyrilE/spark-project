package app.department;

import java.util.*;
import app.util.*;
import spark.*;
import spark.template.freemarker.FreeMarkerEngine;

import static app.Main.department;
import static app.Main.employee;

import static app.util.RequestUtil.*;

public class DepartmentController {
    public static Route index = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("departments", department.fetchAllDepartments());
        //return ViewUtil.render(request, model, Path.Template.DEPARTMENTS_ALL);
        return new FreeMarkerEngine().render(new ModelAndView(model, Path.Template.DEPARTMENTS_ALL));
    };

    public static Route show = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("department", department.fetchOneDepartment(Integer.parseInt(request.params(":id"))));
        model.put("employees", employee.fetchEmployeeListByDepartmentId(Integer.parseInt(request.params(":id"))));
        return new FreeMarkerEngine().render(new ModelAndView(model, Path.Template.DEPARTMENT_SHOW));
    };

    public static Route edit = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("department", department.fetchOneDepartment(Integer.parseInt(request.params(":id"))));
        return new FreeMarkerEngine().render(new ModelAndView(model, Path.Template.DEPARTMENT_EDIT));
    };

    public static Route update = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        String name = request.queryParams("name");
        department.updateOneDepartment(Integer.parseInt(request.params(":id")), name);
        return new FreeMarkerEngine().render(new ModelAndView(model, Path.Template.DEPARTMENT_EDIT)); // TODO
    };
}
