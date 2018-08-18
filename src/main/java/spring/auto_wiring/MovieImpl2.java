package spring.auto_wiring;

/**
 * Created by MOAZEN on 8/18/2018.
 */
public class MovieImpl2 implements Movie {
    Subtitle sub;

    public MovieImpl2() {
        System.out.println("Constructor MovieImpl2");
    }

    public void setSub(Subtitle sub) {
        this.sub = sub;
    }


    public boolean checkSubtitle() {
        System.out.println("MovieImpl2 checkSubtitle");
        return this.sub.checkValidation();
    }
}
