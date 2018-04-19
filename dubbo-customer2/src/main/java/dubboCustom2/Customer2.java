package dubboCustom2;

import com.alibaba.dubbo.config.annotation.Reference;
import dubboApi.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Customer2 {

    // 因为Spring的注入是对于对象属性的注入，而static是类属性，不是对象属性。
    // dubbo的@Reference注解可以注入static属性，而Spring的'@Autowired'、'@Resource'不可以
    @Reference(version = "1.0")
    private static DemoService demoService;

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("spring-customer2.xml");
        classPathXmlApplicationContext.start(); // 显式调用getBean方法时可以不手动start容器

        List<String> lists = demoService.getLists(555);

        System.out.println(lists);
    }
}