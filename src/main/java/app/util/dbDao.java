package app.util;

import org.sql2o.*;

public class dbDao {
    public static Sql2o sql2o;

    static{
        sql2o = new Sql2o("jdbc:mysql://localhost:3306/company?useUnicode=yes&characterEncoding=UTF-8", "root", "");
    }
}
