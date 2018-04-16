package dubbodemo2;

import dubboApi.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Customer2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-customer.xml");
//        classPathXmlApplicationContext.start(); 启动Spring容器,如果调用了getBean方法,容器默认就会随之启动,可以不显式的调用start方法

        DemoService demoService = classPathXmlApplicationContext.getBean("demoService", DemoService.class);

        List<String> lists = demoService.getLists(555);
        System.out.println(lists);
    }
}
