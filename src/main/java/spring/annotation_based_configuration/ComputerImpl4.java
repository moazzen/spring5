package spring.annotation_based_configuration;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by MOAZEN on 8/18/2018.
 */
public class ComputerImpl4 implements Computer {

    @Autowired(required = false)
    Keyboard keyboard;

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getKeyboardName() {
        if (keyboard == null) {
            System.out.println("keyboard is null");
            return null;
        } else {
            String keyBoard = keyboard.getName();
            System.out.println(keyBoard);
            return keyBoard;
        }
    }
}
