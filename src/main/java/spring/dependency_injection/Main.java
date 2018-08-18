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

        Util.Util.separator();

        TextEditor textEditor3 = (TextEditor)context.getBean("textEditor3");
        textEditor3.spellCheck();

        Util.Util.separator();

        TextEditor textEditor4 = (TextEditor)context.getBean("textEditor4");
        textEditor4.spellCheck();

        Util.Util.separator();

        TextEditor textEditor5 = (TextEditor)context.getBean("textEditor5");
        textEditor5.spellCheck();
    }
}
