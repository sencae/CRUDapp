import DAO.DaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        DaoFactory impl = (DaoFactory) context.getBean("daoFactory");
        impl.getEmployeeDaoImpl().getEmployees();
    }
}
