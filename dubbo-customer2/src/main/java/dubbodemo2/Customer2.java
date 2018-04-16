package dubbodemo2;

import com.alibaba.dubbo.config.annotation.Reference;
import dubboApi.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Customer2 {


    // dubbo的注入注解可以注入static属性，而Spring的'@Autowired'、'@Resource'不可以注入static属性。
    // 因为Spring的注入是对于对象属性的注入，static是类属性，不是对象属性。
    // 再配置文件中加上<dubbo:annotation>，它会扫描所有注册bean的java类，
    // 发现带”@Reference”标签的属性，它会去寻找发布的provider是否有匹配的接口，有就自动注入。
    @Reference
    private static DemoService demoService;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-customer.xml");
        classPathXmlApplicationContext.start(); // 启动Spring容器,如果调用了getBean方法,容器默认就会随之启动,可以不显式的调用start方法

//        DemoService demoService = classPathXmlApplicationContext.getBean("demoService", DemoService.class);

        List<String> lists = demoService.getLists(555);
        System.out.println(lists);
    }
}
