package app.employee;

import java.util.*;
import app.util.*;
import spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import static app.Main.employee;

public class EmployeeController {
    public static Route fetchAllEmployees = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("employees", employee.fetchEmployeeById(Integer.parseInt(request.params(":id"))));
        return new FreeMarkerEngine().render(new ModelAndView(model, Path.Template.EMPLOYEES_ALL));
    };
}
