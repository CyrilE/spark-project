package app.department;

import lombok.*;
import app.util.dbDao.*;
import org.sql2o.*;

import java.util.List;

import static app.util.dbDao.sql2o;

public class Department {
    int id;
    String name;

    public Department(){}

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public List<Department> fetchAllDepartments(){
        String query = "SELECT id, name FROM departments";

        try(Connection con = sql2o.open()){
            return con.createQuery(query).executeAndFetch(Department.class);
        }
    }

    public Department fetchOneDepartment(int id){
        String query = "SELECT id, name FROM departments WHERE id = :id";

        try(Connection con = sql2o.open()){
            return con.createQuery(query)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Department.class);
        }
    }

    public void updateOneDepartment(int id, String name){
        String query = "UPDATE departments SET name = :name WHERE id = :id";

        try(Connection con = sql2o.open()){
            con.createQuery(query)
                    .addParameter("name", name)
                    .addParameter("id", id)
                    .executeUpdate();
        }
    }

    public void storeOneDepartment(String name){
        String query = "INSERT INTO departments(name) VALUES (:name)";

        try(Connection con = sql2o.open()){
            con.createQuery(query)
                    .addParameter("name", name)
                    .executeUpdate();
        }
    }
}
