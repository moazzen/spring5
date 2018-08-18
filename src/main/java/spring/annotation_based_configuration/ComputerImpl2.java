package spring.annotation_based_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by MOAZEN on 8/18/2018.
 */
public class ComputerImpl2 implements Computer {

    /*with using @Autowired Annotation on top of property there is no need for define setter method*/

    @Autowired
    @Qualifier("keyboard2")
    Keyboard board;
    public String getKeyboardName() {
        String boardName = board.getName();
        System.out.println(boardName);
        return boardName;
    }
}
