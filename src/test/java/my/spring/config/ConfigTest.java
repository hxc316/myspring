package my.spring.config;

import my.spring.Aa1;
import my.spring.profile.PropertiesFile;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xc on 2017/10/26.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyConfig.class)
@ActiveProfiles("test")
public class ConfigTest {

    @Autowired
    private Aa aa;

    @Autowired
    private Aa1 aa1;

    @Autowired
    PropertiesFile propertiesFile;

    @BeforeClass
    public static void mm(){
        System.setProperty("path.url","d:/");
    }

    @Test
    public void test1(){
        aa.aa();
        aa1.aa1();
    }
}
