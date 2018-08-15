package spring.java_bean_scopes;

/**
 * Created by Moazen on 8/14/2018.
 */
public class HelloWorld implements Hello {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

    public void destroy() throws Exception {
        System.out.println("Destroy Object " + HelloWorld.class.getName());
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialize Object " + HelloWorld.class.getName());
    }
}
