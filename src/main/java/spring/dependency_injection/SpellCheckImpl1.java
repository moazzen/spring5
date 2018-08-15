package spring.dependency_injection;

/**
 * Created by MOAZEN on 8/15/2018.
 */
public class SpellCheckImpl1 implements SpellCheck {
    public SpellCheckImpl1() {
        System.out.println("SpellCheck Constructor");
    }

    public void spellChecker() {
        System.out.println("SpellCheck Function");
    }
}
