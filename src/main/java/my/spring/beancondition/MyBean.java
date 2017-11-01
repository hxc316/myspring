package my.spring.beancondition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by xc on 2017/10/31.
 */
@Component
@Primary
public class MyBean {

    @Bean
    @Conditional(MyBeanCondition.class)
    public MyBean create(){
        System.out.println("crate bean by my condition");
        return new MyBean();
    }
}
