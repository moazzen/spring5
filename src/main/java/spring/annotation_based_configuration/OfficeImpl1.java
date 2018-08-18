package spring.annotation_based_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by MOAZEN on 8/18/2018.
 */
public class OfficeImpl1 implements Office {
    @Autowired
    @Qualifier("computer2")
    Computer comp;
    public String getKeyboadTypeOfComputer() {
        String keyboard = comp.getKeyboardName();
        System.out.println("getKeyboadTypeOfComputer " + keyboard);
        return keyboard;
    }
}
