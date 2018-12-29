package tables;

public class Company {

    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    @Override
    public String toString() {
        return "Company{" +
                "company='" + company + '\'' +
                '}';
    }

}
