package spring.annotation_based_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by MOAZEN on 8/18/2018.
 */
public class ComputerImpl1 implements Computer {

    private Keyboard keyboard;

    public ComputerImpl1() {
    }

    @Required
    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getKeyboardName() {
        String keyboardName = this.keyboard.getName();
        System.out.println(keyboardName);
        return keyboardName;
    }
}
