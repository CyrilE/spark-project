package app.employee;

import java.util.*;
import app.util.*;
import spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import static app.Main.employeeDao;

public class EmployeeController {
    public static Route fetchAllEmployees = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("employees", employeeDao.getEmployees());
        return new FreeMarkerEngine().render(new ModelAndView(model, Path.Template.EMPLOYEES_ALL));
    };
}
