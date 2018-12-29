package DAO;

public interface EmployeeDao {
    void getEmployees();
    void createEmployee(String name, String department);
    void deleteEmployeeByName(String name);
}
