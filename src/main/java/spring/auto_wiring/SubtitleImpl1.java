package spring.auto_wiring;

/**
 * Created by MOAZEN on 8/18/2018.
 */
public class SubtitleImpl1 implements Subtitle {
    public SubtitleImpl1() {
        System.out.println("Constructor SubtitleImple1");
    }

    public boolean checkValidation() {
        return true;
    }
}
