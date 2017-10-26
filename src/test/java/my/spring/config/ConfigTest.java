package my.spring.config;

import my.spring.Aa1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xc on 2017/10/26.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
public class ConfigTest {

    @Autowired
    private Aa aa;

    @Autowired
    private Aa1 aa1;

    @Test
    public void test1(){
        aa.aa();
        aa1.aa1();
    }
}
