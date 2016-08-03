package app.department;

import java.util.*;
import app.util.*;
import spark.*;
import static app.Main.departmentDao;
import static app.util.RequestUtil.*;

public class DepartmentController {
    public static Route fetchAllDepartments = (Request request, Response response) -> {
        HashMap<String, Object> model = new HashMap<>();
        model.put("departments", departmentDao.getDepartments());
        return ViewUtil.render(request, model, Path.Template.DEPARTMENTS_ALL);
    };
}
