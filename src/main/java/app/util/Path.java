package app.util;

import lombok.*;

public class Path {

    // The @Getter methods are needed in order to access
    // the variables from Velocity Templates
    public static class Web {
        @Getter public static final String DEPARTMENTS = "/departments/";
    }

    public static class Template {
        public final static String DEPARTMENTS_ALL = "/velocity/department/all.vm";
        public static final String NOT_FOUND = "/velocity/notFound.vm";
    }

}
