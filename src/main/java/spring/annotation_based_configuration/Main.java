package spring.annotation_based_configuration;

import Util.Util;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MOAZEN on 8/18/2018.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Computer computer = (Computer) context.getBean("computer");
        computer.getKeyboardName();

        Util.separator();

        Computer computer2 = (Computer) context.getBean("computer2");
        computer2.getKeyboardName();

        Util.separator();

        Computer computer3 = (Computer) context.getBean("computer3");
        computer3.getKeyboardName();

        Util.separator();

        Computer computer4 = (Computer) context.getBean("computer4");
        computer4.getKeyboardName();

        Util.separator();

        Office office = (Office) context.getBean("office");
        office.getKeyboadTypeOfComputer();
    }
}
