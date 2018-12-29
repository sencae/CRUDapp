package DAO;

import org.springframework.jdbc.core.JdbcTemplate;
import tables.Employee;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    private JdbcTemplate jdbcTemplateObject;
EmployeeDaoImpl(JdbcTemplate JTO){
    this.jdbcTemplateObject = JTO;
}
    public void getEmployees() {
        String SQL = "select * from employee";
        List<Employee> employees = jdbcTemplateObject.query(SQL, new EmployeeMapper());
        for(Employee record:employees)
            System.out.println(record.toString());
    }

    public void createEmployee(String name, String department) {
        String SQL = "insert into employee (empl_name,department) values (?,?)";
        jdbcTemplateObject.update(SQL,name,department);
        System.out.println("Created Record Name = " + name + " Department = " + department);
    }

    public void deleteEmployeeByName(String name) {
        String SQL = "delete from employee where empl_name = ?";
        jdbcTemplateObject.update(SQL,name);
        System.out.println("Deleted Record with name = " + name);
    }
}
