package dubboCustomer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zqsign.centre.arbitrate.external.ArbitrateService;
import dubboApi.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.net.URISyntaxException;

public class Customer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-customer.xml");

        DemoService demoService = context.getBean(DemoService.class);

        System.out.println("get demoService");

        System.out.println(demoService.getLists(666));

    }
}
