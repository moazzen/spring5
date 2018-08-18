package spring.auto_wiring;

import Util.Util;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.security.auth.login.Configuration;

/**
 * Created by MOAZEN on 8/18/2018.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Movie movie = (Movie) context.getBean("movie");
        movie.checkSubtitle();

        Util.separator();

        Movie movie2 = (Movie) context.getBean("movie2");
        movie2.checkSubtitle();

    }
}
