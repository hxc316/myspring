package my.spring.beananotation;

import my.spring.config.ConfigTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xc on 2017/10/26.
 */

public class Bean1Test extends ConfigTest {

    @Autowired
    private Bean1 bean1;
    @Autowired
    private Bean2 bean2;

    @Test
    public void test01(){
        bean1.mm();
        bean2.out();
    }
}
