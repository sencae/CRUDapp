package DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class DaoFactory {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public EmployeeDaoImpl getEmployeeDaoImpl(){
        return new EmployeeDaoImpl(jdbcTemplateObject);
    }
    public EmpToProjDaoImpl getEmpToProjDaoImpl(){
        return new EmpToProjDaoImpl(jdbcTemplateObject);
    }
    public ProjectDaoImpl getProjectDaoImpl(){
        return new ProjectDaoImpl(jdbcTemplateObject);
    }

}
