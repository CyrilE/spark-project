package app.department;

import java.util.*;
import app.util.*;
import spark.*;
import spark.template.freemarker.FreeMarkerEngine;

import static app.Main.departmentDao;
import static app.util.RequestUtil.*;

public class DepartmentController {
    public static Route fetchAllDepartments = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("departments", departmentDao.getDepartments());
        //return ViewUtil.render(request, model, Path.Template.DEPARTMENTS_ALL);
        return new FreeMarkerEngine().render(new ModelAndView(model, Path.Template.DEPARTMENTS_ALL));
    };
    public static Route fetchOneDepartment = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        Department department = departmentDao.getDepartmentById(Integer.parseInt(request.params(":id")));
        model.put("department", department);
        model.put("employees", new int[10]);
        return new FreeMarkerEngine().render(new ModelAndView(model, Path.Template.DEPARTMENT_SHOW));
    };
}
