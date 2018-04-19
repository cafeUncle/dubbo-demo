package dubboProvider2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider2 {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("spring-provider2.xml");

        classPathXmlApplicationContext.start(); // 显式getBean时可以不手动调用start来启动容器

        System.out.println("provider2启动");

        System.in.read();
    }
}
