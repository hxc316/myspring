package my.spring.config;

import my.spring.beananotation.Bean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xc on 2017/10/26.
 */

@Configuration
@ComponentScan(basePackages = "my.spring")
public class MyConfig {

    @Bean
    public Bean1 let(Aa a){
        return new Bean1();
    }


}
