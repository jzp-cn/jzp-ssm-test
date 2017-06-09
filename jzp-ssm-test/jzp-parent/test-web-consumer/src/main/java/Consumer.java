import com.cl.user.servicei.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/6/9.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml"});
        UserService service=(UserService)context.getBean("userService");
        String s = service.sayHello();
        System.out.println(s);
    }
}
