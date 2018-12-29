package DAO;

import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class EmpToProjDaoImpl implements EmpToProjDao {
    private JdbcTemplate jdbcTemplateObject;

    EmpToProjDaoImpl(JdbcTemplate JTO) {
        this.jdbcTemplateObject = JTO;
    }

    public void getProjectsByEmployee(int empId) {
        String SQL = "select proj_name from emp_to_proj where emp_id = ?";
        List<String> result = jdbcTemplateObject.queryForList(SQL,new Object[]{empId},String.class);
        for (String record : result) {
            System.out.println(record);
        }
    }
}
