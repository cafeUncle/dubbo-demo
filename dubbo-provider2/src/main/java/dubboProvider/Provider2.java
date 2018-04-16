package dubboProvider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider2 {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-provider.xml");

        classPathXmlApplicationContext.start();

        System.out.println("provider2启动");

        System.in.read();
    }
}
