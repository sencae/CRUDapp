package DAO;

import org.springframework.jdbc.core.JdbcTemplate;

public class ProjectDaoImpl implements ProjectDao {
    private JdbcTemplate jdbcTemplateObject;
    ProjectDaoImpl(JdbcTemplate JTO){
        this.jdbcTemplateObject = JTO;
    }
    public void getCompanyByProjectName(String name) {
        String SQL = "select comp_name from project where proj_name = ?";
        System.out.println(jdbcTemplateObject.queryForObject(SQL,new Object[]{name},String.class));
    }
}
