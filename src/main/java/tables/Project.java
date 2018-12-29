package tables;

public class Project {
    private String project_name;
    private String company_name;
    private int manager_id;

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    @Override
    public String toString() {
        return "Project{" +
                "project_name='" + project_name + '\'' +
                ", company_name='" + company_name + '\'' +
                ", manager_id=" + manager_id +
                '}';
    }
}
