package app;

import app.department.*;
import app.util.*;

import static spark.Spark.*;
import static spark.debug.DebugScreen.*;

public class Main {

    public static DepartmentDao departmentDao;

    public static void main(String[] args){
        departmentDao = new DepartmentDao();

        staticFiles.location("/public");
        staticFiles.expireTime(600L);
        enableDebugScreen();

        get(Path.Web.DEPARTMENTS, DepartmentController.fetchAllDepartments);
    }
}
