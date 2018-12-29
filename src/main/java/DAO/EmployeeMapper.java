package DAO;

import org.springframework.jdbc.core.RowMapper;
import tables.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {

    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setEmployee_id(resultSet.getInt("emp_id"));
        employee.setDepartment(resultSet.getString("department"));
        employee.setName(resultSet.getString("empl_name"));
        return employee;
    }
}
