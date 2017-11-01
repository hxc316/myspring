package my.spring.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by xc on 2017/10/30.
 */

@PropertySource("classpath:mm.properties")
@Component
public class PropertiesFile {

    @Autowired
    Environment env;

    public PropertiesFile(){}

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholer(){
        return new PropertySourcesPlaceholderConfigurer();
    }


//    @Bean
//    public PropertiesFile outProperties(){
//        System.out.println("name from properties :"+env.getProperty("name"));
//        System.out.println("word from properties :"+env.getProperty("word"));
//        return new PropertiesFile();
//    }
    @Bean
    public PropertiesFile outPropertiesByValue(@Value("${name}") String a, @Value("${word}") String b){
        System.out.println("name from properties by ${name} = "+ a);
        System.out.println("word from properties by ${word} ="+ b);
        return new PropertiesFile();
    }

//    @Bean
//    public PropertiesFile outPropertiesByValue2(@Value("#{name}") String a, @Value("#{word}") String b){
//        System.out.println("name from properties by #{name} = "+ a);
//        System.out.println("word from properties by #{word} ="+ b);
//        return new PropertiesFile();
//    }

}
