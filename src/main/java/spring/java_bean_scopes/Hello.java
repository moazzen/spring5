package spring.java_bean_scopes;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Moazen on 8/14/2018.
 */
public interface Hello extends InitializingBean,DisposableBean {
    public void getMessage();
}
