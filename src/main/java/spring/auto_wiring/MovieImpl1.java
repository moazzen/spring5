package spring.auto_wiring;

/**
 * Created by MOAZEN on 8/18/2018.
 */
public class MovieImpl1 implements Movie {
    Subtitle subtitle;

    public MovieImpl1() {
        System.out.println("Constructor MovieImpl1");
    }

    public void setSubtitle(Subtitle subtitle) {
        this.subtitle = subtitle;
    }

    public boolean checkSubtitle() {
        System.out.println("Checking Subtitle ...");
        return subtitle.checkValidation();
    }
}
