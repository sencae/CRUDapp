package tables;

public class EmpToProj {
    private String project_name;
    private int employee_id;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    @Override
    public String toString() {
        return "EmpToProj{" +
                "project_name='" + project_name + '\'' +
                ", employee_id=" + employee_id +
                '}';
    }
}
