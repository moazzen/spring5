package spring.dependency_injection;

/**
 * Created by MOAZEN on 8/18/2018.
 */
public class TextEditor_setter1 implements TextEditor{

    private SpellCheck spellCheck;

    public TextEditor_setter1() {
        System.out.println("TextEditor_setter1 Constructor");
    }

    public void setSpellCheck(SpellCheck spellCheck) {
        this.spellCheck = spellCheck;
    }

    public SpellCheck getSpellCheck() {
        return spellCheck;
    }

    public void spellCheck() {
        this.spellCheck.spellChecker();
        System.out.println(this.spellCheck.getClass());
    }
}
