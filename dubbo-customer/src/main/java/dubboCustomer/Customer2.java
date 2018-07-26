package dubboCustomer;

import com.zqsign.centre.arbitrate.external.ArbitrateService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.net.URISyntaxException;

public class Customer2 {

    public static void main(String[] args) throws IOException, URISyntaxException {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-customer.xml");

        ArbitrateService arbitrateService = context.getBean("arbitrateService", ArbitrateService.class);

        System.out.println(arbitrateService.helloApi("hello").getCode());
        System.out.println(arbitrateService.helloApi("hello").getCode());
        System.out.println(arbitrateService.helloApi("hello").getCode());
        System.out.println(arbitrateService.helloApi("hello").getCode());
        System.out.println(arbitrateService.helloApi("hello").getCode());
    }
}
