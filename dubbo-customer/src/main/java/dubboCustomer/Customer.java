package dubboCustomer;

import dubboApi.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-customer.xml");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("get demoService");
        System.out.println(demoService.getLists(666));


    }
}
