package app.employee;

import java.util.Date;

public class Employee {
    int id;
    String fullname;
    Date birthday;
    int department_id;

    public Employee(int id, String fullname, Date birthday, int department_id){
        this.id = id;
        this.fullname = fullname;
        this.birthday = birthday;
        this.department_id = department_id;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getDepartment_id() {
        return department_id;
    }
}
