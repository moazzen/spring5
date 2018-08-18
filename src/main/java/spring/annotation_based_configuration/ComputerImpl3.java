package spring.annotation_based_configuration;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by MOAZEN on 8/18/2018.
 */
public class ComputerImpl3 implements Computer {

    Keyboard keyboard;

    @Autowired
    public ComputerImpl3(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getKeyboardName() {
        String boardName = keyboard.getName();
        System.out.println(boardName);
        return boardName;
    }
}
