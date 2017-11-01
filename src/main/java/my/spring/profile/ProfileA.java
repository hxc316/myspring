package my.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by xc on 2017/10/30.
 */
@Configuration
public class ProfileA {

    @Profile("test")
    @Bean
    public ProfileA a(){
        System.out.println("ProfileA create : test");
        return new ProfileA();
    }

    @Profile("dev")
    @Bean
    public ProfileA b(){
        System.out.println("ProfileB create : dev");
        return new ProfileA();
    }

}
