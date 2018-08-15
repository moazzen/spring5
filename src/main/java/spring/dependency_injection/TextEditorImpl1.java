package spring.dependency_injection;

/**
 * Created by MOAZEN on 8/15/2018.
 */
public class TextEditorImpl1 implements TextEditor {

    SpellCheck spellCheck;

    public TextEditorImpl1(SpellCheck spellCheck) {
        System.out.println("Text Editor Constructor.");;
        this.spellCheck = spellCheck;
    }

    public void spellCheck() {
        spellCheck.spellChecker();
    }
}
