import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.TestService;

/**
 * Created by ML3426 on 2015/9/17 0017.
 *
 * @author ML3426
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestService testService = (TestService)context.getBean("testService");
        testService.insert(5,"Potter");
    }
}
