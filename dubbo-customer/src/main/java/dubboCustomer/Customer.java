package dubboCustomer;

import dubboApi.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Customer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-customer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getLists(666));


    }
}
