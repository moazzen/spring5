package spring.dependency_injection;

/**
 * Created by MOAZEN on 8/15/2018.
 */
public class TextEditorImpl2 implements TextEditor {

    private SpellCheck spellCheck;

    public TextEditorImpl2(String str, SpellCheck spellCheck) {
        System.out.println(str);
        this.spellCheck = spellCheck;
    }

    public void spellCheck() {
        spellCheck.spellChecker();
    }
}
