package spring.dependency_injection;

/**
 * Created by MOAZEN on 8/18/2018.
 */
public class SpellCheckImpl2 implements SpellCheck {
    public SpellCheckImpl2() {
        System.out.println("SpellCheck Constructor Impl2");
    }

    public void spellChecker() {
        System.out.println("SpellCheck Function Impl2");
    }
}
