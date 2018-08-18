package spring.annotation_based_configuration;

/**
 * Created by MOAZEN on 8/18/2018.
 */
public class KeyboardType1 implements Keyboard {
    public KeyboardType1() {
        System.out.println("Keyboard type1");
    }

    public String getName() {
        return "type1";
    }
}
