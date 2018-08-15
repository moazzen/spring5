package spring.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MOAZEN on 8/15/2018.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor textEditor = (TextEditor)context.getBean("textEditor");
        textEditor.spellCheck();

        Util.Util.separator();

        TextEditor textEditor2 = (TextEditor)context.getBean("textEditor2");
        textEditor2.spellCheck();
    }
}
