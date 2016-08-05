package app.util;

import lombok.*;

public class Path {

    public static class Web {
        @Getter public static final String INDEX = "/";
        @Getter public static final String REPORTS = "/reports/";

        @Getter public static final String DEPARTMENTS = "/departments/";
        @Getter public static final String DEPARTMENT_SHOW = "/departments/:id/";
        @Getter public static final String DEPARTMENT_EDIT = "/departments/:id/edit/";
        @Getter public static final String DEPARTMENT_UPDATE = "/departments/:id/update/";
        @Getter public static final String DEPARTMENT_CREATE = "/departments/create/";

        @Getter public static final String EMPLOYEES = "/employees/";
        @Getter public static final String EMPLOYEE_SHOW = "/employees/:id/";
        @Getter public static final String EMPLOYEE_EDIT = "/employees/:id/edit/";
        @Getter public static final String EMPLOYEE_UPDATE = "/employees/:id/update/";
        @Getter public static final String EMPLOYEE_CREATE = "/employees/create/";
    }

    public static class Template {
        public final static String INDEX = "index.ftl";
        public final static String REPORTS = "reports.ftl";

        public final static String DEPARTMENTS_ALL = "department/index.ftl";
        public final static String DEPARTMENT_SHOW = "department/show.ftl";
        public final static String DEPARTMENT_EDIT = "department/edit.ftl";
        public final static String DEPARTMENT_CREATE = "department/create.ftl";

        public final static String EMPLOYEES_ALL = "employee/index.ftl";
        public final static String EMPLOYEE_SHOW = "employee/show.ftl";
        public final static String EMPLOYEE_EDIT = "employee/edit.ftl";
        public final static String EMPLOYEE_CREATE = "employee/create.ftl";

        public static final String NOT_FOUND = "notFound.ftl";
    }

}
