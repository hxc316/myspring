package my.spring.beancondition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by xc on 2017/10/31.
 */
public class MyBeanCondition implements Condition{

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env = conditionContext.getEnvironment();
        String[] profiles = env.getActiveProfiles();
        for (String f:profiles){
            System.out.println("MyBeanCondition Environment matches:" + f);
        }
        return true;
    }
}
