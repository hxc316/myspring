package my.spring.beananotation;

import my.spring.config.MyConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by xc on 2017/10/26.
 */
@Configuration
@Import(MyConfig.class)
@ImportResource("classpath:dd.xml")
public class BeanImportConfig {

    @Bean
    public Bean2 create(){
        return new Bean2();
    }

}
