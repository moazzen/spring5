package spring.java_bean_scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Moazen on 8/14/2018.
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();
        HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
        helloWorld2.getMessage();
        HelloWorld helloWorld3 = (HelloWorld) context.getBean("helloWorld");
        helloWorld3.getMessage();
    }
}
